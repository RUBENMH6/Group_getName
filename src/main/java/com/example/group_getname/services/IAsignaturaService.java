package com.example.group_getname.services;

import com.example.group_getname.models.entity.Asignatura;

import java.util.List;
import java.util.Optional;

public interface IAsignaturaService {

    List<Asignatura> findAll();
    Optional<Asignatura> findById(int id);
    Asignatura create(Asignatura asignatura);
    Asignatura update(Asignatura asignatura);
    void delete(int id);
}
