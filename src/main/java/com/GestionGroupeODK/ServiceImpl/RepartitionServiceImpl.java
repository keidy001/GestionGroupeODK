package com.GestionGroupeODK.ServiceImpl;

import com.GestionGroupeODK.Model.Apprenant;
import com.GestionGroupeODK.Model.Groupe;
import com.GestionGroupeODK.Model.Repartition;
import com.GestionGroupeODK.Model.TypeRepartition;
import com.GestionGroupeODK.Repository.ApprenantRepository;
import com.GestionGroupeODK.Repository.GroupeRepository;
import com.GestionGroupeODK.Repository.RepartitionRepository;
import com.GestionGroupeODK.Service.RepartitionService;
import org.aspectj.weaver.GeneratedReferenceTypeDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RepartitionServiceImpl implements RepartitionService {
    @Autowired
    RepartitionRepository repartitionRepository;
    @Autowired
    ApprenantRepository apprenantRepository;
    @Autowired
    GroupeRepository groupeRepository;
    @Override
    public String saveGroupe(Groupe groupe) {
        groupeRepository.save(groupe);
        return null;
    }
    @Override
    public String saveRepartition(Repartition repartition) {


        List<Apprenant> Listapprenants = apprenantRepository.findAll();
        int totalApprenant = Listapprenants.size();
        int ng = repartition.getNombre();
                int Appg = totalApprenant/ng;
                for (int i = 0 ; i < ng ; i++ ){
                    for (int j = 0; j<Appg;j++){
                        Groupe groupe = new Groupe();
                        groupe.setNum(i+1);
                        Long id = Long.valueOf(i+1);
                    Apprenant   apprenants =  apprenantRepository.findById(id).get();
                        groupe.setApprenant(repartition.getApprenants());
                        groupeRepository.save(groupe);

                        }
                    }



        return "Success";
    }

    @Override
    public Repartition allRepartition(Repartition repartition) {
        return null;
    }

    @Override
    public Repartition updateRepartition(Repartition repartition, Long id) {
        return null;
    }

    @Override
    public String deleteRepartition(Long id) {
        return null;
    }

    @Override
    public Repartition repartitionById(Long id) {
        return null;
    }
}
