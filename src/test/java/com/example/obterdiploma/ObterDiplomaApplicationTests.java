package com.example.obterdiploma;

import com.example.obterdiploma.rest.controller.Controller;
import com.example.obterdiploma.rest.model.Diploma;
import com.example.obterdiploma.rest.model.Subject;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotSame;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class ObterDiplomaApplicationTests {

    @Autowired
    Controller controller;

    @Test
    public void contextLoads() throws Exception{
        assertThat(controller).isNotNull();
    }

    @Test
    public void testarNomeETresDiciplinasPreenchidas(){
        //Arrange = pre condicoes, e estado inicial.

        Diploma diplomaOriginal = new Diploma();
        Diploma diploma = new Diploma();

        //Act = metodo que sera executado para ser testado

        diploma.setNomeAluno("Aluno teste");
        List<Subject> materia = new ArrayList<>();
        materia.add(0, new Subject("Matematica", 10));
        materia.add(1, new Subject("Historia", 9));
        materia.add(2, new Subject("Portugues", 3));

        diploma.setMaterias(materia);
        //Assert = Descreve o resultado esperado.
        assertNotSame(diplomaOriginal, diploma );

    }

    @Test
    public void testarNomeVazioETresDiciplinasPreenchidas(){}

    @Test
    public void testarNomePreenchidoEDiciplinasVazias(){}

}