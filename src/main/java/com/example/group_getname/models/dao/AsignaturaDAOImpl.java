package com.example.group_getname.models.dao;

import com.example.group_getname.models.entity.Asignatura;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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

    @Override
    public Asignatura getForId(int id) {
        return entityManager.find(Asignatura.class, id);
    }

    @Override
    public List<Asignatura> findAll() {
        TypedQuery<Asignatura> query = entityManager.createQuery("FROM Asignatura ", Asignatura.class );
        return query.getResultList();
    }

    @Override
    public List<Asignatura> findAllProfesor(int idProfesor) {
        TypedQuery<Asignatura> query = entityManager.createQuery("FROM Asignatura WHERE idProfesor = :idProfesor", Asignatura.class);
        query.setParameter("idProfesor", idProfesor);
        return query.getResultList();
    }

    @Override
    public List<Asignatura> findAllCurso(int idCurso) {
        TypedQuery<Asignatura> query = entityManager.createQuery("FROM Asignatura WHERE idCurso = :idCurso", Asignatura.class);
        query.setParameter("idCurso", idCurso);
        return query.getResultList();
    }

    @Override
    public List<Asignatura> findAllHorario(int idHorario) {
        TypedQuery<Asignatura> query = entityManager.createQuery("FROM Asignatura WHERE idHorario = :idHorario", Asignatura.class);
        query.setParameter("idHorario", idHorario);
        return query.getResultList();
    }

    @Override
    @Transactional
    public void updateName(Asignatura asignatura, String nombre) {
        asignatura.setNombre(nombre);
        entityManager.merge(asignatura);
    }

    @Override
    public void updateIdProfesor(Asignatura asignatura, int idProf) {
        asignatura.setIdProfesor(idProf);
        entityManager.merge(asignatura);
    }

    @Override
    public void updateIdCurso(Asignatura asignatura, int idCurso) {
        asignatura.setIdCurso(idCurso);
        entityManager.merge(asignatura);
    }

    @Override
    public void updateIdHorario(Asignatura asignatura, int idHorario) {
        asignatura.setIdHorario(idHorario);
        entityManager.merge(asignatura);
    }

}
