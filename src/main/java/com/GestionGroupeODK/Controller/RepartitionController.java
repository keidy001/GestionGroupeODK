package com.GestionGroupeODK.Controller;

import com.GestionGroupeODK.Model.Groupe;
import com.GestionGroupeODK.Model.Repartition;
import com.GestionGroupeODK.Service.RepartitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("api/repartition")
public class RepartitionController {
    @Autowired
    RepartitionService repartitionService;
    @PostMapping("/repartition")
    public String saveRepartition(@RequestBody Repartition repartition) {
        return repartitionService.saveRepartition(repartition);
    }

    public Repartition allRepartition(Repartition repartition) {
        return repartitionService.allRepartition(repartition);
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
