package com.example.obterdiploma.rest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Materia {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idMateria;
    String subject;
    double note;

    public Materia() {
    }


    public Long getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(Long idMateria) {
        this.idMateria = idMateria;
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