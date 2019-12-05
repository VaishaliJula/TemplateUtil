package com.util.template.Entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

/**
 * @author P2784664
 */
public class NotificationRequestParamsEntityPK implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String notificationId;
    private int paramId;
    private String hasChildElement;
    private String isChildElement;

    @Column(name = "NOTIFICATION_ID", nullable = false, length = 40)
    @Id
    public String getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(String notificationId) {
        this.notificationId = notificationId;
    }

    @Column(name = "PARAM_ID", nullable = false, precision = 0)
    @Id
    public int getParamId() {
        return paramId;
    }

    public void setParamId(int paramId) {
        this.paramId = paramId;
    }

    @Column(name = "HAS_CHILD_ELEMENT", nullable = false, length = 1)
    @Id
    public String getHasChildElement() {
        return hasChildElement;
    }

    public void setHasChildElement(String hasChildElement) {
        this.hasChildElement = hasChildElement;
    }

    @Column(name = "IS_CHILD_ELEMENT", nullable = false, length = 1)
    @Id
    public String getIsChildElement() {
        return isChildElement;
    }

    public void setIsChildElement(String isChildElement) {
        this.isChildElement = isChildElement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NotificationRequestParamsEntityPK that = (NotificationRequestParamsEntityPK) o;
        return paramId == that.paramId &&
                Objects.equals(notificationId, that.notificationId) &&
                Objects.equals(hasChildElement, that.hasChildElement) &&
                Objects.equals(isChildElement, that.isChildElement);
    }

    @Override
    public int hashCode() {

        return Objects.hash(notificationId, paramId, hasChildElement, isChildElement);
    }
}
