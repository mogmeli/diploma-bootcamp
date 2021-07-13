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
    @OneToMany(cascade = CascadeType.ALL) //TODO: Remove cascade and save Subjects before the .save(diploma) on controller.
    List<Materia> materias;

    public Diploma(){
    }

    public Diploma(String name, List<Materia> subjects) {
        this.nomeAluno = name;
        this.materias = subjects;
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

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }
}