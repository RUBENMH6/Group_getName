package com.example.group_getname.services;

import com.example.group_getname.models.entity.Asignatura;
import com.example.group_getname.models.entity.Estudiante;

import java.util.List;
import java.util.Optional;

public interface IEstudianteService {

    List<Estudiante> findAll();
    Optional<Estudiante> findById(int id);
    Estudiante create(Estudiante estudiante);
    Estudiante update(Estudiante estudiante);
    void delete(int id);
}
