package com.example.demo.dbTransactional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.demo.dbTransactional")
public class ManagingTransactionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManagingTransactionsApplication.class, args);
	}

}
