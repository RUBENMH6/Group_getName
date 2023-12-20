package com.example.group_getname.models.dao;

import com.example.group_getname.models.entity.Asignatura;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AsignaturaDAOImpl implements AsignaturaDAO {

    private EntityManager entityManager;

    @Autowired
    public AsignaturaDAOImpl(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }

    @Override
    public void save(Asignatura asignatura) {
        entityManager.persist(asignatura);
    }
}
