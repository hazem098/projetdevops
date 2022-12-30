package com.hazem.examen.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hazem.examen.entities.DetailFournisseur;

@Repository
public interface DetailFournisseurRepository  extends JpaRepository<DetailFournisseur, Long>{

}
