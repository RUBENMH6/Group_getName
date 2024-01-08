package com.example.group_getname.models.dao;

import com.example.group_getname.models.entity.Estudiante;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public class EstudianteDAOImpl implements EstudianteDAO{
    EntityManager entityManager;
    @Autowired
    public EstudianteDAOImpl(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }
    @Override
    public void save(Estudiante estudiante) {
        entityManager.persist(estudiante);
    }

    @Override
    public Estudiante getForId(int id) {
        return entityManager.find(Estudiante.class, id);
    }

    @Override
    public List<Estudiante> findAll() {
        TypedQuery<Estudiante> query = entityManager.createQuery("FROM Estudiante", Estudiante.class);
        return query.getResultList();
    }

    @Override
    public List<Estudiante> findName(String nombre) {
        TypedQuery<Estudiante> query = entityManager.createQuery("FROM Estudiante WHERE nombre = :nombre", Estudiante.class);
        query.setParameter("nombre", nombre);
        return query.getResultList();
    }

    @Override
    public List<Estudiante> findApellido(String apellido) {
        TypedQuery<Estudiante> query = entityManager.createQuery("FROM Estudiante WHERE apellido = :apellido", Estudiante.class);
        query.setParameter("apellido",apellido);
        return query.getResultList();
    }

    @Override
    public List<Estudiante> findUsername(String username) {
        TypedQuery<Estudiante> query = entityManager.createQuery("FROM Estudiante WHERE username = :username", Estudiante.class);
        query.setParameter("username",username);
        return query.getResultList();
    }

    @Override
    public List<Estudiante> findNif(String nif) {
        TypedQuery<Estudiante> query = entityManager.createQuery("FROM Estudiante WHERE nif = :nif", Estudiante.class);
        query.setParameter("nif",nif);
        return query.getResultList();
    }

    @Override
    public List<Estudiante> findTelefono(String telefono) {
        TypedQuery<Estudiante> query = entityManager.createQuery("FROM Estudiante WHERE telefono = :telefono", Estudiante.class);
        query.setParameter("telefono",telefono);
        return query.getResultList();
    }

    @Override
    public List<Estudiante> findDateRegistered(Date dateRegistered) {
        TypedQuery<Estudiante> query = entityManager.createQuery("FROM Estudiante WHERE dateRegistered = :dateRegistered", Estudiante.class);
        query.setParameter("dateRegistered", dateRegistered);
        return query.getResultList();
    }

    @Override
    public void updateId(Estudiante estudiante, int id) {
        estudiante.setIdEstudiante(id);
        entityManager.merge(estudiante);
    }

    @Override
    public void updateNombre(Estudiante estudiante, String nombre) {
        estudiante.setNombre(nombre);
        entityManager.merge(estudiante);
    }

    @Override
    public void updateApellido(Estudiante estudiante, String apellido) {
        estudiante.setApellido(apellido);
        entityManager.merge(estudiante);
    }

    @Override
    public void updatePassword(Estudiante estudiante, String password) {
        estudiante.setPassword(password);
        entityManager.merge(estudiante);
    }
    @Override
    public void updateUsername(Estudiante estudiante, String username) {
        estudiante.setUsername(username);
        entityManager.merge(estudiante);
    }

    @Override
    public void updateNif(Estudiante estudiante, String nif) {
        estudiante.setNif(nif);
        entityManager.merge(estudiante);
    }

    @Override
    public void updateTelefono(Estudiante estudiante, String telefono) {
        estudiante.setTelefono(telefono);
        entityManager.merge(estudiante);
    }

    @Override
    public void updateDateRegistered(Estudiante estudiante, Date dateRegistered) {
        estudiante.setDateRegistered(dateRegistered);
        entityManager.merge(estudiante);
    }
}
