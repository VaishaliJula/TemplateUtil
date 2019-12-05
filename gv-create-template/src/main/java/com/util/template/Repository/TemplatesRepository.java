package com.util.template.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.util.template.Entity.MessagesTemplateEntity;

@Repository
public interface TemplatesRepository extends JpaRepository<MessagesTemplateEntity, String>{

	MessagesTemplateEntity findByTemplateId(String templateId);
}
