package com.example.dao;

import java.util.Collection;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.entity.Company;

@Repository
public interface CompanyDao extends Neo4jRepository<Company, Long> {

	@Query("MATCH (m:Movie)<-[r:ACTED_IN]-(a:Person) RETURN m, r, a LIMIT {limit}")
	Collection<Company> graph(@Param("limit") int limit);

	@Query("Match(a)-[r:{relation}*{level}]-(n) where a.companyno = {companyno} return n")
	Collection<Company> graph(@Param("relation") String relation, @Param("level") int level,
			@Param("companyno") String companyno);

}
