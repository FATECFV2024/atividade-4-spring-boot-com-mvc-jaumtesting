package com.joaoatv.joaoatv.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.joaoatv.joaoatv.entities.Nota;

@Repository
public interface NotaRepository extends JpaRepository<Nota, Integer> {

    
} 
