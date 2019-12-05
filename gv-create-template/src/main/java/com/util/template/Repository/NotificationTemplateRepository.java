package com.util.template.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.util.template.Entity.NotificationTemplateEntity;

@Repository
public interface NotificationTemplateRepository extends JpaRepository<NotificationTemplateEntity, 
	String>{
	
	NotificationTemplateEntity findByTemplateId(String templateId);

}
