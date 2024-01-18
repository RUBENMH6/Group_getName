package com.example.group_getname.services;

import com.example.group_getname.models.entity.Curso;
import com.example.group_getname.models.entity.Horario;
import com.example.group_getname.repository.HorarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HorarioService implements IHorarioService{

    @Autowired
    private HorarioRepository horarioRepository;

    @Override
    public List<Horario> findAll() {
        return this.horarioRepository.findAll();
    }

    @Override
    public Optional<Horario> findById(int id) {
        return this.horarioRepository.findById(id);
    }

    @Override
    public Horario create(Horario horario) {
        return this.horarioRepository.save(horario);
    }

    @Override
    public Horario update(Horario horario) {
        Horario newHorario = this.horarioRepository.findById(horario.getIdHorario()).get();
        newHorario.setTiempoAcaba(horario.getTiempoAcaba());
        newHorario.setTiempoEmpieza(horario.getTiempoEmpieza());
        return newHorario;
    }

    @Override
    public void delete(int id) {
        Optional<Horario> horario = horarioRepository.findById(id);
        System.out.println(horario);
        horarioRepository.deleteById(id);
    }
}