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
@Table (name ="family")
public class FamilyEntity {

    @Id
    @ GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="id_family")
    Long idFamily;

    @Column (name="family")
    String family;


//     @ManyToOne
//     @JoinColumn (name ="id_family")
//    Animal animal;

@OneToMany(mappedBy = "family")
    private List<Animal> animals;



    public Long getIdFamily() {
        return idFamily;
    }



    public void setIdFamily(Long idFamily) {
        this.idFamily = idFamily;
    }


    
}

   


   

    

