package com.example.group_getname.models.dao;

import com.example.group_getname.models.entity.Administrador;
import com.example.group_getname.models.entity.Asignatura;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

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

    @Override
    public Administrador getForId(int id) {
        return entityManager.find(Administrador.class, id);
    }

    @Override
    public List<Administrador> findAll() {
        TypedQuery<Administrador> query = entityManager.createQuery("FROM Administrador ", Administrador.class );
        return query.getResultList();
    }

    @Override
    public void updateUsername(Administrador administrador, String username) {
        administrador.setUsername(username);
        entityManager.merge(administrador);
    }

    @Override
    public void updateNombre(Administrador administrador, String nombre) {
        administrador.setName(nombre);
        entityManager.merge(nombre);
    }

    @Override
    public void updateEmail(Administrador administrador, String email) {
        administrador.setEmail(email);
        entityManager.merge(administrador);
    }

    @Override
    public void updatePassword(Administrador administrador, String password) {
        administrador.setPassword(password);
        entityManager.merge(administrador);
    }
}
