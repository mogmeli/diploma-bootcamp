package com.example.obterdiploma.rest.repository;

import com.example.obterdiploma.rest.model.Diploma;
import org.hibernate.cfg.JPAIndexHolder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiplomaRepository extends JpaRepository<Diploma, Long> {
}