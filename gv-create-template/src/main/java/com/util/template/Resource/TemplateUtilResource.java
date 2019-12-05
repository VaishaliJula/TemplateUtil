package com.util.template.Resource;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.util.template.Entity.MessagesTemplateEntity;
import com.util.template.Entity.NotificationTemplateEntity;
import com.util.template.Exceptions.TemplateUtilException;
import com.util.template.Service.TemplateUtilService;
import com.util.template.commons.ErrorCode;


@RestController
@RequestMapping("api")
public class TemplateUtilResource {

    private static final Logger LOGGER = LogManager.getLogger(TemplateUtilResource.class);

    @Autowired
    private TemplateUtilService templateUtilService;

    /**
     * @param templateId
     * @param payloadData
     * @param templateRequirementsExcelData
     * @throws IOException
     */
    @SuppressWarnings("resource")
	@PostMapping(value = "/collect/{templateId}")
    @Transactional
    @ApiOperation(value = "Template Util Data", notes = "Collect data from various sources", response = String.class)
    public ResponseEntity<InputStreamResource> fetchData(@ApiParam(value = "Template ID", required = true) @PathVariable("templateId") String templateId,
                                            @ApiParam(value = "Template Payload Body", required = true) @RequestParam("payloadData") String payloadData,
                                            @ApiParam(value = "Excel Data", required = true) @RequestParam("templateRequirementsExcelData") MultipartFile templateRequirementsExcelData) throws IOException {

    	ByteArrayInputStream in = null;
	    HttpHeaders headers = null;
        try {

            XSSFWorkbook xssfWorkbook = new XSSFWorkbook(templateRequirementsExcelData.getInputStream());
            XSSFSheet templatesSheet = xssfWorkbook.getSheetAt(0);
            MessagesTemplateEntity messagesTemplateEntity = new MessagesTemplateEntity();
            NotificationTemplateEntity notificationTemplateEntity = new NotificationTemplateEntity();

		    XSSFRow row = templatesSheet.getRow(1);
		    if (!templateId.equalsIgnoreCase(row.getCell(0).getStringCellValue())) {
				throw new TemplateUtilException("TemplateId is not same as the one in the Excel", ErrorCode.TemplateIdMismatch);
			}
		    templateUtilService.buildMessageTemplate(row, messagesTemplateEntity, templateId);
		    templateUtilService.buildNotificationTemplate(row, notificationTemplateEntity);
		    List<Integer> newlyInsertedParamIdsList = templateUtilService.buildNotificationRequestParams(payloadData, row.getCell(0).getStringCellValue());
		    LOGGER.info("Created Template Utility");
		    
		    
		    in = templateUtilService.downloadTemplateDataToExcel(templateId, newlyInsertedParamIdsList);
		    String fileName = templateId + ".xlsx";
		    headers = new HttpHeaders();
		    headers.add("Content-Disposition", "attachment; filename="+fileName);

        } catch (Exception e) {
            LOGGER.error("General Exception {}", e);
        }
        return ResponseEntity
                .ok()
                .contentType(MediaType.parseMediaType("application/octet-stream"))
                .headers(headers)
                .body(new InputStreamResource(in));
    }

    
    /**
     * @param templateId
     * @return
     * @throws IOException
     */
/*    @GetMapping(value = "/download/customers.xlsx")
    public ResponseEntity<InputStreamResource> excelCustomersReport(@ApiParam(value = "Template ID", required = true) 
    @RequestParam("templateId") String templateId) throws IOException {

    	ByteArrayInputStream in = null;
	    HttpHeaders headers = null;
	    try {
			in = templateUtilService.downloadTemplateDataToExcel(templateId);
		    String fileName = templateId + ".xlsx";
		    headers = new HttpHeaders();
		    headers.add("Content-Disposition", "attachment; filename="+fileName);
	    
		} catch (Exception e) {
			e.printStackTrace();
	}
    return ResponseEntity
                  .ok()
                  .contentType(MediaType.parseMediaType("application/octet-stream"))
                  .headers(headers)
                  .body(new InputStreamResource(in));
    }*/
}
