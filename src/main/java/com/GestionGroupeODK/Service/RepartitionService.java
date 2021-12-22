package com.GestionGroupeODK.Service;

import com.GestionGroupeODK.Model.Groupe;
import com.GestionGroupeODK.Model.Repartition;

public interface RepartitionService {
    String saveRepartition(Repartition repartition);
    Repartition allRepartition(Repartition repartition);
    Repartition updateRepartition(Repartition repartition, Long id);
    String deleteRepartition(Long id);
    Repartition repartitionById(Long id);
    String saveGroupe(Groupe groupe);
}
