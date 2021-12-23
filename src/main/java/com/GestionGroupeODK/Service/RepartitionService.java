package com.GestionGroupeODK.Service;

import com.GestionGroupeODK.Model.Groupe;
import com.GestionGroupeODK.Model.Repartition;

import java.util.List;

public interface RepartitionService {
    String saveRepartition(Repartition repartition);
    List<Repartition> allRepartition();
    Repartition updateRepartition(Repartition repartition, Long id);
    String deleteRepartition(Long id);
    Repartition repartitionById(Long id);
    String saveGroupe(Groupe groupe);
}
