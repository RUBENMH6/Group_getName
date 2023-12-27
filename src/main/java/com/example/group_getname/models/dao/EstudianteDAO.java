package com.example.group_getname.models.dao;

import com.example.group_getname.models.entity.Estudiante;
import com.example.group_getname.models.entity.Profesor;

import java.sql.Date;
import java.util.List;

public interface EstudianteDAO {
    public void save(Estudiante estudiante);
    public Estudiante getForId(int id);
    public List<Estudiante> findAll();
    public List<Estudiante> findName(String nombre);
    public List<Estudiante> findApellido(String apellido);
    public List<Estudiante> findUsername(String username);
    public List<Estudiante> findNif(String nif);
    public List<Estudiante> findTelefono(int telefono);
    public List<Estudiante> findDateRegistered(Date dateRegistered);
    public void updateId(Estudiante estudiante, int id);
    public void updateNombre(Estudiante estudiante, String nombre);
    public void updateApellido(Estudiante estudiante, String apellido);
    public void updatePassword(Estudiante estudiante, String password);
    public void updateUsername(Estudiante estudiante, String username);
    public void updateNif(Estudiante estudiante, String nif);
    public void updateTelefono(Estudiante estudiante, int telefono);
    public void updateDateRegistered(Estudiante estudiante, Date dateRegistered);
}
