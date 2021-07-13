package com.example.obterdiploma.rest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Subject {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idSubject;
    String subject;
    double note;

    public Subject() {
    }


    public Long getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(Long idMateria) {
        this.idSubject = idMateria;
    }

    public double getNote() {
        return note;
    }

    public void setNote(double nota) {
        this.note = nota;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String nomeMateria) {
        this.subject = nomeMateria;
    }
}