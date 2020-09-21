package com.tcs.service.template.service

import org.springframework.stereotype.Service
import com.tcs.service.template.model.BaseModel

@Service
class BaseService {
	
	fun getBaseModel() : BaseModel {
		
		return BaseModel();
	}
}