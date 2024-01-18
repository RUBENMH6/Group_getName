package com.example.group_getname.seed;

import com.example.group_getname.models.entity.Asignatura;
import com.example.group_getname.models.entity.Curso;
import com.example.group_getname.repository.AsignaturaRepository;
import com.example.group_getname.repository.CursoRepository;

import java.util.Date;

public class Seed {
    private AsignaturaRepository asignaturaRepository;
    private CursoRepository cursoRepository;

    public Seed(AsignaturaRepository asignaturaRepository, CursoRepository cursoRepository)  {
        this.asignaturaRepository = asignaturaRepository;
        this.cursoRepository = cursoRepository;
    }

    public void generateSeeds(){
        Curso curso1 = new Curso(1,"Curso 1", "Descripcion 1", new Date(2023,9,10), new Date(2024,5,20), 1);
        Curso curso2 = new Curso(2, "Curso 2", "Descripcion 2", new Date(2023,9,10), new Date(2024,5,20), 1);
        Curso curso3 = new Curso(3, "Curso 3", "Descripcion 3", new Date(2023,9,10), new Date(2024,5,20), 1);
        Curso curso4 = new Curso(4, "Curso 4", "Descripcion 4", new Date(2023,9,10), new Date(2024,5,20), 1);
        Curso curso5 = new Curso(5, "Curso 5", "Descripcion 5", new Date(2023,9,10), new Date(2024,5,20), 1);

        cursoRepository.save(curso1);
        cursoRepository.save(curso2);
        cursoRepository.save(curso3);
        cursoRepository.save(curso4);
        cursoRepository.save(curso5);





    }

}


