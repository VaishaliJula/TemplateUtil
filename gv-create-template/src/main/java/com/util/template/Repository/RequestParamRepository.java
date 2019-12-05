package com.util.template.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.util.template.Entity.RequestParamsEntity;

@Repository
public interface RequestParamRepository extends JpaRepository<RequestParamsEntity, String>{
	
	RequestParamsEntity findByParamName(@Param("paramName") String paramName);
	
	List<RequestParamsEntity> findByParamIdInOrderByParamIdAsc(List<Integer> paramId);
}
