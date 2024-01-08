package com.example.group_getname.models.dao;

import com.example.group_getname.models.entity.Administrador;

import java.util.List;

public interface AdministradorDAO {

    public void save(Administrador administrador);
    public Administrador getForId(int id);
    public List<Administrador> findAll();
    public void updateUsername(Administrador administrador, String username);
    public void updateNombre(Administrador administrador, String nombre);
    public void updateEmail(Administrador administrador, String email);
    public void updatePassword(Administrador administrador, String password);
}
