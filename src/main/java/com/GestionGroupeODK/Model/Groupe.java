package com.GestionGroupeODK.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.Collection;

@Entity
public class Groupe implements Serializable {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long idGroupe;
    private int num;
    private String tache;
    @ManyToMany(cascade =CascadeType.ALL)
    @JoinTable(name = "listGroupe")
    private Collection<Apprenant> apprenant;

    @ManyToOne(cascade=CascadeType.ALL )
    private Repartition repartition;
    public Groupe() {
    }

    public Long getIdGroupe() {
        return idGroupe;
    }

    public void setIdGroupe(Long idGroupe) {
        this.idGroupe = idGroupe;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getTache() {
        return tache;
    }

    public void setTache(String tache) {
        this.tache = tache;
    }

    public Collection<Apprenant> getApprenant() {
        return apprenant;
    }

    public void setApprenant(Collection<Apprenant> apprenant) {
        this.apprenant = apprenant;
    }

    public Repartition getRepartition() {
        return repartition;
    }

    public void setRepartition(Repartition repartition) {
        this.repartition = repartition;
    }
}
