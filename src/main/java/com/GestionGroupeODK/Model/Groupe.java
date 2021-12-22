package com.GestionGroupeODK.Model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
public class Groupe implements Serializable {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long idGroupe;
    private int num;
    private String tache;
    @OneToMany(mappedBy = "groupe")
    private Collection<Apprenant> apprenant;
    @OneToMany(mappedBy ="groupe" )
    private Collection<Repartition> repartition;
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

    public void setNum(int nom) {
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

    public Collection<Repartition> getRepartition() {
        return repartition;
    }

    public void setRepartition(Collection<Repartition> repartition) {
        this.repartition = repartition;
    }
}
