package com.example.group_getname.models.dao;

import com.example.group_getname.models.entity.Curso;
import com.example.group_getname.models.entity.Matricula;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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

    @Override
    public Matricula getForId(int id) {
        return entityManager.find(Matricula.class, id);
    }

    @Override
    public List<Matricula> findAll() {
        TypedQuery<Matricula> query = entityManager.createQuery("FROM Matricula", Matricula.class);
        return query.getResultList();
    }

    @Override
    public List<Matricula> findEstudiante(int idEstudiante) {
        TypedQuery<Matricula> query = entityManager.createQuery("FROM Matricula WHERE id_estudiante = :idEstudiante", Matricula.class);
        query.setParameter("idEstudiante", idEstudiante);
        return query.getResultList();
    }

    @Override
    public List<Matricula> findCurso(int idCurso) {
        TypedQuery<Matricula> query = entityManager.createQuery("FROM Matricula WHERE id_curso = :idCurso", Matricula.class);
        query.setParameter("idCurso", idCurso);
        return query.getResultList();
    }

    @Override
    public List<Matricula> findEstadoActivo() {
        TypedQuery<Matricula> query = entityManager.createQuery("FROM Matricula WHERE estado = 1", Matricula.class);
        return query.getResultList();
    }

    @Override
    public void updateId(Matricula matricula, int id) {
        matricula.setId_matricula(id);
        entityManager.merge(matricula);
    }

    @Override
    public void updateIdEstudiante(Matricula matricula, int idEstudiante) {
        matricula.setId_estudiante(idEstudiante);
        entityManager.merge(matricula);
    }

    @Override
    public void updateIdCurso(Matricula matricula, int idCurso) {
        matricula.setId_curso(idCurso);
        entityManager.merge(matricula);
    }

    @Override
    public void updateEstado(Matricula matricula) {
        if (matricula.getEstado() == 1) {
            matricula.setEstado(0);
        } else {
            matricula.setEstado(1);
        }
        entityManager.merge(matricula);
    }

}




