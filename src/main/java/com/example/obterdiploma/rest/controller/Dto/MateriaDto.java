package com.example.obterdiploma.rest.controller.Dto;

import com.example.obterdiploma.rest.model.Materia;

import java.util.List;
import java.util.stream.Collectors;

public class MateriaDto {

    String subject;
    double note;

    public MateriaDto(Materia materia){
        subject = materia.getSubject();
        note = materia.getNote();
    }

    public List<MateriaDto> convert(List<Materia> lista){
        return lista.stream().map(MateriaDto::new).collect(Collectors.toList());
    }
}