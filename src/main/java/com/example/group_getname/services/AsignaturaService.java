package com.example.group_getname.services;

import com.example.group_getname.models.entity.Asignatura;
import com.example.group_getname.repository.AsignaturaRepo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class AsignaturaService implements IAsignaturaService {

    @Autowired
    private AsignaturaRepo asignaturaRepo;




    @Override
    public List<Asignatura> findAll() {
        return this.asignaturaRepo.findAll();
    }


    @Override
    public Optional<Asignatura> findById(int id) {
        return asignaturaRepo.findById(id);
    }

    @Override
    public Asignatura create(Asignatura asignatura) {
        return asignaturaRepo.save(asignatura);
    }

    @Override
    public Asignatura update(Asignatura asignaturas) {
        Asignatura currentProducts= asignaturaRepo.findById(asignaturas.getId()).get();
        currentProducts.setNombre(asignaturas.getNombre());
        return asignaturaRepo.save(currentProducts);
    }

    @Override
    public void delete(int id) {
        Optional<Asignatura> product=asignaturaRepo.findById(id);
        System.out.println(product);
        asignaturaRepo.deleteById(id);

    }

}
