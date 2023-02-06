package com.Zootopia.demo.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.GenerationType;






public class AnimalEntity {



    @Entity
    @Table(name = "animals")
    public class Animal{


        @Id 
        @GeneratedValue(strategy = GenerationType.IDENTITY)
         private long Id;

        @Column (length = 50,nullable= false)
        private String name;

        @Column (length = 50,nullable= true)
        private Date date;
        
        @OneToMany(mappedBy ="TipoEntity")
        private List<TipoEntity> tEntity;


        @OneToMany(mappedBy ="GeneroEntity")
        private List<GeneroEntity> gEntity;

        @OneToMany(mappedBy ="FamilyEntity")
        private List<FamilyEntity> fEntity;

        @OneToMany(mappedBy ="PaisEntity")
        private List<PaisEntity> pEntity;



    







    }


    
}
