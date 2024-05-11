package com.joaoatv.joaoatv.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.joaoatv.joaoatv.entities.Aluno;



@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {
    
}
