package com.GestionGroupeODK.Service;

import com.GestionGroupeODK.Model.Groupe;

import java.util.List;

public interface GroupeService {
    String saveGroupe(Groupe groupe);
    List<Groupe> allGroupe(Groupe groupe);
    Groupe updateGRoupe(Groupe groupe, Long ig);
    String deleteGroupe(Long id);
    Groupe getGroupeById(Long id);
    List<Groupe> findGroupeByRepartition( Groupe groupe);
}
