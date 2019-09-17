package com.example.service;

import org.springframework.stereotype.Service;

import com.example.httpEntity.CompanyDto;

@Service
public interface CompanyService {

	String addCompany(CompanyDto company);

	String setRelationship();
}
