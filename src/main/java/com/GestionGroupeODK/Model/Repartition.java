package com.GestionGroupeODK.Model;

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
    @Column(nullable = false)
    private OrdreRepartition ordreRepartition;
    @Column(nullable = false)
    private TypeRepartition typeRepartition;
    @Column(nullable = false)
    private int nombre;
    @ManyToOne()
    @JoinColumn(name = "groupe")
    private Groupe groupe;
    @ManyToMany
    private Collection<Apprenant> apprenants;
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

    public Groupe getGroupe() {
        return groupe;
    }

    public void setGroupe(Groupe groupe) {
        this.groupe = groupe;
    }

    public Collection<Apprenant> getApprenants() {
        return apprenants;
    }

    public void setApprenants(Collection<Apprenant> apprenants) {
        this.apprenants = apprenants;
    }

    public OrdreRepartition getOrdreRepartition() {
        return ordreRepartition;
    }

    public void setOrdreRepartition(OrdreRepartition ordreRepartition) {
        this.ordreRepartition = ordreRepartition;
    }

    public TypeRepartition getTypeRepartition() {
        return typeRepartition;
    }

    public void setTypeRepartition(TypeRepartition typeRepartition) {
        this.typeRepartition = typeRepartition;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

}
