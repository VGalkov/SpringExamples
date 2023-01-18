package com.example.demo.dbAccess;

import jakarta.persistence.Entity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AccessingDataJpaApplication {

    private static final Logger log = LoggerFactory.getLogger(AccessingDataJpaApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(AccessingDataJpaApplication.class);
    }


    @Bean
    public CommandLineRunner demo(MyBaseRepository repository) {
        return (args) -> {
            // save entities
            repository.save(new ExampleEntity("one 1"));
            repository.save(new ExampleEntity("one 2"));
            repository.save(new ExampleEntity("one 3"));
            repository.save(new ExampleEntity("one 4"));
            repository.save(new ExampleEntity("one 5"));


            // fetch all customers
            log.info("Customers found with findAll():");
            log.info("-------------------------------");
            for (ExampleEntity exampleEntity : repository.findAll()) {
                log.info(exampleEntity.toString());
                System.out.println(exampleEntity.toString());
            }
        };
    }


}
