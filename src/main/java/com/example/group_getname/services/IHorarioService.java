package com.example.group_getname.services;

import com.example.group_getname.models.entity.Horario;

import java.util.List;
import java.util.Optional;

public interface IHorarioService {

    List<Horario> findAll();
    Optional<Horario> findById(int id);
    Horario create(Horario horario);
    Horario update(Horario horario);
    void delete(int id);
}
