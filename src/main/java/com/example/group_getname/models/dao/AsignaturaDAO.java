package com.example.group_getname.models.dao;

import com.example.group_getname.models.entity.Asignatura;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.util.List;

public interface AsignaturaDAO {

    public void save(Asignatura asignatura);

    public Asignatura getForId(int id);

    public List<Asignatura> findAll();

    public void updateName(Asignatura asignatura, String nombre);
    public void updateIdProfesor(Asignatura asignatura, int idProf);
    public void updateIdCurso(Asignatura asignatura, int idCurso);
    public void updateIdHorario(Asignatura asignatura, int idHorario);
}
