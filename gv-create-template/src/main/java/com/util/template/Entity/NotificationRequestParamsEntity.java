package com.util.template.Entity;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author P2784664
 */
@Entity
@Table(name = "NOTIFICATION_REQUEST_PARAMS_T", schema = "GRAPEVINE", catalog = "")
@IdClass(NotificationRequestParamsEntityPK.class)
public class NotificationRequestParamsEntity {
    private String notificationId;
    private int paramId;
    private String hasChildElement;
    private String isChildElement;
    private String rootId;
    private String isFormatRequired;
    private String formatType;
    private String oldFormat;
    private String newFormat;
    private String freeField1;
    private String freeField2;
    private String freeField3;
    private String delFlg;
    private String modId;
    private String creId;

    @Id
    @Column(name = "NOTIFICATION_ID", nullable = false, length = 40)
    public String getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(String notificationId) {
        this.notificationId = notificationId;
    }

    @Id
    @Column(name = "PARAM_ID", nullable = false, precision = 0)
    public int getParamId() {
        return paramId;
    }

    public void setParamId(int paramId) {
        this.paramId = paramId;
    }

    @Id
    @Column(name = "HAS_CHILD_ELEMENT", nullable = false, length = 1)
    public String getHasChildElement() {
        return hasChildElement;
    }

    public void setHasChildElement(String hasChildElement) {
        this.hasChildElement = hasChildElement;
    }

    @Id
    @Column(name = "IS_CHILD_ELEMENT", nullable = false, length = 1)
    public String getIsChildElement() {
        return isChildElement;
    }

    public void setIsChildElement(String isChildElement) {
        this.isChildElement = isChildElement;
    }

    @Basic
    @Column(name = "ROOT_ID", nullable = true, length = 250)
    public String getRootId() {
        return rootId;
    }

    public void setRootId(String rootId) {
        this.rootId = rootId;
    }

    @Basic
    @Column(name = "IS_FORMAT_REQUIRED", nullable = false, length = 1)
    public String getIsFormatRequired() {
        return isFormatRequired;
    }

    public void setIsFormatRequired(String isFormatRequired) {
        this.isFormatRequired = isFormatRequired;
    }

    @Basic
    @Column(name = "FORMAT_TYPE", nullable = true, length = 100)
    public String getFormatType() {
        return formatType;
    }

    public void setFormatType(String formatType) {
        this.formatType = formatType;
    }

    @Basic
    @Column(name = "OLD_FORMAT", nullable = true, length = 100)
    public String getOldFormat() {
        return oldFormat;
    }

    public void setOldFormat(String oldFormat) {
        this.oldFormat = oldFormat;
    }

    @Basic
    @Column(name = "NEW_FORMAT", nullable = true, length = 100)
    public String getNewFormat() {
        return newFormat;
    }

    public void setNewFormat(String newFormat) {
        this.newFormat = newFormat;
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

    @Basic
    @Column(name = "MOD_ID", nullable = true, length = 45)
    public String getModId() {
        return modId;
    }

    public void setModId(String modId) {
        this.modId = modId;
    }

    @Basic
    @Column(name = "CRE_ID", nullable = true, length = 45)
    public String getCreId() {
        return creId;
    }

    public void setCreId(String creId) {
        this.creId = creId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NotificationRequestParamsEntity that = (NotificationRequestParamsEntity) o;
        return paramId == that.paramId &&
                Objects.equals(notificationId, that.notificationId) &&
                Objects.equals(hasChildElement, that.hasChildElement) &&
                Objects.equals(isChildElement, that.isChildElement) &&
                Objects.equals(rootId, that.rootId) &&
                Objects.equals(isFormatRequired, that.isFormatRequired) &&
                Objects.equals(formatType, that.formatType) &&
                Objects.equals(oldFormat, that.oldFormat) &&
                Objects.equals(newFormat, that.newFormat) &&
                Objects.equals(freeField1, that.freeField1) &&
                Objects.equals(freeField2, that.freeField2) &&
                Objects.equals(freeField3, that.freeField3) &&
                Objects.equals(delFlg, that.delFlg) &&
                Objects.equals(modId, that.modId) &&
                Objects.equals(creId, that.creId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(notificationId, paramId, hasChildElement, isChildElement, rootId, isFormatRequired, formatType, oldFormat, newFormat, freeField1, freeField2, freeField3, delFlg, modId, creId);
    }
}
