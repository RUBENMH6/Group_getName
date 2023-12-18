package com.example.group_getname.models.dao;

import com.example.group_getname.models.entity.Curso;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;

public class CursoDAOImpl implements CursoDAO{

    private EntityManager entityManager;

    @Autowired
    public CursoDAOImpl(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }

    @Override
    public void save(Curso curso) {

    }
}
