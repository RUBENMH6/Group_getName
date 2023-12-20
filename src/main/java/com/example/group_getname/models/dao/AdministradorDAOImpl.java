package com.example.group_getname.models.dao;

import com.example.group_getname.models.entity.Administrador;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AdministradorDAOImpl implements AdministradorDAO{

    private EntityManager entityManager;

    @Autowired
    public AdministradorDAOImpl(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }

    @Override
    public void save(Administrador administrador) {
        entityManager.persist(administrador);
    }
}
