package com.bibliotheque.api;

import java.sql.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@SpringBootApplication(scanBasePackages = {"com.bibliotheque.api.repository"})
public class ApiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Class.forName("org.postgresql.Driver");
		Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/library","postgres","Gospel34.");
		System.out.println(conn);

		String query = "SELECT * FROM livre";

		ResultSet results;

		try {
			Statement stmt = conn.createStatement();

			results = stmt.executeQuery(query);
			while(results.next()){
				System.out.println(results.getString(1)); }
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
