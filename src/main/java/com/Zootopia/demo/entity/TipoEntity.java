package com.Zootopia.demo.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.Zootopia.demo.entity.Animal;


@Entity
@Table (name="types")
public class TipoEntity {

@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
@Column (name="id_type")
Long idType;

@Column(name="type")
String type;


// @OneToMany(mappedBy ="type")
//     private List<Animal> animals;


public Long getIdType() {
    return idType;
}

public TipoEntity(String type) {
    this.type = type;
}

public void setIdType(Long idType) {
    this.idType = idType;
}

public String getType() {
    return type;
}

public void setType(String type) {
    this.type = type;
}

// public Animal getAnimal() {
//     return animal;
// }

// public void setAnimal(Animal animal) {
//     this.animal = animal;
// }

// public TipoEntity(Animal animal) {
//     this.animal = animal;
// }



  

    // @OneToMany(mappedBy ="tipoEntity")
    // private List<TipoEntity> typeAnimal;

    
}
