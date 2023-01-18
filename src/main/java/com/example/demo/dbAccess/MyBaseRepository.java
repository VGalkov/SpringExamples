package com.example.demo.dbAccess;

import jakarta.persistence.Entity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface MyBaseRepository extends CrudRepository<ExampleEntity, UUID> {

    ExampleEntityrud JPA & simple Sec getById(UUID uuid);
}
