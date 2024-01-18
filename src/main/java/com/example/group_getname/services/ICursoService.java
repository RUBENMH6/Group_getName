package com.example.group_getname.services;

import com.example.group_getname.models.entity.Curso;

import java.util.List;
import java.util.Optional;

public interface ICursoService {

    List<Curso> findAll();
    Optional<Curso> findById(int id);
    Curso create(Curso curso);
    Curso update(Curso curso);
    void delete(int id);
}
