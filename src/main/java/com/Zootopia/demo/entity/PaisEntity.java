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
@Table (name="countries")
public class PaisEntity {

@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
@Column (name="id_pais")
Long idpais;

@Column (name="pais")
String pais;

public PaisEntity(String pais) {
    this.pais = pais;
}

public Long getIdpais() {
    return idpais;
}

public void setIdpais(Long idpais) {
    this.idpais = idpais;
}

public String getPais() {
    return pais;
}

public void setPais(String pais) {
    this.pais = pais;
}





// @OneToMany(mappedBy = "pais")
// private List<Animal> animals;

}