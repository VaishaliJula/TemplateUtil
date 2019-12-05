package com.util.template.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.util.template.Entity.NotificationRequestParamsEntity;

@Repository
public interface NotificationRequestParamRepository extends JpaRepository<NotificationRequestParamsEntity, 
String>{

	List<NotificationRequestParamsEntity> findByNotificationIdOrderByParamIdAsc(String notificationId);
}
