package com.example.group_getname.services;

import com.example.group_getname.models.entity.Usuario;

import java.util.List;
import java.util.Optional;

public interface IUsuarioService {

    List<Usuario> findAll();
    Optional<Usuario> findById(int id);
    Usuario create(Usuario usuario);
    Usuario update(Usuario usuario);
    void delete(int id);
}
