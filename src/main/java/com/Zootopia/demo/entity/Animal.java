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

@Entity
@Table(name = "animals")
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    @Column(length = 50, nullable = false)
    private String name;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Column(length = 50, nullable = true)
    private Date date;

 

    @ManyToOne
    @JoinColumn(name= "id_type")
    TipoEntity type;


    @ManyToOne
    @JoinColumn(name= "id_family")
    FamilyEntity family;

    @ManyToOne
    @JoinColumn(name= "id_genero")
    GeneroEntity genero;

    @ManyToOne
    @JoinColumn(name= "id_pais")
    PaisEntity pais;




    

    // @OneToMany(mappedBy ="type")
    // private List<TipoEntity> typeAnimal;

    // @OneToMany(mappedBy ="GeneroEntity")
    // private List<GeneroEntity> gEntity;

    // @OneToMany(mappedBy ="FamilyEntity")
    // private List<FamilyEntity> fEntity;

    // @OneToMany(mappedBy ="PaisEntity")
    // private List<PaisEntity> pEntity;

}
