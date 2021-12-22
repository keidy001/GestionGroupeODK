package com.GestionGroupeODK.Service;

import com.GestionGroupeODK.Model.Apprenant;

import java.util.List;

public interface ApprenantService {
    String  saveApprenant(Apprenant apprenant);
    List<Apprenant> AllApprenant(Apprenant apprenant);
    Apprenant updateApprenant(Apprenant apprenant,Long id);
    String deleteApprenant(Long id);
    Apprenant getApprenantById(Long id);
}
