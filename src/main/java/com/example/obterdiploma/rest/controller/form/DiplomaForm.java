package com.example.obterdiploma.rest.controller.form;

import com.example.obterdiploma.rest.model.Diploma;
import com.example.obterdiploma.rest.model.Subject;
import com.sun.istack.NotNull;

import java.util.List;

public class DiplomaForm {
    @NotNull
    String name;
    @NotNull
    List<Subject> subjects;

    public Diploma convert(){
        return new Diploma(name, subjects);
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }
}