package com.example.group_getname.models.dao;

import com.example.group_getname.models.entity.Curso;

import java.util.Date;
import java.util.List;

public interface CursoDAO {

    public void save(Curso curso);
    public Curso getForId( int id);
    public List<Curso> findAll();
    public List<Curso> findAllActive();
    public List<Curso> findAllFechaInicio(Date fechaInicio);
    public List<Curso> findAllFechaFin(Date fechaFin);
    public void updateIdCurso(Curso curso, int id);
    public void updateNombre(Curso curso, String nombre);
    public void updateDescripcion(Curso curso, String descripcion);
    public void updateFechaInicio(Curso curso, Date fechaInicio);
    public void updateFechaFin(Curso curso, Date fechaFin);
    public void updateActivo(Curso curso);


}
