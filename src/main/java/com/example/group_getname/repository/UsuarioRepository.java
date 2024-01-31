package com.example.group_getname.repository;

import com.example.group_getname.models.entity.Asignatura;
import com.example.group_getname.models.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}