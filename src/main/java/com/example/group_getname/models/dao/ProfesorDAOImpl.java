package com.example.group_getname.models.dao;

import com.example.group_getname.models.entity.Profesor;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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

    @Override
    public Profesor getForId(int id) {
        return entityManager.find(Profesor.class, id);
    }

    @Override
    public List<Profesor> findAll() {
        TypedQuery<Profesor> query = entityManager.createQuery("FROM Profesor ", Profesor.class );
        return query.getResultList();

    }

    @Override
    public List<Profesor> findName(String nombre) {
        TypedQuery<Profesor> query = entityManager.createQuery("FROM Profesor WHERE nombre = :nombre ", Profesor.class );
        query.setParameter("nombre", nombre);
        return query.getResultList();

    }

    @Override
    public List<Profesor> findApellido(String apellido) {
        TypedQuery<Profesor> query = entityManager.createQuery("FROM Profesor WHERE apellido = :apellido ", Profesor.class );
        query.setParameter("apellido", apellido);
        return query.getResultList();
    }

    @Override
    public List<Profesor> findEmail(String email) {
        TypedQuery<Profesor> query = entityManager.createQuery("FROM Profesor WHERE email = :email ", Profesor.class );
        query.setParameter("email", email);
        return query.getResultList();
    }

    @Override
    public List<Profesor> findNif(String nif) {
        TypedQuery<Profesor> query = entityManager.createQuery("FROM Profesor WHERE nif = :nif ", Profesor.class );
        query.setParameter("nif", nif);
        return query.getResultList();
    }

    @Override
    public List<Profesor> findTelefono(int telefono) {
        TypedQuery<Profesor> query = entityManager.createQuery("FROM Profesor WHERE telefono = :telefono ", Profesor.class );
        query.setParameter("telefono", telefono);
        return query.getResultList();
    }

    @Override
    public void updateId(Profesor profesor, int id) {
        profesor.setIdProfesor(id);
        entityManager.merge(profesor);
    }

    @Override
    public void updateNombre(Profesor profesor, String nombre) {
        profesor.setNombre(nombre);
        entityManager.merge(profesor);
    }

    @Override
    public void updateApellido(Profesor profesor, String apellido) {
        profesor.setApellido(apellido);
        entityManager.merge(profesor);
    }

    @Override
    public void updateEmail(Profesor profesor, String email) {
        profesor.setEmail(email);
        entityManager.merge(profesor);
    }

    @Override
    public void updateNif(Profesor profesor, String nif) {
        profesor.setNif(nif);
        entityManager.merge(profesor);
    }

    @Override
    public void updateTelefono(Profesor profesor, int telefono) {
        profesor.setTelefono(telefono);
        entityManager.merge(profesor);
    }

}
