package com.GestionGroupeODK.Controller;

import com.GestionGroupeODK.Model.Apprenant;
import com.GestionGroupeODK.Service.ApprenantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
@RestController
@CrossOrigin

@RequestMapping("/api/apprenant")
public class ApprenantController {

    @Autowired
    ApprenantService apprenantService;
    @PostMapping("/apprenant")
    public String saveApprenant(@RequestBody Apprenant apprenant){
         apprenantService.saveApprenant(apprenant);
         return "success";
    }

 @GetMapping("/apprenant")
    public List<Apprenant> AllApprenant(Apprenant apprenant){
        return  apprenantService.AllApprenant(apprenant);
 }
@PutMapping("/updateApprenant")
public Apprenant updateApprenant(Apprenant apprenant, Long id){
        return apprenantService.updateApprenant(apprenant,id );

}
@DeleteMapping("")
    public String deleteApprenant(long id){
        apprenantService.deleteApprenant(id);
        return "success";
}
    @DeleteMapping("/deleteApprenant")
    public String deleteApprenant(Long id) {
        return apprenantService.deleteApprenant(id);
    }
    @GetMapping("apprenant/{id}")
    public Apprenant getApprenantById(@PathVariable("id") Long id) {
        return apprenantService.getApprenantById(id);
    }
}
