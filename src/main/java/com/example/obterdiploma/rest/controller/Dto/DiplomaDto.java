package com.example.obterdiploma.rest.controller.Dto;

import com.example.obterdiploma.rest.model.Diploma;

public class DiplomaDto {

    private final String message;
    private final double average;
    private final StudentDto student;

    public DiplomaDto(Diploma diploma) {
        message = diploma.getMensagem();
        average = diploma.getMedia();
        student = new StudentDto(diploma);
    }

    public String getMessage() {
        return message;
    }

    public double getAverage() {
        return average;
    }

    public StudentDto getStudent() {
        return student;
    }
}