package com.util.template.Util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.util.template.Entity.MessagesTemplateEntity;
import com.util.template.Entity.NotificationRequestParamsEntity;
import com.util.template.Entity.NotificationTemplateEntity;
import com.util.template.Entity.RequestParamsEntity;

public class TemplateInsertionXlsView {

	/**
	 * @param templateEntity
	 * @param notificationTemplateEntity
	 * @param notificationRequestParamsEntitiesList
	 * @return
	 * @throws IOException
	 */
	public ByteArrayInputStream templateDataToExcel(
			MessagesTemplateEntity templateEntity, NotificationTemplateEntity notificationTemplateEntity,
			List<NotificationRequestParamsEntity> notificationRequestParamsEntitiesList,
			List<RequestParamsEntity> requestParamsEntitiesList)
			throws IOException {
		String[] templateColumns = { "TEMPLATE_ID", "SUMMARY", "FROMTN",
				"PRINCIPAL", "CHANNELS", "CONTENT", "CATEGORY", "SUBJECT",
				"DEFAULT_PHONE_NO", "DEFAULT_EMAIL", "IS_CRITICAL",
				"IS_SCHEDULED", "FROM_SLEEP_TIME", "TO_SLEEP_TIME", "PRIORITY",
				"HAS_ATTACHMENT", "FREE_FIELD_1", "FREE_FIELD_2",
				"FREE_FIELD_3", "DEL_FLG", "ENVIRONMENT", "VERSION",
				"SUBJECT_FORMAT_REQUIRED", "MOD_ID", "CRE_ID", "RESEND_FLG", };

		Workbook workbook = new XSSFWorkbook();
		ByteArrayOutputStream out = new ByteArrayOutputStream();

		Sheet templateSheet = workbook.createSheet("TEMPLATE");
		new TemplateInsertionXlsView().addNotificationTemplateData(workbook,
				notificationTemplateEntity);
		new TemplateInsertionXlsView().addRequestParamData(workbook, requestParamsEntitiesList);
		new TemplateInsertionXlsView().addNotificationRequestParamData(workbook, 
				notificationRequestParamsEntitiesList);

		Font headerFont = workbook.createFont();
		headerFont.setBold(true);
		headerFont.setColor(IndexedColors.BLUE.getIndex());

		CellStyle headerCellStyle = workbook.createCellStyle();
		headerCellStyle.setFont(headerFont);

		// Row for Header
		Row templateHeaderRow = templateSheet.createRow(0);

		// Header
		for (int col = 0; col < templateColumns.length; col++) {
			Cell cell = templateHeaderRow.createCell(col);
			cell.setCellValue(templateColumns[col]);
			cell.setCellStyle(headerCellStyle);
		}

		// CellStyle for Age
		// CellStyle ageCellStyle = workbook.createCellStyle();
		// ageCellStyle.setDataFormat(createHelper.createDataFormat().getFormat("#"));
		Row templateRow = templateSheet.createRow(1);

		templateRow.createCell(0).setCellValue(templateEntity.getTemplateId());
		templateRow.createCell(1).setCellValue(templateEntity.getSummary());
		templateRow.createCell(2).setCellValue(templateEntity.getFromtn());
		templateRow.createCell(3).setCellValue(templateEntity.getPrincipal());
		templateRow.createCell(4).setCellValue(templateEntity.getChannels());
		templateRow.createCell(5).setCellValue(templateEntity.getContent());
		templateRow.createCell(6).setCellValue(templateEntity.getCategory());
		templateRow.createCell(7).setCellValue(templateEntity.getSubject());
		templateRow.createCell(8).setCellValue(
				templateEntity.getDefaultPhoneNo());
		templateRow.createCell(9)
				.setCellValue(templateEntity.getDefaultEmail());
		templateRow.createCell(10).setCellValue(templateEntity.getIsCritical());
		templateRow.createCell(11)
				.setCellValue(templateEntity.getIsScheduled());
		templateRow.createCell(12).setCellValue(
				templateEntity.getFromSleepTime());
		templateRow.createCell(13)
				.setCellValue(templateEntity.getToSleepTime());
		templateRow.createCell(14).setCellValue(templateEntity.getPriority());
		templateRow.createCell(15).setCellValue(
				templateEntity.getHasAttachment());
		templateRow.createCell(16).setCellValue(templateEntity.getFreeField1());
		templateRow.createCell(17).setCellValue(templateEntity.getFreeField2());
		templateRow.createCell(18).setCellValue(templateEntity.getFreeField3());
		templateRow.createCell(19).setCellValue(templateEntity.getDelFlg());
		templateRow.createCell(20)
				.setCellValue(templateEntity.getEnvironment());
		templateRow.createCell(21).setCellValue(templateEntity.getVersion());
		templateRow.createCell(22).setCellValue(
				templateEntity.getSubjectFormatRequired());
		templateRow.createCell(23).setCellValue(templateEntity.getModId());
		templateRow.createCell(24).setCellValue(templateEntity.getCreId());
		templateRow.createCell(25).setCellValue(templateEntity.getResendFlg());

		// Cell ageCell = row.createCell(3);
		// ageCell.setCellValue(20);
		// ageCell.setCellStyle(ageCellStyle);
		// }

		// Row for Header
		workbook.write(out);
		return new ByteArrayInputStream(out.toByteArray());
	}

