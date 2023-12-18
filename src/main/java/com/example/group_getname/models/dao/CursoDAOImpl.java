package com.example.group_getname.models.dao;

import com.example.group_getname.models.entity.Curso;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class CursoDAOImpl implements CursoDAO{

    private EntityManager entityManager;

    @Autowired
    public CursoDAOImpl(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }

    @Override
    @Transactional
    public void save(Curso curso) {
        entityManager.persist(curso);
    }

}
