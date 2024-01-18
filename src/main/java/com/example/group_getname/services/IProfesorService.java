package com.example.group_getname.services;

import com.example.group_getname.models.entity.Asignatura;
import com.example.group_getname.models.entity.Profesor;

import java.util.List;
import java.util.Optional;

public interface IProfesorService {
    List<Profesor> findAll();
    Optional<Profesor> findById(int id);
    Profesor create(Profesor profesor);
    Profesor update(Profesor profesor);
    void delete(int id);
}
