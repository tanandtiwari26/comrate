package com.example.dao;

import org.neo4j.ogm.session.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.neo4j.transaction.Neo4jTransactionManager;

public class CompanyDaoImpl 
//implements CompanyDao
{

	@Autowired
	private SessionFactory sessionFactory;

	@Autowired
	private Neo4jTransactionManager neo4jTransactionManager;

//	@Override
//	public String addCompany() {
////		sessionFactory.openSession().beginTransaction();
////		sessionFactory.openSession().query(arg0, arg1);
//		return null;
//	}
//
//	@Override
//	public String setRelationship() {
//		return null;
//	}

}
