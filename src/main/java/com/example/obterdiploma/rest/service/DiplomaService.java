package com.example.obterdiploma.rest.service;

import com.example.obterdiploma.rest.controller.form.DiplomaForm;
import com.example.obterdiploma.rest.model.Diploma;
import com.example.obterdiploma.rest.model.Materia;
import com.example.obterdiploma.rest.repository.DiplomaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.OptionalDouble;

@Service
public class DiplomaService {

    @Autowired
    DiplomaRepository diplomaRepository;

    public Diploma convert(DiplomaForm diplomaForm){

        return diplomaForm.convert();
    }

    public void save(Diploma diploma) {
        OptionalDouble media = getMedia(diploma.getMaterias());
        if(media.isPresent()){
            checkMedia(media, diploma);
        }else{
            throw new RuntimeException("Get Media deu erro");
        }
    }

    private void checkMedia(OptionalDouble media, Diploma diploma) {
        diploma.setMedia(media.getAsDouble());
        if(media.getAsDouble() > 9){
            diploma.setMensagem("Parabens voce passou de ano");
        }else{
            diploma.setMensagem("Infelizmente voce nao passou de ano");
        }
        diplomaRepository.save(diploma);
    }

    private OptionalDouble getMedia(List<Materia> materias) {
        return materias.stream().mapToDouble(Materia::getNote).average();
    }
}