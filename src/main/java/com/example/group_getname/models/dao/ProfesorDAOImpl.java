package com.example.group_getname.models.dao;

import com.example.group_getname.models.entity.Curso;
import com.example.group_getname.models.entity.Profesor;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class ProfesorDAOImpl implements ProfesorDAO{

    private EntityManager entityManager;

    @Autowired
    public ProfesorDAOImpl(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }

    @Override
    @Transactional
    public void save(Profesor profesor) {
        entityManager.persist(profesor);
    }

}
