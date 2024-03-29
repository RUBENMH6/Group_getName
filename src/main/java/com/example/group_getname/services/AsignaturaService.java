package com.example.group_getname.services;

import com.example.group_getname.models.entity.Asignatura;
import com.example.group_getname.repository.AsignaturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AsignaturaService implements IAsignaturaService {

    @Autowired
    private AsignaturaRepository asignaturaRepository;




    @Override
    public List<Asignatura> findAll() {
        return this.asignaturaRepository.findAll();
    }


    @Override
    public Optional<Asignatura> findById(int id) {
        return asignaturaRepository.findById(id);
    }

    @Override
    public Asignatura create(Asignatura asignatura) {
        return asignaturaRepository.save(asignatura);
    }

    @Override
    public Asignatura update(Asignatura asignatura) {
        Asignatura newAsignatura = asignaturaRepository.findById(asignatura.getId()).get();
        newAsignatura.setId_profesor(asignatura.getId_profesor());
        newAsignatura.setId_curso(asignatura.getId_curso());
        newAsignatura.setId_horario(asignatura.getId_horario());
        newAsignatura.setNombre(asignatura.getNombre());
        newAsignatura.setColor(asignatura.getColor());
        return asignaturaRepository.save(newAsignatura);
    }

    @Override
    public void delete(int id) {
        asignaturaRepository.deleteById(id);

    }

}
