package com.joaoatv.joaoatv.config;

import java.util.Arrays;

import com.joaoatv.joaoatv.entities.Aluno;
import com.joaoatv.joaoatv.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {



    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public void run(String... args) throws Exception {

        Aluno aluno1 = new Aluno(null, "Joao", "ADS", 20 , true);
        Aluno aluno2 = new Aluno(null, "Luke", "ADS", 30 , true);
        Aluno aluno3 = new Aluno(null, "Woledy", "ADS", 40 , true);
        Aluno aluno4 = new Aluno(null, "Ruffy", "ADS", 28 , true);

        //Manda para o banco de dados
        alunoRepository.saveAll(Arrays.asList(aluno1, aluno2));


    }
}