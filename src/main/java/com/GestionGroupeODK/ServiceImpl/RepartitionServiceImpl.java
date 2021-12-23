package com.GestionGroupeODK.ServiceImpl;

import com.GestionGroupeODK.Model.*;
import com.GestionGroupeODK.Repository.ApprenantRepository;
import com.GestionGroupeODK.Repository.GroupeRepository;
import com.GestionGroupeODK.Repository.RepartitionRepository;
import com.GestionGroupeODK.Service.RepartitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

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

        //Listes aleatoire
        List<Apprenant> allApprenants = apprenantRepository.findAll();
            if (repartition.getOrdre()== 1){
                System.out.println(repartition.getType());
                System.out.println(repartition.getNombre());
                System.out.println(allApprenants.size());
                if(repartition.getType()==1) {
                    List<List<Apprenant>> listGroupeGenetayed = IntStream.range(0, allApprenants.size())
                            .boxed()
                            .collect(Collectors.groupingBy(i -> i % repartition.getNombre()))
                            .values()
                            .stream()
                            .map(j -> j.stream().map(allApprenants::get).collect(Collectors.toList()))
                     .collect(Collectors.toList());
                    for(int i = 0; i < repartition.getNombre(); i++)
                    {
                        Groupe groupe = new Groupe();
                        groupe.setNum(i);
                        groupe.setApprenant (listGroupeGenetayed.get(i));
                        groupe.setRepartition(repartition);
                        groupeRepository.save(groupe);

                    }
                }
                if (repartition.getType()==2){
                    int nbre = allApprenants.size()/repartition.getNombre();
                    System.out.println(nbre);

                        List<List<Apprenant>> listGroupeGenetayed = IntStream.range(0, allApprenants.size())
                                .boxed()
                                .collect(Collectors.groupingBy(i -> i % nbre))
                                .values()
                                .stream()
                                .map(j -> j.stream().map(allApprenants::get).collect(Collectors.toList()))
                                .collect(Collectors.toList());
                    for(int i = 0; i < repartition.getNombre(); i++)
                    {
                        Groupe groupe = new Groupe();
                        groupe.setNum(i);
                        groupe.setApprenant (listGroupeGenetayed.get(i));
                        groupe.setRepartition(repartition);
                        groupeRepository.save(groupe);

                    }

                }

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
    public List<Repartition> allRepartition() {

        return repartitionRepository.findAll();
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