	/**
	 * @param workbook
	 * @param notificationTemplateEntity
	 */
	private void addNotificationTemplateData(Workbook workbook,
			NotificationTemplateEntity notificationTemplateEntity) {
		String[] notificationTemplateColumns = { "NOTIFICATION_ID",
				"TEMPLATE_ID", "FREE_FIELD_1", "FREE_FIELD_2", "FREE_FIELD_3",
				"DEL_FLG", "MOD_ID", "CRE_ID" };

		Font headerFont = workbook.createFont();
		headerFont.setBold(true);
		headerFont.setColor(IndexedColors.BLUE.getIndex());

		CellStyle headerCellStyle = workbook.createCellStyle();
		headerCellStyle.setFont(headerFont);

		Sheet notificationTemplateSheet = workbook.createSheet("NOTIFICATION_TEMPLATE");
		// Row for Header
		Row notificationTemplateHeaderRow = notificationTemplateSheet
				.createRow(0);

		for (int col = 0; col < notificationTemplateColumns.length; col++) {
			Cell cell = notificationTemplateHeaderRow.createCell(col);
			cell.setCellValue(notificationTemplateColumns[col]);
			cell.setCellStyle(headerCellStyle);
		}

		Row notificationTemplateRow = notificationTemplateSheet
				.createRow(1);

		notificationTemplateRow.createCell(0).setCellValue(
				notificationTemplateEntity.getNotificationId());
		notificationTemplateRow.createCell(1).setCellValue(
				notificationTemplateEntity.getTemplateId());
		notificationTemplateRow.createCell(2).setCellValue(
				notificationTemplateEntity.getFreeField1());
		notificationTemplateRow.createCell(3).setCellValue(
				notificationTemplateEntity.getFreeField2());
		notificationTemplateRow.createCell(4).setCellValue(
				notificationTemplateEntity.getFreeField3());
		notificationTemplateRow.createCell(5).setCellValue(
				notificationTemplateEntity.getDelFlg());
		notificationTemplateRow.createCell(6).setCellValue(
				notificationTemplateEntity.getModId());
		notificationTemplateRow.createCell(7).setCellValue(
				notificationTemplateEntity.getCreId());

	}
	
	/**
	 * @param workbook
	 * @param requestParamsEntityList
	 */
	private void addRequestParamData(Workbook workbook,
			List<RequestParamsEntity> requestParamsEntityList) {
		
		String[] requestParamsColumns = { "PARAM_ID", "PARAM_NAME",
				"PARAM_TYPE", "DEFAULT_VALUE", "IS_VISIBLE", "DESCRIPTION",
				"BASE_PARAM_NAME", "FREE_FIELD_1", "FREE_FIELD_2",
				"FREE_FIELD_3", "DEL_FLG", "MOD_ID", "CRE_ID" };

		Font headerFont = workbook.createFont();
		headerFont.setBold(true);
		headerFont.setColor(IndexedColors.BLUE.getIndex());

		CellStyle headerCellStyle = workbook.createCellStyle();
		headerCellStyle.setFont(headerFont);

		Sheet requestParamSheet = workbook.createSheet("REQUEST_PARAMS");
		
		// Row for Header
		Row requestParamHeaderRow = requestParamSheet.createRow(0);

		for (int col = 0; col < requestParamsColumns.length; col++) {
			Cell cell = requestParamHeaderRow.createCell(col);
			cell.setCellValue(requestParamsColumns[col]);
			cell.setCellStyle(headerCellStyle);
		}

		int rowIdx = 1;
		for(RequestParamsEntity requestParamsEntity: requestParamsEntityList){

			Row requestParamRow = requestParamSheet
					.createRow(rowIdx++);
	
			requestParamRow.createCell(0).setCellValue(
					requestParamsEntity.getParamId());
			requestParamRow.createCell(1).setCellValue(
					requestParamsEntity.getParamName());
			requestParamRow.createCell(2).setCellValue(
					requestParamsEntity.getParamType());
			requestParamRow.createCell(3).setCellValue(
					requestParamsEntity.getDefaultValue());
			requestParamRow.createCell(4).setCellValue(
					requestParamsEntity.getIsVisible());
			requestParamRow.createCell(5).setCellValue(
					requestParamsEntity.getDescription());
			requestParamRow.createCell(6).setCellValue(
					requestParamsEntity.getBaseParamName());
			requestParamRow.createCell(7).setCellValue(
					requestParamsEntity.getFreeField1());
			requestParamRow.createCell(8).setCellValue(
					requestParamsEntity.getFreeField2());
			requestParamRow.createCell(9).setCellValue(
					requestParamsEntity.getFreeField3());
			requestParamRow.createCell(10).setCellValue(
					requestParamsEntity.getDelFlg());
			requestParamRow.createCell(11).setCellValue(
					requestParamsEntity.getModId());
			requestParamRow.createCell(12).setCellValue(
					requestParamsEntity.getCreId());
		}
	}
	
