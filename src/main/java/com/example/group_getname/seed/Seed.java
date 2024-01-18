package com.example.group_getname.seed;

import com.example.group_getname.models.entity.*;
import com.example.group_getname.repository.AsignaturaRepository;
import com.example.group_getname.repository.CursoRepository;

import java.sql.Time;
import java.util.Date;

public class Seed {
    private AsignaturaRepository asignaturaRepository;
    private CursoRepository cursoRepository;

    public Seed(AsignaturaRepository asignaturaRepository, CursoRepository cursoRepository)  {
        this.asignaturaRepository = asignaturaRepository;
        this.cursoRepository = cursoRepository;
    }

    public void generateSeeds(){
        //Cursos
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

        //Profesor
        Profesor profesor1 = new Profesor(1,"Pedro", "Segarra",21212,"ES12345678A","pedro@gmail.com");

        //Horario
        Horario horario1 = new Horario(1,1,new Time(15000), new Time(25000), new Date(2023,9,10));

        //Asignatura

        Asignatura asignatura1 = new Asignatura(1, 1, 1, 1,"Álgebra Lineal", "Rojo",profesor1, curso1, horario1);

        //Estudiante

        Estudiante estudiante1 = new Estudiante(1,"sebas","test123","sebas@gmail.com", "Sebastian","Ogueta","14545445","ES32145678B", new Date(2023-8-30));

        //Matricula

        Matricula matricula1 = new Matricula(1,1,1,1);






    }

}


