package com.Zootopia.demo.entity;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.Zootopia.demo.entity.AnimalEntity.Animal;

public class PaisEntity {


    @ManyToOne
    @JoinColumn (name ="id_pais")
    private AnimalEntity animalEntity;

    
}