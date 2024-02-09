package com.example.group_getname.services;

import com.example.group_getname.models.entity.Curso;
import com.example.group_getname.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CursoService implements ICursoService{

    @Autowired
    private CursoRepository cursoRepository;
    @Override
    public List<Curso> findAll() {
        return this.cursoRepository.findAll();
    }

    @Override
    public Optional<Curso> findById(int id) {
        return this.cursoRepository.findById(id);
    }

    @Override
    public Curso create(Curso curso) {
        return this.cursoRepository.save(curso);
    }

    @Override
    public Curso update(Curso curso) {
        Curso newCurso = cursoRepository.findById(curso.getId_curso()).get();
        newCurso.setNombre(curso.getNombre());
        newCurso.setDescripcion(curso.getDescripcion());
        newCurso.setFecha_inicio(curso.getFecha_inicio());
        newCurso.setFecha_fin(curso.getFecha_fin());
        newCurso.setActivo(curso.getActivo());
        return cursoRepository.save(newCurso);
    }

    @Override
    public void delete(int id) {
        Optional<Curso> curso= cursoRepository.findById(id);
        System.out.println(curso);
        cursoRepository.deleteById(id);
    }
}
