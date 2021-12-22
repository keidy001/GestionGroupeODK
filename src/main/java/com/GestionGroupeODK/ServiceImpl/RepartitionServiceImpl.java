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

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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

        //Listes des apprenants
        List<Apprenant> allApprenants = apprenantRepository.findAll();

        //Shuffle liste
        Collections.shuffle(allApprenants);

        List<List<Apprenant>> listGroupeGenetayed = IntStream.range(0, allApprenants.size())
                .boxed()
                .collect(Collectors.groupingBy(i -> i % repartition.getNombre()))
                .values()
                .stream()
                .map(il -> il.stream().map(allApprenants::get).collect(Collectors.toList()))
                .collect(Collectors.toList());

        for(int i = 0; i < repartition.getNombre(); i++)
        {
            Groupe groupe = new Groupe();
            groupe.setNum(i);
            groupe.setApprenant (listGroupeGenetayed.get(i));
          groupe.setRepartition(repartition);
            groupeRepository.save(groupe);
            groupe.setRepartition(repartition);

        }
            repartitionRepository.save(repartition);
         return "Success";
    }

      /*  public String saveRepartition(Repartition repartition) {
      List<Apprenant> Listapprenants = apprenantRepository.findAll();
        int totalApprenant = Listapprenants.size();
        int ng = repartition.getNombre();
                int Appg = totalApprenant/ng;
        System.out.println(Appg);
        System.out.println(ng);
        System.out.println(totalApprenant);


        for (int i = 0 ; i < ng ; i++ ){

                    for (int j = 0; j < Appg ; j++){
                        Groupe groupe = new Groupe();
                        int numG = i+1;
                        System.out.println(numG);
                        groupe.setNum(numG);
                        Long id = Long.valueOf(j+1);
                        int indj = j+1;
                        System.out.println("index de j"+indj);
                        Apprenant   apprenants =  apprenantRepository.findById(id).get();
                        groupe.setApprenant(apprenants);
                        groupeRepository.save(groupe);

                        }

                    }


}
        return "Success";*/


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
