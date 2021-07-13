package com.example.obterdiploma.rest.repository;

import com.example.obterdiploma.rest.model.Materia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MateriaRepository extends JpaRepository<Materia, Long> {
}