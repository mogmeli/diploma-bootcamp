package com.example.obterdiploma.rest.controller.Dto;

import com.example.obterdiploma.rest.model.Diploma;
import com.example.obterdiploma.rest.model.Materia;

import java.util.ArrayList;
import java.util.List;

public class AlunoDto {

    String name;
    List<Materia> subjects; //TODO: Use MateriaDto and not show field Id.

    public AlunoDto(Diploma diploma){
        name = diploma.getNomeAluno();
        subjects = diploma.getMaterias();
    }

    public String getName() {
        return name;
    }

    public List<Materia> getSubjects() {
        return subjects;
    }


}