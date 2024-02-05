package com.example.group_getname.services;

import com.example.group_getname.models.entity.Usuario;
import com.example.group_getname.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService implements IUsuarioService{

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> findAll() {
        return this.usuarioRepository.findAll();
    }

    @Override
    public Optional<Usuario> findById(int id) {
        return this.usuarioRepository.findById(id);
    }

    @Override
    public Usuario create(Usuario usuario) {
        return this.usuarioRepository.save(usuario);
    }

    @Override
    public Usuario update(Usuario usuario) {
        return null;
    }

    @Override
    public void delete(int id) {
        Optional<Usuario> usuario = usuarioRepository.findById(id);
        System.out.println(usuario);
        usuarioRepository.deleteById(id);
    }
}
