package com.GestionGroupeODK.Service;

import com.GestionGroupeODK.Model.Groupe;

public interface GroupeService {
    String saveGroupe(Groupe groupe);
    Groupe allGroupe(Groupe groupe);
    Groupe updateGRoupe(Groupe groupe, Long ig);
    String deleteGroupe(Long id);
    Groupe getGroupeById(Long id);
}
