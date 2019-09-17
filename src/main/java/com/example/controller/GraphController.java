package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.httpEntity.CompanyDto;
import com.example.httpEntity.MessageResponse;
import com.example.service.CompanyService;

@RestController
public class GraphController {

	@Autowired
	private CompanyService graphService;

	@PostMapping()
	public @ResponseBody MessageResponse addCompany(@RequestBody CompanyDto company, BindingResult bindingResult) {
		MessageResponse messageResponse = new MessageResponse();
		graphService.addCompany(company);
		return messageResponse;
	}

	@PostMapping()
	public @ResponseBody MessageResponse setRelation() {
		MessageResponse messageResponse = new MessageResponse();
		graphService.setRelationship();
		return messageResponse;
	}

	@PostMapping()
	public @ResponseBody MessageResponse getRelationMember() {
		MessageResponse messageResponse = new MessageResponse();
		graphService.setRelationship();
		return messageResponse;
	}

}
