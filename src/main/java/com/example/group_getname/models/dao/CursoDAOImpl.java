package com.example.group_getname.models.dao;

import com.example.group_getname.models.entity.Curso;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

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

    @Override
    public Curso getForId(int id) {
        return entityManager.find(Curso.class, id);
    }

    @Override
    public List<Curso> findAll() {
        TypedQuery<Curso> query = entityManager.createQuery("FROM Curso ", Curso.class );
        return query.getResultList();
    }

    @Override
    public List<Curso> findAllActive() {
        TypedQuery<Curso> query = entityManager.createQuery("FROM Curso WHERE activo = 1", Curso.class );
        return query.getResultList();
    }

    @Override
    public List<Curso> findAllFechaInicio(Date fechaInicio) {
        TypedQuery<Curso> query = entityManager.createQuery("FROM Curso WHERE fechaInicio >= :fechaInicio", Curso.class );
        query.setParameter("fechaInicio", fechaInicio);
        return query.getResultList();
    }


    @Override
    public List<Curso> findAllFechaFin(Date fechaFin) {
        TypedQuery<Curso> query = entityManager.createQuery("FROM Curso WHERE fechaFin <= :fechaFin", Curso.class );
        query.setParameter("fechaFin", fechaFin);
        return query.getResultList();
    }

    @Override
    public void updateIdCurso(Curso curso, int id) {
        curso.setIdCurso(id);
        entityManager.merge(curso);
    }

    @Override
    public void updateNombre(Curso curso, String nombre) {
        curso.setNombre(nombre);
        entityManager.merge(curso);
    }

    @Override
    public void updateDescripcion(Curso curso, String descripcion) {
        curso.setDescripcion(descripcion);
        entityManager.merge(curso);
    }

    @Override
    public void updateFechaInicio(Curso curso, Date fechaInicio) {
        curso.setFechaInicio(fechaInicio);
        entityManager.merge(curso);
    }

    @Override
    public void updateFechaFin(Curso curso, Date fechaFin) {
        curso.setFechaFin(fechaFin);
        entityManager.merge(curso);
    }

    @Override
    public void updateActivo(Curso curso) {
        if (curso.getActivo() == 0) {
            curso.setActivo(1);
        } else {
            curso.setActivo(0);
        }
        entityManager.merge(curso);
    }

}
