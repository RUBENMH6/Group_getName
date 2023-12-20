package com.example.group_getname.models.dao;

import com.example.group_getname.models.entity.Administrador;
import com.example.group_getname.models.entity.Curso;
import com.example.group_getname.models.entity.Horario;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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
}
