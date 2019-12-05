package com.util.template.Entity;

import javax.persistence.*;

import java.util.Objects;

/**
 * @author P2784664
 */
@Entity
@Table(name = "TEMPLATES_TEST", schema = "GRAPEVINE", catalog = "")
@IdClass(TemplatesEntityPK.class)
public class MessagesTemplateEntity {
    private String templateId;
    private String summary;
    private String fromtn;
    private String principal;
    private String channels;
    private String content;
    private String category;
    private String subject;
    private String defaultPhoneNo;
    private String defaultEmail;
    private String isCritical;
    private String isScheduled;
    private String fromSleepTime;
    private String toSleepTime;
    private String priority;
    private String hasAttachment;
    private String freeField1;
    private String freeField2;
    private String freeField3;
    private String delFlg;
    private String environment;
    private String version;
    private String subjectFormatRequired;
    private String modId;
    private String creId;
    private String resendFlg;

    @Id
    @Column(name = "TEMPLATE_ID", nullable = false, length = 40)
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    @Basic
    @Column(name = "SUMMARY", nullable = true, length = 160)
    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    @Basic
    @Column(name = "FROMTN", nullable = true, length = 15)
    public String getFromtn() {
        return fromtn;
    }

    public void setFromtn(String fromtn) {
        this.fromtn = fromtn;
    }

    @Basic
    @Column(name = "PRINCIPAL", nullable = true, length = 100)
    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    @Basic
    @Column(name = "CHANNELS", nullable = true, length = 100)
    public String getChannels() {
        return channels;
    }

    public void setChannels(String channels) {
        this.channels = channels;
    }

    @Basic
    @Column(name = "CONTENT", nullable = true, length = 1000)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "CATEGORY", nullable = true, length = 100)
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Basic
    @Column(name = "SUBJECT", nullable = true, length = 160)
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Basic
    @Column(name = "DEFAULT_PHONE_NO", nullable = true, length = 250)
    public String getDefaultPhoneNo() {
        return defaultPhoneNo;
    }

    public void setDefaultPhoneNo(String defaultPhoneNo) {
        this.defaultPhoneNo = defaultPhoneNo;
    }

    @Basic
    @Column(name = "DEFAULT_EMAIL", nullable = true, length = 250)
    public String getDefaultEmail() {
        return defaultEmail;
    }

    public void setDefaultEmail(String defaultEmail) {
        this.defaultEmail = defaultEmail;
    }

    @Basic
    @Column(name = "IS_CRITICAL", nullable = false, length = 1)
    public String getIsCritical() {
        return isCritical;
    }

    public void setIsCritical(String isCritical) {
        this.isCritical = isCritical;
    }

    @Basic
    @Column(name = "IS_SCHEDULED", nullable = false, length = 1)
    public String getIsScheduled() {
        return isScheduled;
    }

    public void setIsScheduled(String isScheduled) {
        this.isScheduled = isScheduled;
    }

    @Basic
    @Column(name = "FROM_SLEEP_TIME", nullable = true, length = 255)
    public String getFromSleepTime() {
        return fromSleepTime;
    }

    public void setFromSleepTime(String fromSleepTime) {
        this.fromSleepTime = fromSleepTime;
    }

    @Basic
    @Column(name = "TO_SLEEP_TIME", nullable = true, length = 255)
    public String getToSleepTime() {
        return toSleepTime;
    }

    public void setToSleepTime(String toSleepTime) {
        this.toSleepTime = toSleepTime;
    }

    @Basic
    @Column(name = "PRIORITY", nullable = false, length = 1)
    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    @Basic
    @Column(name = "HAS_ATTACHMENT", nullable = false, length = 1)
    public String getHasAttachment() {
        return hasAttachment;
    }

    public void setHasAttachment(String hasAttachment) {
        this.hasAttachment = hasAttachment;
    }

    @Basic
    @Column(name = "FREE_FIELD_1", nullable = true, length = 250)
    public String getFreeField1() {
        return freeField1;
    }

    public void setFreeField1(String freeField1) {
        this.freeField1 = freeField1;
    }

    @Basic
    @Column(name = "FREE_FIELD_2", nullable = true, length = 250)
    public String getFreeField2() {
        return freeField2;
    }

    public void setFreeField2(String freeField2) {
        this.freeField2 = freeField2;
    }

    @Basic
    @Column(name = "FREE_FIELD_3", nullable = true, length = 250)
    public String getFreeField3() {
        return freeField3;
    }

    public void setFreeField3(String freeField3) {
        this.freeField3 = freeField3;
    }

    @Basic
    @Column(name = "DEL_FLG", nullable = false, length = 1)
    public String getDelFlg() {
        return delFlg;
    }

    public void setDelFlg(String delFlg) {
        this.delFlg = delFlg;
    }

    @Id
    @Column(name = "ENVIRONMENT", nullable = false, length = 100)
    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    @Basic
    @Column(name = "VERSION", nullable = true, length = 100)
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Basic
    @Column(name = "SUBJECT_FORMAT_REQUIRED", nullable = false, length = 1)
    public String getSubjectFormatRequired() {
        return subjectFormatRequired;
    }

    public void setSubjectFormatRequired(String subjectFormatRequired) {
        this.subjectFormatRequired = subjectFormatRequired;
    }

    @Basic
    @Column(name = "MOD_ID", nullable = true, length = 100)
    public String getModId() {
        return modId;
    }

    public void setModId(String modId) {
        this.modId = modId;
    }

    @Basic
    @Column(name = "CRE_ID", nullable = true, length = 100)
    public String getCreId() {
        return creId;
    }

    public void setCreId(String creId) {
        this.creId = creId;
    }

    @Basic
    @Column(name = "RESEND_FLG", nullable = true, length = 1)
    public String getResendFlg() {
        return resendFlg;
    }

    public void setResendFlg(String resendFlg) {
        this.resendFlg = resendFlg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MessagesTemplateEntity that = (MessagesTemplateEntity) o;
        return Objects.equals(templateId, that.templateId) &&
                Objects.equals(summary, that.summary) &&
                Objects.equals(fromtn, that.fromtn) &&
                Objects.equals(principal, that.principal) &&
                Objects.equals(channels, that.channels) &&
                Objects.equals(content, that.content) &&
                Objects.equals(category, that.category) &&
                Objects.equals(subject, that.subject) &&
                Objects.equals(defaultPhoneNo, that.defaultPhoneNo) &&
                Objects.equals(defaultEmail, that.defaultEmail) &&
                Objects.equals(isCritical, that.isCritical) &&
                Objects.equals(isScheduled, that.isScheduled) &&
                Objects.equals(fromSleepTime, that.fromSleepTime) &&
                Objects.equals(toSleepTime, that.toSleepTime) &&
                Objects.equals(priority, that.priority) &&
                Objects.equals(hasAttachment, that.hasAttachment) &&
                Objects.equals(freeField1, that.freeField1) &&
                Objects.equals(freeField2, that.freeField2) &&
                Objects.equals(freeField3, that.freeField3) &&
                Objects.equals(delFlg, that.delFlg) &&
                Objects.equals(environment, that.environment) &&
                Objects.equals(version, that.version) &&
                Objects.equals(subjectFormatRequired, that.subjectFormatRequired) &&
                Objects.equals(modId, that.modId) &&
                Objects.equals(creId, that.creId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(templateId, summary, fromtn, principal, channels, content, category, subject, defaultPhoneNo, defaultEmail, isCritical, isScheduled, fromSleepTime, toSleepTime, priority, hasAttachment, freeField1, freeField2, freeField3, delFlg, environment, version, subjectFormatRequired, modId, creId);
    }
}

