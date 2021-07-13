package com.example.obterdiploma.rest.controller.form;

import com.example.obterdiploma.rest.model.Diploma;
import com.example.obterdiploma.rest.model.Materia;
import com.sun.istack.NotNull;

import java.util.List;

public class DiplomaForm {
    @NotNull
    String name;
    @NotNull
    List<Materia> subjects;

    public Diploma convert(){
        return new Diploma(name, subjects);
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setSubjects(List<Materia> subjects) {
        this.subjects = subjects;
    }
}