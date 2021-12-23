package com.GestionGroupeODK.Controller;

import com.GestionGroupeODK.Model.Groupe;
import com.GestionGroupeODK.ServiceImpl.GroupeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin
@RequestMapping("/api")
public class GroupeController {
    @Autowired
    GroupeServiceImpl groupeService;

    public String saveGroupe(Groupe groupe) {
        return groupeService.saveGroupe(groupe);
    }
    @GetMapping("/all")
    public List<Groupe> allGroupe(Groupe groupe) {
        return groupeService.allGroupe(groupe);
    }

    public Groupe updateGRoupe(Groupe groupe, Long ig) {
        return groupeService.updateGRoupe(groupe, ig);
    }

    public String deleteGroupe(Long id) {
        return groupeService.deleteGroupe(id);
    }

    public Groupe getGroupeById(Long id) {
        return groupeService.getGroupeById(id);
    }

    public List<Groupe> findGroupeByRepartition(Groupe groupe) {
        return groupeService.findGroupeByRepartition(groupe);
    }
}
