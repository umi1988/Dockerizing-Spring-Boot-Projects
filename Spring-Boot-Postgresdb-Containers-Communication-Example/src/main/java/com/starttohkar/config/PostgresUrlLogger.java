package com.starttohkar.config;

//public class MongoUrlLogger {
//}


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PostgresUrlLogger implements CommandLineRunner {

    // In 2026, Spring Boot uses 'spring.datasource.url' for JDBC connections
    @Value("${spring.datasource.url}")
    private String postgresUrl;

    @Override
    public void run(String... args) throws Exception {
        // This will print: jdbc:postgresql://postgres-db:5432/mydatabase
        System.out.println("POSTGRES JDBC URL: " + postgresUrl);
    }
}