package com.example.group_getname.services;

import com.example.group_getname.models.entity.Matricula;
import com.example.group_getname.repository.MatriculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MatriculaService implements IMatriculaService{

    @Autowired
    private MatriculaRepository matriculaRepository;

    @Override
    public List<Matricula> findAll() {
        return this.matriculaRepository.findAll();
    }

    @Override
    public Optional<Matricula> findById(int id) {
        return this.matriculaRepository.findById(id);
    }

    @Override
    public Matricula create(Matricula matricula) {
        return this.matriculaRepository.save(matricula);
    }

    @Override
    public Matricula update(Matricula matricula) {
        Matricula newMatricula = this.matriculaRepository.findById(matricula.getIdMatricula()).get();
        newMatricula.setEstado(matricula.getEstado());
        return newMatricula;
    }

    @Override
    public void delete(int id) {
        Optional<Matricula> matricula = matriculaRepository.findById(id);
        System.out.println(matricula);
        matriculaRepository.deleteById(id);
    }
}
