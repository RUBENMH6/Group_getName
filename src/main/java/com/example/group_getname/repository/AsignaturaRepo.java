package com.example.group_getname.repository;

import com.example.group_getname.models.entity.Asignatura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsignaturaRepo extends JpaRepository<Asignatura, Integer> {
}
