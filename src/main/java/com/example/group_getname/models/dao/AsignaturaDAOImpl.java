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
    @Transactional
    public void updateName(Asignatura asignatura, String nombre) {
        asignatura.setNombre(nombre);
        entityManager.merge(asignatura);
    }

    @Override
    public void updateIdProfesor(Asignatura asignatura, int idProf) {
        asignatura.setId_profesor(idProf);
        entityManager.merge(asignatura);
    }

    @Override
    public void updateIdCurso(Asignatura asignatura, int idCurso) {
        asignatura.setId_curso(idCurso);
        entityManager.merge(asignatura);
    }

    @Override
    public void updateIdHorario(Asignatura asignatura, int idHorario) {
        asignatura.setId_horario(idHorario);
        entityManager.merge(asignatura);
    }

}
