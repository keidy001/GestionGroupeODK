package com.GestionGroupeODK.Repository;

import com.GestionGroupeODK.Model.Groupe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GroupeRepository extends JpaRepository<Groupe, Long> {
    List<Groupe> findByRepartition(Groupe groupe);
}
