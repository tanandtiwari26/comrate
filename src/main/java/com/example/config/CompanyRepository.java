package com.example.config;

import java.util.Collection;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.entity.Company;

@Repository
public interface CompanyRepository extends Neo4jRepository<Company, Long> {

	Company save(Company company);
	
	Company findByCompanyNo(@Param("companyNo") String companyNo);

	@Query("MATCH (c:Company) WHERE c.companyNo =~ ('(?i).*'+{companyNo}+'.*') RETURN c")
	Collection<Company> findByCompanyNoContaining(@Param("companyNo") String companyNo);

//	@Query("MATCH (m:Movie)<-[:ACTED_IN]-(a:Person) RETURN m.title as movie, collect(a.name) as cast LIMIT {limit}")
//	List<Map<String, Object>> graph(@Param("limit") int limit);
}