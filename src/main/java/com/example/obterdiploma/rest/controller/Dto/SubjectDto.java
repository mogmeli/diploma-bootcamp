package com.example.obterdiploma.rest.controller.Dto;

import com.example.obterdiploma.rest.model.Subject;

import java.util.List;
import java.util.stream.Collectors;

public class SubjectDto {

    String subject;
    double note;

    public String getSubject() {
        return subject;
    }

    public double getNote() {
        return note;
    }

    public SubjectDto(Subject subject){
        this.subject = subject.getSubject();
        note = subject.getNote();
    }

    public static List<SubjectDto> convert(List<Subject> lista){
        return lista.stream().map(SubjectDto::new).collect(Collectors.toList());
    }
}