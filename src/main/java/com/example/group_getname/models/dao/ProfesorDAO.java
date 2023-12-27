package com.example.group_getname.models.dao;

import com.example.group_getname.models.entity.Curso;
import com.example.group_getname.models.entity.Profesor;

import java.util.List;

public interface ProfesorDAO {

    public void save(Profesor profesor);
    public Profesor getForId(int id);
    public List<Profesor> findAll();
    public List<Profesor> findName(String nombre);
    public List<Profesor> findApellido(String apellido);
    public List<Profesor> findEmail(String email);
    public List<Profesor> findNif(String nif);
    public List<Profesor> findTelefono(int telefono);
    public void updateId(Profesor profesor, int id);
    public void updateNombre(Profesor profesor, String nombre);
    public void updateApellido(Profesor profesor, String apellido);
    public void updateEmail(Profesor profesor, String email);
    public void updateNif(Profesor profesor, String nif);
    public void updateTelefono(Profesor profesor, int telefono);
}

