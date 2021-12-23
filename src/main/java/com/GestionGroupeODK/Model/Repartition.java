package com.GestionGroupeODK.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

@Entity
public class Repartition implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRepartition;
    @Column(nullable = false)
    private String nom;
    @Column(nullable = false)
    private Date date;
    private int ordre;
    private int type;
    @Column(nullable = false)
    private int nombre;
    @OneToMany(mappedBy = "repartition",cascade=CascadeType.ALL)
    @JsonBackReference
    private Collection<Groupe> groupe;

    public Repartition() {
    }

    public Long getIdRepartition() {
        return idRepartition;
    }

    public void setIdRepartition(Long idRepartition) {
        this.idRepartition = idRepartition;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Collection<Groupe> getGroupe() {
        return groupe;
    }

    public void setGroupe(Collection<Groupe> groupe) {
        this.groupe = groupe;
    }

    public int getOrdre() {
        return ordre;
    }

    public void setOrdre(int ordre) {
        this.ordre = ordre;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

}
