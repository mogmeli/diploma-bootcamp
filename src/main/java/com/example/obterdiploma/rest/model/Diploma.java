package com.example.obterdiploma.rest.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Diploma {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idDiploma;
    String nomeAluno;
    String mensagem;
    double media;
    @OneToMany(cascade = CascadeType.ALL)
    List<Subject> subjects;

    public Diploma(){
    }

    public Diploma(String name, List<Subject> subjects) {
        this.nomeAluno = name;
        this.subjects = subjects;
    }

    public Long getIdDiploma() {
        return idDiploma;
    }

    public void setIdDiploma(Long idDiploma) {
        this.idDiploma = idDiploma;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public List<Subject> getMaterias() {
        return subjects;
    }

    public void setMaterias(List<Subject> subjects) {
        this.subjects = subjects;
    }
}