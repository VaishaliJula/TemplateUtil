package com.util.template.Service;


import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.util.template.Config.CommonTablesDataProp;
import com.util.template.Entity.MessagesTemplateEntity;
import com.util.template.Entity.NotificationRequestParamsEntity;
import com.util.template.Entity.NotificationTemplateEntity;
import com.util.template.Entity.RequestParamsEntity;
import com.util.template.Repository.NotificationRequestParamRepository;
import com.util.template.Repository.NotificationTemplateRepository;
import com.util.template.Repository.RequestParamRepository;
import com.util.template.Repository.TemplatesRepository;
import com.util.template.Util.TemplateInsertionXlsView;


/**
 * @author Mayank.Mittal
 *
 */
@Service
public class TemplateUtilService {

	private static final Logger LOGGER = LogManager.getLogger(TemplateUtilService.class);

	@Autowired
	TemplatesRepository templatesRepository;

	@Autowired
	NotificationTemplateRepository notificationTemplateRepository;

	@Autowired
	RequestParamRepository requestParamRepository;
	
	@Autowired
	CommonTablesDataProp commonTablesDataProp;

	@Autowired
	NotificationRequestParamRepository notificationRequestParamRepository;

	/**
	 * @param row
	 * @param messagesTemplateEntity
	 */
	public void buildMessageTemplate(XSSFRow row, MessagesTemplateEntity messagesTemplateEntity, String templateId) throws Exception {

		try {
			String templateIdExcel = row.getCell(0).getStringCellValue();
			
			LOGGER.info("Constructing Message_Template");
			messagesTemplateEntity.setTemplateId(row.getCell(0).getStringCellValue());
			messagesTemplateEntity.setSummary(row.getCell(5).getStringCellValue());
			messagesTemplateEntity.setFromtn(commonTablesDataProp.getFromTn());
			messagesTemplateEntity.setPrincipal(row.getCell(7).getStringCellValue());
			messagesTemplateEntity.setChannels("[\"" + row.getCell(3).getStringCellValue() + "\"]");
			messagesTemplateEntity.setContent(row.getCell(6).getStringCellValue());
			messagesTemplateEntity.setCategory(commonTablesDataProp.getCategory());
			messagesTemplateEntity.setSubject(row.getCell(8).getStringCellValue());
			messagesTemplateEntity.setDefaultPhoneNo(commonTablesDataProp.getDefaultPhoneNo());
			messagesTemplateEntity.setDefaultEmail(commonTablesDataProp.getDefaultEmail());
			messagesTemplateEntity.setIsCritical(commonTablesDataProp.getIsCritical());
			messagesTemplateEntity.setIsScheduled(commonTablesDataProp.getIsScheduled());
			messagesTemplateEntity.setFromSleepTime(commonTablesDataProp.getFromSleepTime());
			messagesTemplateEntity.setToSleepTime(commonTablesDataProp.getToSleepTime());
			messagesTemplateEntity.setPriority(commonTablesDataProp.getPriority());
			messagesTemplateEntity.setHasAttachment(row.getCell(4).getStringCellValue());
			messagesTemplateEntity.setFreeField1(commonTablesDataProp.getFreefield1());
			messagesTemplateEntity.setFreeField2(commonTablesDataProp.getFreefield2());
			messagesTemplateEntity.setFreeField3(commonTablesDataProp.getFreefield3());
			messagesTemplateEntity.setDelFlg(commonTablesDataProp.getDelflg());
			messagesTemplateEntity.setEnvironment(commonTablesDataProp.getEnvironment());
			messagesTemplateEntity.setVersion(commonTablesDataProp.getVersion());
			messagesTemplateEntity.setSubjectFormatRequired(commonTablesDataProp.getSubjectFormatRequired());
			messagesTemplateEntity.setModId(commonTablesDataProp.getModid());
			messagesTemplateEntity.setCreId(commonTablesDataProp.getCreid());
			messagesTemplateEntity.setResendFlg(commonTablesDataProp.getResendFlg());
			LOGGER.info("Trying to Save Message_Templates to DB");
			templatesRepository.saveAndFlush(messagesTemplateEntity);

		} catch (Exception ex) {
			LOGGER.error("Attempt to build Message_Templates failed {}", ex.getMessage());
			throw new Exception(ex.getMessage());

		}
	}

