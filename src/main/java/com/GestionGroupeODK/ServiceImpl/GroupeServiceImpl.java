package com.GestionGroupeODK.ServiceImpl;

import com.GestionGroupeODK.Model.Groupe;
import com.GestionGroupeODK.Repository.ApprenantRepository;
import com.GestionGroupeODK.Repository.GroupeRepository;
import com.GestionGroupeODK.Repository.RepartitionRepository;
import com.GestionGroupeODK.Service.GroupeService;
import org.springframework.beans.factory.annotation.Autowired;

public class GroupeServiceImpl implements GroupeService {
@Autowired
    GroupeRepository groupeRepository;
@Autowired
    ApprenantRepository apprenantRepository;
@Autowired
    RepartitionRepository repartitionRepository;
    @Override
    public String saveGroupe(Groupe groupe) {
            groupeRepository.save(groupe);
        return null;
    }

    @Override
    public Groupe allGroupe(Groupe groupe) {
        return null;
    }

    @Override
    public Groupe updateGRoupe(Groupe groupe, Long ig) {
        return null;
    }

    @Override
    public String deleteGroupe(Long id) {
        return null;
    }

    @Override
    public Groupe getGroupeById(Long id) {
        return null;
    }
}
