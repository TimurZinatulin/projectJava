package com.example.projectJava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectJavaApplication.class, args);
		java.util.logging.Logger.getGlobal().info("Server started");
	}

}
