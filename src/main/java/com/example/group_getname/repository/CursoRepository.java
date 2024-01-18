package com.example.group_getname.repository;

import com.example.group_getname.models.entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer> {
}
