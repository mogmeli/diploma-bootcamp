package com.example.obterdiploma.rest.controller.Dto;

import com.example.obterdiploma.rest.model.Diploma;

import java.lang.reflect.Array;
import java.util.List;

public class DiplomaDto {

    private final String message;
    private final double average;
    private final AlunoDto student;

    public DiplomaDto(Diploma diploma) {
        message = diploma.getMensagem();
        average = diploma.getMedia();
        student = new AlunoDto(diploma);
    }

    public String getMessage() {
        return message;
    }

    public double getAverage() {
        return average;
    }

    public AlunoDto getStudent() {
        return student;
    }
}