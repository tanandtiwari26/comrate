package com.example.config;

import org.neo4j.driver.v1.AuthTokens;
import org.neo4j.driver.v1.Driver;
import org.neo4j.driver.v1.GraphDatabase;
import org.neo4j.ogm.config.Configuration.Builder;
import org.neo4j.ogm.session.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.data.neo4j.transaction.Neo4jTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages = { "com.example.service", "com.example.controller" })
@EnableNeo4jRepositories(basePackages = "com.example.dao")
@EnableTransactionManagement
public class DataSourceConfiguration {

	public static final String URL = System.getenv("NEO4J_URL") != null ? System.getenv("NEO4J_URL")
			: "http://neo4j:movies@localhost:7474";

	@Bean
	public org.neo4j.ogm.config.Configuration getConfiguration() {
		// Driver asd = GraphDatabase.driver(uri, AuthTokens.basic(user,
		// password));
		org.neo4j.ogm.config.Configuration config = new Builder().uri(URL).credentials("", "").connectionPoolSize(10)
				.build();
		return config;
	}

	@Bean
	public SessionFactory getSessionFactory() {
		return new SessionFactory(getConfiguration(), "com.baeldung.spring.data.neo4j.domain");
	}

	@Bean
	public Neo4jTransactionManager transactionManager() {
		return new Neo4jTransactionManager(getSessionFactory());
	}
}