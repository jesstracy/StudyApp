package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.*;
import org.h2.tools.Server;


@SpringBootApplication
public class StudyAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudyAppApplication.class, args);
	}
}
