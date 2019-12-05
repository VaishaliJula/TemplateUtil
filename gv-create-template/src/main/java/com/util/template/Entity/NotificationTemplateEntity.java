package com.util.template.Entity;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author P2784664
 */
@Entity
@Table(name = "NOTIFICATIONS_TEMPLATES_TEST", schema = "GRAPEVINE", catalog = "")
public class NotificationTemplateEntity {
    private String notificationId;
    private String templateId;
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

    @Basic
    @Column(name = "TEMPLATE_ID", nullable = true, length = 40)
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NotificationTemplateEntity that = (NotificationTemplateEntity) o;
        return Objects.equals(notificationId, that.notificationId) &&
                Objects.equals(templateId, that.templateId) &&
                Objects.equals(freeField1, that.freeField1) &&
                Objects.equals(freeField2, that.freeField2) &&
                Objects.equals(freeField3, that.freeField3) &&
                Objects.equals(delFlg, that.delFlg) &&
                Objects.equals(modId, that.modId) &&
                Objects.equals(creId, that.creId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(notificationId, templateId, freeField1, freeField2, freeField3, delFlg, modId, creId);
    }
}
