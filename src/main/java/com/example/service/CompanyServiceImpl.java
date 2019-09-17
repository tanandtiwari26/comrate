package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.dao.CompanyDao;
import com.example.entity.Company;
import com.example.httpEntity.CompanyDto;

public class CompanyServiceImpl implements CompanyService {

	@Autowired
	private CompanyDao companyDao;

	@Override
	public String addCompany(CompanyDto companyDto) {
//		Company company = new Company();
//		company.setCompanyNo(companyDto.getCompanyNo());
//		company = companyDao.save(company);
		return null;
	}

	@Override
	public String setRelationship() {
		return null;
	}
}
