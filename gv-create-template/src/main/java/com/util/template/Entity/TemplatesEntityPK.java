package com.util.template.Entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class TemplatesEntityPK implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String templateId;
    private String environment;

    @Column(name = "TEMPLATE_ID", nullable = false, length = 40)
    @Id
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    @Column(name = "ENVIRONMENT", nullable = false, length = 100)
    @Id
    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TemplatesEntityPK that = (TemplatesEntityPK) o;
        return Objects.equals(templateId, that.templateId) &&
                Objects.equals(environment, that.environment);
    }

    @Override
    public int hashCode() {

        return Objects.hash(templateId, environment);
    }
}
