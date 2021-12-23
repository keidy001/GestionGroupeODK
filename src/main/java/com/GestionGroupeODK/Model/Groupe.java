package com.GestionGroupeODK.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

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
    @ManyToMany(cascade =CascadeType.ALL)
    @JsonIgnore
    @JoinTable(name = "listGroupe")
    private Collection<Apprenant> apprenant;
    @JsonManagedReference
    @ManyToOne(cascade=CascadeType.ALL )
    @JsonIgnore
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
