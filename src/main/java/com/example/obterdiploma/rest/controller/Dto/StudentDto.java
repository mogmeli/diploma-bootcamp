package com.example.obterdiploma.rest.controller.Dto;

import com.example.obterdiploma.rest.model.Diploma;
import com.example.obterdiploma.rest.model.Subject;

import java.util.List;

public class StudentDto {

    String name;
    List<SubjectDto> subjects;

    public StudentDto(Diploma diploma) {
        name = diploma.getNomeAluno();
        subjects = SubjectDto.convert(diploma.getMaterias());
    }
    public String getName() {
        return name;
    }

    public List<SubjectDto> getSubjects() {
        return subjects;
    }


}