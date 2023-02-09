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
@Table (name="genders")
public class GeneroEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name ="id_genero")
    Long idgenero;

    @Column(name="genero")
    String genero;

    

    // @OneToMany(mappedBy ="genero")
    // private List<Animal> animals;

    public GeneroEntity(String genero) {
        this.genero = genero;
    }

    public Long getIdgenero() {
        return idgenero;
    }

    public void setIdgenero(Long idgenero) {
        this.idgenero = idgenero;
    }

    
   

    
}