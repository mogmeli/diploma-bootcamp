package com.example.obterdiploma.rest.controller.Dto;

import com.example.obterdiploma.rest.model.Diploma;
import com.example.obterdiploma.rest.model.Subject;

import java.util.List;

public class StudentDto {

    String name;
    List<Subject> subjects; //TODO: Use SubjectDto and not show field Id.

    public StudentDto(Diploma diploma){
        name = diploma.getNomeAluno();
        subjects = diploma.getMaterias();
    }

    public String getName() {
        return name;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }


}