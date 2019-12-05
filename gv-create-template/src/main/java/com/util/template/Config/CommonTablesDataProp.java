package com.util.template.Config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@PropertySource("classpath:application.properties")
@ConfigurationProperties(prefix="common.param")
public class CommonTablesDataProp {

	String isvisible;
	String description;
	String baseparamname;
	String freefield1;
	String freefield2;
	String freefield3;
	String delflg;
	String modid;
	String creid;
	String fromTn;
	String category;
	String defaultPhoneNo;
	String defaultEmail;
	String isCritical;
	String isScheduled;
	String fromSleepTime;
	String toSleepTime;
	String priority;
	String environment;
	String version;
	String subjectFormatRequired;
	String resendFlg;
	
	String haschildelement;
	String ischildelement;
	String isformatrequired;
	String formattype;
	String oldformat;
	String newformat;
	String rootid;
	
	
	public String getRootid() {
		return rootid;
	}

	public void setRootid(String rootid) {
		this.rootid = rootid;
	}

	public String getHaschildelement() {
		return haschildelement;
	}

	public void setHaschildelement(String haschildelement) {
		this.haschildelement = haschildelement;
	}

	public String getIschildelement() {
		return ischildelement;
	}

	public void setIschildelement(String ischildelement) {
		this.ischildelement = ischildelement;
	}

	public String getIsformatrequired() {
		return isformatrequired;
	}

	public void setIsformatrequired(String isformatrequired) {
		this.isformatrequired = isformatrequired;
	}

	public String getFormattype() {
		return formattype;
	}

	public void setFormattype(String formattype) {
		this.formattype = formattype;
	}

	public String getOldformat() {
		return oldformat;
	}

	public void setOldformat(String oldformat) {
		this.oldformat = oldformat;
	}

	public String getNewformat() {
		return newformat;
	}

	public void setNewformat(String newformat) {
		this.newformat = newformat;
	}

	public String getIsvisible() {
		return isvisible;
	}

	public void setIsvisible(String isvisible) {
		this.isvisible = isvisible;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBaseparamname() {
		return baseparamname;
	}

	public void setBaseparamname(String baseparamname) {
		this.baseparamname = baseparamname;
	}

	public String getFreefield1() {
		return freefield1;
	}

	public void setFreefield1(String freefield1) {
		this.freefield1 = freefield1;
	}

	public String getFreefield2() {
		return freefield2;
	}

	public void setFreefield2(String freefield2) {
		this.freefield2 = freefield2;
	}

	public String getFreefield3() {
		return freefield3;
	}

	public void setFreefield3(String freefield3) {
		this.freefield3 = freefield3;
	}

	public String getDelflg() {
		return delflg;
	}

	public void setDelflg(String delflg) {
		this.delflg = delflg;
	}

	public String getModid() {
		return modid;
	}

	public void setModid(String modid) {
		this.modid = modid;
	}

	public String getCreid() {
		return creid;
	}

	public void setCreid(String creid) {
		this.creid = creid;
	}

	public String getFromTn() {
		return fromTn;
	}

	public void setFromTn(String fromTn) {
		this.fromTn = fromTn;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDefaultPhoneNo() {
		return defaultPhoneNo;
	}

	public void setDefaultPhoneNo(String defaultPhoneNo) {
		this.defaultPhoneNo = defaultPhoneNo;
	}

	public String getDefaultEmail() {
		return defaultEmail;
	}

	public void setDefaultEmail(String defaultEmail) {
		this.defaultEmail = defaultEmail;
	}

	public String getIsCritical() {
		return isCritical;
	}

	public void setIsCritical(String isCritical) {
		this.isCritical = isCritical;
	}

	public String getIsScheduled() {
		return isScheduled;
	}

	public void setIsScheduled(String isScheduled) {
		this.isScheduled = isScheduled;
	}

	public String getFromSleepTime() {
		return fromSleepTime;
	}

	public void setFromSleepTime(String fromSleepTime) {
		this.fromSleepTime = fromSleepTime;
	}

	public String getToSleepTime() {
		return toSleepTime;
	}

	public void setToSleepTime(String toSleepTime) {
		this.toSleepTime = toSleepTime;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getSubjectFormatRequired() {
		return subjectFormatRequired;
	}

	public void setSubjectFormatRequired(String subjectFormatRequired) {
		this.subjectFormatRequired = subjectFormatRequired;
	}

	public String getResendFlg() {
		return resendFlg;
	}

	public void setResendFlg(String resendFlg) {
		this.resendFlg = resendFlg;
	}
}