	/**
	 * @param row
	 * @param notificationTemplateEntity
	 */
	public void buildNotificationTemplate(XSSFRow row, NotificationTemplateEntity notificationTemplateEntity) {

		try {
			LOGGER.info("Constructing Notification_Template ");
			notificationTemplateEntity.setNotificationId(row.getCell(0).getStringCellValue());
			notificationTemplateEntity.setTemplateId(row.getCell(0).getStringCellValue());
			notificationTemplateEntity.setFreeField1(commonTablesDataProp.getFreefield1());
			notificationTemplateEntity.setFreeField2(commonTablesDataProp.getFreefield2());
			notificationTemplateEntity.setFreeField3(commonTablesDataProp.getFreefield3());
			notificationTemplateEntity.setDelFlg(commonTablesDataProp.getDelflg());
			notificationTemplateEntity.setModId(commonTablesDataProp.getModid());
			notificationTemplateEntity.setCreId(commonTablesDataProp.getCreid());
			LOGGER.info("Trying to Save Notification_Templates to DB");

	    	notificationTemplateRepository.saveAndFlush(notificationTemplateEntity);

		} catch (Exception ex) {
			LOGGER.error("Attempt to build Notification_Templates failed {}", ex.getMessage());

		}
	}

	/**
	 * @param msg
	 * @param notificationId
	 */
	public List<Integer> buildNotificationRequestParams(String msg, String notificationId) {
		Map<String, List<Integer>> paramIdsMap = fetchRequestParamIds(msg);
		List<Integer> paramIdsList = paramIdsMap.get("ParamIdsList");
        LOGGER.info(paramIdsList);

        try{
			NotificationRequestParamsEntity notificationRequestParamsEntity = new NotificationRequestParamsEntity();

			for(int paramId: paramIdsList){

				LOGGER.info("Constructing  Notification_Request_Params");
				notificationRequestParamsEntity.setNotificationId(notificationId);
				notificationRequestParamsEntity.setParamId(paramId);
				notificationRequestParamsEntity.setHasChildElement(commonTablesDataProp.getHaschildelement());
				notificationRequestParamsEntity.setIsChildElement(commonTablesDataProp.getIschildelement());
				notificationRequestParamsEntity.setRootId(commonTablesDataProp.getRootid());
				notificationRequestParamsEntity.setIsFormatRequired(commonTablesDataProp.getIsformatrequired());
				notificationRequestParamsEntity.setFormatType(commonTablesDataProp.getFormattype());
				notificationRequestParamsEntity.setOldFormat(commonTablesDataProp.getOldformat());
				notificationRequestParamsEntity.setNewFormat(commonTablesDataProp.getNewformat());
				notificationRequestParamsEntity.setFreeField1(commonTablesDataProp.getFreefield1());
				notificationRequestParamsEntity.setFreeField2(commonTablesDataProp.getFreefield2());
				notificationRequestParamsEntity.setFreeField3(commonTablesDataProp.getFreefield3());
				notificationRequestParamsEntity.setDelFlg(commonTablesDataProp.getDelflg());
				notificationRequestParamsEntity.setModId(commonTablesDataProp.getModid());
				notificationRequestParamsEntity.setCreId(commonTablesDataProp.getCreid());
				LOGGER.info("Trying to Save Notification_Request_Params to DB");

				notificationRequestParamRepository.saveAndFlush(notificationRequestParamsEntity);
			}
		}catch (Exception ex){
			LOGGER.error("Attempt to build Notification_Request_Params failed {}", ex.getMessage());
		}
        return paramIdsMap.get("NewlyInsertedParamIds");
	}

	
	/**
	 * @param msg
	 * @return
	 */
	private Map<String, List<Integer>> fetchRequestParamIds(String msg) {
		int paramId = 0;
		Map<String, List<Integer>> paramIdMap = new HashMap<String, List<Integer>>(); 
		List<Integer> newlyInsertedParamIdsList = new ArrayList<Integer>();
		List<Integer> allParamIdsList = new ArrayList<Integer>();
		JsonParser parser = new JsonParser();
		JsonElement jsonTree = parser.parse(msg);
		RequestParamsEntity requestParamEntity = null;
		if (jsonTree.isJsonObject()) {
			JsonObject jsonObject = jsonTree.getAsJsonObject().get("messageParams").getAsJsonObject();
			Set<Map.Entry<String, JsonElement>> entries = jsonObject.entrySet();
			
			for (Map.Entry<String, JsonElement> entry: entries) {
				LOGGER.info(entry.getKey());
				requestParamEntity = requestParamRepository.findByParamName(entry.getKey());
				if(requestParamEntity != null){
					paramId = requestParamRepository.findByParamName(entry.getKey()).getParamId();
				}else{
					
					requestParamEntity = new RequestParamsEntity();
					requestParamEntity.setParamName(entry.getKey()); //1
					Object paramNameObj = jsonObject.get(entry.getKey());
					LOGGER.info("value : "+paramNameObj);
//					if(entry.getValue().equals(true) || entry.getValue().equals(false)){
//						requestParamEntity.setParamType("boolean");
//						requestParamEntity.setDefaultValue(paramNameObj.toString());
//					}else{
						requestParamEntity.setParamType("String");//2
						requestParamEntity.setDefaultValue(paramNameObj.toString().replaceAll("^\"|\"$", ""));//3
//					}
						requestParamEntity.setIsVisible(commonTablesDataProp.getIsvisible());//4
						requestParamEntity.setDescription(commonTablesDataProp.getDescription());//5
						requestParamEntity.setBaseParamName(commonTablesDataProp.getBaseparamname());//6
						requestParamEntity.setFreeField1(commonTablesDataProp.getFreefield1());//7
						requestParamEntity.setFreeField2(commonTablesDataProp.getFreefield2());//8
						requestParamEntity.setFreeField3(commonTablesDataProp.getFreefield3());//9
						requestParamEntity.setDelFlg(commonTablesDataProp.getDelflg());//10
						requestParamEntity.setModId(commonTablesDataProp.getModid());//11
						requestParamEntity.setCreId(commonTablesDataProp.getCreid());//12
					    LOGGER.info("Trying to Save Request_Params to DB");
						
						requestParamRepository.saveAndFlush(requestParamEntity);
						paramId = requestParamEntity.getParamId();
						newlyInsertedParamIdsList.add(paramId);
				}
				allParamIdsList.add(paramId);
//				paramIdList.add(paramId);
			}
			
			paramIdMap.put("ParamIdsList", allParamIdsList);
			paramIdMap.put("NewlyInsertedParamIds", newlyInsertedParamIdsList);
			
		}
		
		return paramIdMap;
	}
	
	
	/**
	 * @param tmpId
	 * @param newlyInsertedParamIds
	 * @return
	 * @throws Exception
	 */
	public ByteArrayInputStream downloadTemplateDataToExcel(String tmpId, List<Integer> newlyInsertedParamIds) throws Exception{
		MessagesTemplateEntity messagesTemplateEntity = templatesRepository.findByTemplateId(tmpId);
		NotificationTemplateEntity notificationTemplateEntity = notificationTemplateRepository.findByTemplateId(tmpId);
		List<NotificationRequestParamsEntity> notificationRequestParamsEntitiesList = 
				notificationRequestParamRepository.findByNotificationIdOrderByParamIdAsc(tmpId);
		List<RequestParamsEntity> requestParamsEntitiesList = 
				requestParamRepository.findByParamIdInOrderByParamIdAsc(newlyInsertedParamIds);
				
		return new TemplateInsertionXlsView().templateDataToExcel(messagesTemplateEntity, notificationTemplateEntity,
				notificationRequestParamsEntitiesList, requestParamsEntitiesList);
	}
}
