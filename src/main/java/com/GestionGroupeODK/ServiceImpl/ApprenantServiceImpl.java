package com.GestionGroupeODK.ServiceImpl;

import com.GestionGroupeODK.Model.Apprenant;
import com.GestionGroupeODK.Repository.ApprenantRepository;
import com.GestionGroupeODK.Service.ApprenantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ApprenantServiceImpl implements ApprenantService {
    @Autowired
    ApprenantRepository apprenantRepository;
    @Override
    public String saveApprenant(Apprenant apprenant) {
            apprenantRepository.save(apprenant);
        return "Success";
    }

    @Override
    public List<Apprenant> AllApprenant(Apprenant apprenant) {
        return apprenantRepository.findAll();
    }

    @Override
    public Apprenant updateApprenant(Apprenant apprenant, Long id) {
        Apprenant updateApprenant = apprenantRepository.findById(id).get();
        updateApprenant.setNom(apprenant.getNom());
        updateApprenant.setPrenom(apprenant.getPrenom());
        updateApprenant.setEmail(apprenant.getEmail());
        updateApprenant.setTel(apprenant.getTel());

        return apprenantRepository.save(updateApprenant);
    }

    @Override
    public String deleteApprenant(Long id) {
        apprenantRepository.deleteById(id);
        return "Success";
    }

    @Override
    public Apprenant getApprenantById(Long id) {
        return apprenantRepository.findById(id).get();
    }
}
