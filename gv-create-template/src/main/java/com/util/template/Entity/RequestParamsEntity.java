package com.util.template.Entity;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author P2784664
 */
@Entity
@Table(name = "REQUEST_PARAMS_TEST", schema = "GRAPEVINE", catalog = "")
public class RequestParamsEntity implements Serializable{
   	
	private static final long serialVersionUID = 1L;

	private Integer paramId;
	private String paramName;
	private String paramType;
	private String defaultValue;
	private String isVisible;
	private String description;
	private String baseParamName;
	private String freeField1;
	private String freeField2;
	private String freeField3;
	private String delFlg;
	private String modId;
	private String creId;
	
	@Id
	@Column(name="PARAM_ID", nullable = false, length = 10)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "param_seq")
	@SequenceGenerator(sequenceName = "PARAM_ID_SEQ", allocationSize = 1, name = "param_seq")
	public Integer getParamId() {
		return paramId;
	}
	
	public void setParamId(Integer paramId) {
		this.paramId = paramId;
	}
	
	@Basic
	@Column(name="PARAM_NAME", nullable = false, length=250)
	public String getParamName() {
		return paramName;
	}
	
	public void setParamName(String paramName) {
		this.paramName = paramName;
	}
	
	@Basic
	@Column(name="PARAM_TYPE", nullable = false, length=100)
	public String getParamType() {
		return paramType;
	}
	
	public void setParamType(String paramType) {
		this.paramType = paramType;
	}
	
	@Basic
	@Column(name="DEFAULT_VALUE", nullable=true, length=250)
	public String getDefaultValue() {
		return defaultValue;
	}
	
	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}
	
	@Basic
	@Column(name="IS_VISIBLE", nullable=true, length=1)
	public String getIsVisible() {
		return isVisible;
	}
	
	public void setIsVisible(String isVisible) {
		this.isVisible = isVisible;
	}
	
	@Basic
	@Column(name="DESCRIPTION", nullable=true, length=250)
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Basic
	@Column(name="BASE_PARAM_NAME", nullable=true, length=250)
	public String getBaseParamName() {
		return baseParamName;
	}
	
	public void setBaseParamName(String baseParamName) {
		this.baseParamName = baseParamName;
	}
	
	@Basic
	@Column(name="FREE_FIELD_1", nullable=true, length=250)
	public String getFreeField1() {
		return freeField1;
	}
	
	public void setFreeField1(String freeField1) {
		this.freeField1 = freeField1;
	}
	
	@Basic
	@Column(name="FREE_FIELD_2", nullable=true, length=250)
	public String getFreeField2() {
		return freeField2;
	}
	
	public void setFreeField2(String freeField2) {
		this.freeField2 = freeField2;
	}
	
	@Basic
	@Column(name="FREE_FIELD_3", nullable=true, length=250)
	public String getFreeField3() {
		return freeField3;
	}
	
	public void setFreeField3(String freeField3) {
		this.freeField3 = freeField3;
	}
	
	@Basic
	@Column(name="DEL_FLG", nullable=false, length=1)
	public String getDelFlg() {
		return delFlg;
	}
	
	public void setDelFlg(String delFlg) {
		this.delFlg = delFlg;
	}
	
	@Basic
	@Column(name="MOD_ID", nullable=true, length=250)
	public String getModId() {
		return modId;
	}
	
	public void setModId(String modId) {
		this.modId = modId;
	}
	
	@Basic
	@Column(name="CRE_ID", nullable=true, length=250)
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
        RequestParamsEntity that = (RequestParamsEntity) o;
        return paramId == that.paramId &&
                Objects.equals(paramName, that.paramName) &&
                Objects.equals(paramType, that.paramType) &&
                Objects.equals(defaultValue, that.defaultValue) &&
                Objects.equals(isVisible, that.isVisible) &&
                Objects.equals(description, that.description) &&
                Objects.equals(baseParamName, that.baseParamName) &&
                Objects.equals(freeField1, that.freeField1) &&
                Objects.equals(freeField2, that.freeField2) &&
                Objects.equals(freeField3, that.freeField3) &&
                Objects.equals(delFlg, that.delFlg) &&
                Objects.equals(modId, that.modId) &&
                Objects.equals(creId, that.creId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(paramId, paramName, paramType, defaultValue, isVisible, description, baseParamName, freeField1, freeField2, freeField3, delFlg, modId, creId);
    }
}
