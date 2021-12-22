package com.GestionGroupeODK.Model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
public class Apprenant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idApprenant;

    @Column(nullable = false)
    private String nom;

    @Column(nullable = false)
    private String prenom;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private int tel;
    @ManyToMany(mappedBy = "apprenant", cascade =CascadeType.ALL)
    Collection<Groupe> groupe;
    public Apprenant() {
    }

    public Long getIdApprenant() {
        return idApprenant;
    }

    public void setIdApprenant(Long idApprenant) {
        this.idApprenant = idApprenant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }


    public Collection<Groupe> getGroupe() {
        return groupe;
    }

    public void setGroupe(Collection<Groupe> groupe) {
        this.groupe = groupe;
    }

}