	/**
	 * @param workbook
	 * @param notificationRequestParamsEntityList
	 */
	private void addNotificationRequestParamData(Workbook workbook,
			List<NotificationRequestParamsEntity> notificationRequestParamsEntityList) {
		String[] notificationRequestParamsColumns = { "NOTIFICATION_ID",
				"PARAM_ID", "HAS_CHILD_ELEMENT", "IS_CHILD_ELEMENT", "ROOT_ID",
				"IS_FORMAT_REQUIRED", "FORMAT_TYPE", "OLD_FORMAT",
				"NEW_FORMAT", "FREE_FIELD_1", "FREE_FIELD_2", "FREE_FIELD_3",
				"DEL_FLG", "MOD_ID", "CRE_ID" };

		Font headerFont = workbook.createFont();
		headerFont.setBold(true);
		headerFont.setColor(IndexedColors.BLUE.getIndex());

		CellStyle headerCellStyle = workbook.createCellStyle();
		headerCellStyle.setFont(headerFont);

		Sheet notificationRequestParamSheet = workbook
				.createSheet("NOTIFICATION_REQUEST_PARAMS");

		// Row for Header
		Row notificationRequestParamHeaderRow = notificationRequestParamSheet
				.createRow(0);

		for (int col = 0; col < notificationRequestParamsColumns.length; col++) {
			Cell cell = notificationRequestParamHeaderRow.createCell(col);
			cell.setCellValue(notificationRequestParamsColumns[col]);
			cell.setCellStyle(headerCellStyle);
		}
		
		int rowIdx = 1;
		for (NotificationRequestParamsEntity notificationRequestParamsEntities : notificationRequestParamsEntityList) {
			Row notificationTemplateRow = notificationRequestParamSheet
					.createRow(rowIdx++);
			notificationTemplateRow.createCell(0).setCellValue(notificationRequestParamsEntities.getNotificationId());
			notificationTemplateRow.createCell(1).setCellValue(notificationRequestParamsEntities.getParamId());
			notificationTemplateRow.createCell(2).setCellValue(notificationRequestParamsEntities.getHasChildElement());
			notificationTemplateRow.createCell(3).setCellValue(notificationRequestParamsEntities.getIsChildElement());
			notificationTemplateRow.createCell(4).setCellValue(notificationRequestParamsEntities.getRootId());
			notificationTemplateRow.createCell(5).setCellValue(notificationRequestParamsEntities.getIsFormatRequired());
			notificationTemplateRow.createCell(6).setCellValue(notificationRequestParamsEntities.getFormatType());
			notificationTemplateRow.createCell(7).setCellValue(notificationRequestParamsEntities.getOldFormat());
			notificationTemplateRow.createCell(8).setCellValue(notificationRequestParamsEntities.getNewFormat());
			notificationTemplateRow.createCell(9).setCellValue(notificationRequestParamsEntities.getFreeField1());
			notificationTemplateRow.createCell(10).setCellValue(notificationRequestParamsEntities.getFreeField2());
			notificationTemplateRow.createCell(11).setCellValue(notificationRequestParamsEntities.getFreeField3());
			notificationTemplateRow.createCell(12).setCellValue(notificationRequestParamsEntities.getDelFlg());
			notificationTemplateRow.createCell(13).setCellValue(notificationRequestParamsEntities.getModId());
			notificationTemplateRow.createCell(14).setCellValue(notificationRequestParamsEntities.getCreId());
		}
	}
}
