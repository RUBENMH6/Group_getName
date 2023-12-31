package com.example.group_getname.models.dao;

import com.example.group_getname.models.entity.Horario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Time;
import java.sql.Date;
import java.util.List;

@Repository
public class HorarioDAOImpl implements HorarioDAO {

    private EntityManager entityManager;

    @Autowired
    public HorarioDAOImpl(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }

    @Override
    public void save(Horario horario) {
        entityManager.persist(horario);
    }

    @Override
    public Horario getForId(int id) {
        return entityManager.find(Horario.class, id);
    }

    @Override
    public List<Horario> findAll() {
        TypedQuery<Horario> query = entityManager.createQuery("FROM Horario ", Horario.class );
        return query.getResultList();
    }

    @Override
    public List<Horario> findAllDia(Date dia) {
        TypedQuery<Horario> query = entityManager.createQuery("FROM Horario WHERE dia = :dia", Horario.class );
        query.setParameter("dia", dia);
        return query.getResultList();
    }

    @Override
    public List<Horario> findAllTiempoEmpieza(Time tiempoEmpieza) {
        TypedQuery<Horario> query = entityManager.createQuery("FROM Horario WHERE tiempoEmpieza = :tiempoEmpieza", Horario.class );
        query.setParameter("tiempoEmpieza", tiempoEmpieza);
        return query.getResultList();
    }

    @Override
    public List<Horario> findAllTiempoAcaba(Time tiempoAcaba) {
        TypedQuery<Horario> query = entityManager.createQuery("FROM Horario WHERE tiempoAcaba = :tiempoAcaba", Horario.class );
        query.setParameter("tiempoAcaba", tiempoAcaba);
        return query.getResultList();
    }

    @Override
    public void updateIdHorario(Horario horario, int idHorario) {
        horario.setIdHorario(idHorario);
        entityManager.merge(horario);
    }

    @Override
    public void updateIdClase(Horario horario, int idClase) {
        horario.setIdAsignatura(idClase);
        entityManager.merge(horario);
    }

    @Override
    public void updateTiempoEmpieza(Horario horario, Time tiempoEmpieza) {
        horario.setTiempoEmpieza(tiempoEmpieza);
        entityManager.merge(horario);
    }

    @Override
    public void updateTiempoAcaba(Horario horario, Time tiempoAcaba) {
        horario.setTiempoAcaba(tiempoAcaba);
        entityManager.merge(horario);
    }

    @Override
    public void updateDia(Horario horario, Date dia) {
        horario.setDia(dia);
        entityManager.merge(horario);
    }
}
