package com.example.obterdiploma.rest.controller;

import com.example.obterdiploma.rest.controller.Dto.DiplomaDto;
import com.example.obterdiploma.rest.controller.form.DiplomaForm;
import com.example.obterdiploma.rest.model.Diploma;
import com.example.obterdiploma.rest.repository.DiplomaRepository;
import com.example.obterdiploma.rest.service.DiplomaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/aluno")
public class Controller {

    @Autowired
    DiplomaService diplomaService;
    @Autowired
    DiplomaRepository diplomaRepository;

    @PostMapping("/diploma")
    public ResponseEntity<DiplomaDto> emitirDiploma(@RequestBody @Valid DiplomaForm diplomaForm, UriComponentsBuilder uriBuilder){

        Diploma diploma = diplomaService.convert(diplomaForm);
        diplomaService.save(diploma);
        URI uri = uriBuilder.path("/aluno/{id}").buildAndExpand(diploma.getIdDiploma()).toUri();

        return ResponseEntity.created(uri).body(new DiplomaDto(diploma));

    }

    @GetMapping("/all")
    public ResponseEntity<List<Diploma>> getAllDiplomas(){
        return ResponseEntity.ok(diplomaRepository.findAll());
    }
}