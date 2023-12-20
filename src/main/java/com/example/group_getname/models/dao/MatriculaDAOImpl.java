package com.example.group_getname.models.dao;

import com.example.group_getname.models.entity.Curso;
import com.example.group_getname.models.entity.Matricula;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class MatriculaDAOImpl implements MatriculaDAO{

    private EntityManager entityManager;

    @Autowired
    public MatriculaDAOImpl(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }

    @Override
    @Transactional
    public void save(Matricula matricula) {
        entityManager.persist(matricula);
    }

}




