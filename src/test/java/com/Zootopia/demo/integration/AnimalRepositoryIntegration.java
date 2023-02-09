package com.Zootopia.demo.integration;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.Date;
import java.util.List;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import com.Zootopia.demo.entity.Animal;
import com.Zootopia.demo.entity.FamilyEntity;
import com.Zootopia.demo.repository.AnimalRepository;

@DataJpaTest
public class AnimalRepositoryIntegration {

    @Autowired
    AnimalRepository repository;

    @Autowired
    EntityManager entityManager;

    @Test
    public void testAnimal() {
        Animal animal = new Animal("Pepe", Date.valueOf("2008-12-01"));
        assertEquals("Pepe", animal.getName());
        assertEquals(Date.valueOf("2008-12-01"), animal.getDate());
    }

    @Test
    public void testAnimalHaveFamily() {
        
        Animal animals = repository.findById(1L).orElse(null);
        assertEquals("Pepe",animals.getName());


    }

}
