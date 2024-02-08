package com.example.group_getname.services;


import com.example.group_getname.models.entity.Profesor;
import com.example.group_getname.repository.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ProfesorService implements IProfesorService{

    @Autowired
    private ProfesorRepository profesorRepository;

    @Override
    public List<Profesor> findAll() {
        return this.profesorRepository.findAll();
    }

    @Override
    public Optional<Profesor> findById(int id) {
        return this.profesorRepository.findById(id);
    }

    @Override
    public Profesor create(Profesor profesor) {
        return this.profesorRepository.save(profesor);
    }

    @Override
    public Profesor update(Profesor profesor) {
        Profesor newProfesor = this.profesorRepository.findById(profesor.getId_profesor()).get();
        newProfesor.setId_profesor(profesor.getId_profesor());
        newProfesor.setNombre(profesor.getNombre());
        newProfesor.setApellido(profesor.getApellido());
        newProfesor.setTelefono(profesor.getTelefono());
        newProfesor.setNif(profesor.getNif());
        newProfesor.setEmail(profesor.getEmail());
        return profesorRepository.save(newProfesor);
    }

    @Override
    public void delete(int id) {
        Optional<Profesor> profesor = profesorRepository.findById(id);
        System.out.println(profesor);
        profesorRepository.deleteById(id);
    }
}
