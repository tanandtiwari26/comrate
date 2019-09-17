package com.example.dao;

import org.neo4j.ogm.session.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class CompanyDaoImpl implements CompanyDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public String addCompany() {
//		sessionFactory.openSession().beginTransaction();
//		sessionFactory.openSession().query(arg0, arg1);
		return null;
	}

	@Override
	public String setRelationship() {
		return null;
	}

}
