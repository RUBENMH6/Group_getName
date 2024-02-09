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
        List<Estudiante> estudiantes = estudianteRepository.findAll();
        for (Estudiante e : estudiantes){
            if (e.getId_estudiante() == estudiante.getId_estudiante()) {
                break;
            }
        }
        return this.estudianteRepository.save(estudiante);
    }

    @Override
    public Estudiante update(Estudiante estudiante) {
        Estudiante newEstudiante = this.estudianteRepository.findById(estudiante.getId_estudiante()).get();
        newEstudiante.setUsername(estudiante.getUsername());
        newEstudiante.setPassword(estudiante.getPassword());
        newEstudiante.setNombre(estudiante.getNombre());
        newEstudiante.setApellido(estudiante.getApellido());
        newEstudiante.setNif(estudiante.getNif());
        newEstudiante.setTelefono(estudiante.getTelefono());
        newEstudiante.setEmail(estudiante.getEmail());
        //la fecha de registro y el id no se modifican.
        return estudianteRepository.save(newEstudiante);
    }

    @Override
    public void delete(int id) {
        Optional<Estudiante> estudiante = estudianteRepository.findById(id);
        System.out.println(estudiante);
        estudianteRepository.deleteById(id);
    }
}
