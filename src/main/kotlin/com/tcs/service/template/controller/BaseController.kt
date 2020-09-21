package com.tcs.service.template.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import com.tcs.service.template.service.BaseService
import org.springframework.http.ResponseEntity
import com.tcs.service.template.model.BaseModel
import org.springframework.web.bind.annotation.RequestMethod

@RestController
@RequestMapping("/api/v1")
class BaseController (private val service: BaseService){
	
	@RequestMapping(value = ["/getModel"], method = [RequestMethod.GET])
	fun getBaseModel() : ResponseEntity<BaseModel> {
		
		return ResponseEntity.ok(service.getBaseModel())
	}
}