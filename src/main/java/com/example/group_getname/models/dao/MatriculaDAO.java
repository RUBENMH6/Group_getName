package com.example.group_getname.models.dao;

import com.example.group_getname.models.entity.Curso;
import com.example.group_getname.models.entity.Matricula;

import java.util.List;

public interface MatriculaDAO {

    public void save(Matricula matricula);
    public Matricula getForId(int id);
    public List<Matricula> findAll();
    public List<Matricula> findEstudiante(int idEstudiante);
    public List<Matricula> findCurso(int idCurso);
    public List<Matricula> findEstadoActivo();
    public void updateId(Matricula matricula,int id);
    public void updateIdEstudiante(Matricula matricula, int idEstudiante);
    public void updateIdCurso(Matricula matricula, int idCurso);
    public void updateEstado(Matricula matricula);


}

