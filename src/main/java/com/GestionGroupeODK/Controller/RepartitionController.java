package com.GestionGroupeODK.Controller;

import com.GestionGroupeODK.Model.Groupe;
import com.GestionGroupeODK.Model.Repartition;
import com.GestionGroupeODK.Service.RepartitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("api/")
public class RepartitionController {
    @Autowired
    RepartitionService repartitionService;
    @PostMapping("/repartition")
    public String saveRepartition(@RequestBody Repartition repartition) {
        return repartitionService.saveRepartition(repartition);
    }
    @GetMapping("liste")
    public List<Repartition> allRepartition() {
        return repartitionService.allRepartition();
    }

    public Repartition updateRepartition(Repartition repartition, Long id) {
        return repartitionService.updateRepartition(repartition, id);
    }

    public String deleteRepartition(Long id) {
        return repartitionService.deleteRepartition(id);
    }

    public Repartition repartitionById(Long id) {
        return repartitionService.repartitionById(id);
    }

    public String saveGroupe(Groupe groupe) {
        return repartitionService.saveGroupe(groupe);
    }
}
