package com.example.group_getname.models.dao;

import com.example.group_getname.models.entity.Aula;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AulaDAOImpl implements AulaDAO {

    private EntityManager entityManager;

    @Autowired
    public AulaDAOImpl(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }

    @Override
    public void save(Aula aula) {
        entityManager.persist(aula);
    }
}
