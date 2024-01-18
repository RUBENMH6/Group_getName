package com.example.group_getname.services;

import com.example.group_getname.models.entity.Estudiante;
import com.example.group_getname.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudianteService implements IEstudianteService{

    @Autowired
    private EstudianteRepository estudianteRepository;

    @Override
    public List<Estudiante> findAll() {
        return this.estudianteRepository.findAll();
    }

    @Override
    public Optional<Estudiante> findById(int id) {
        return this.estudianteRepository.findById(id);
    }

    @Override
    public Estudiante create(Estudiante estudiante) {
        return this.estudianteRepository.save(estudiante);
    }

    @Override
    public Estudiante update(Estudiante estudiante) {
        Estudiante newEstudiante = this.estudianteRepository.findById(estudiante.getId_estudiante()).get();
        newEstudiante.setNombre(estudiante.getNombre());
        newEstudiante.setApellido(estudiante.getApellido());
        newEstudiante.setNif(estudiante.getNif());
        return newEstudiante;
    }

    @Override
    public void delete(int id) {
        Optional<Estudiante> estudiante = estudianteRepository.findById(id);
        System.out.println(estudiante);
        estudianteRepository.deleteById(id);
    }
}
