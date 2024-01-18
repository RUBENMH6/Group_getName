package com.example.group_getname.seed;

import com.example.group_getname.models.entity.*;
import com.example.group_getname.repository.*;

import java.sql.Time;
import java.util.Date;

public class Seed {
    private AsignaturaRepository asignaturaRepository;
    private CursoRepository cursoRepository;
    private HorarioRepository horarioRepository;
    private EstudianteRepository estudianteRepository;
    private MatriculaRepository matriculaRepository;
    private ProfesorRepository profesorRepository;

    public Seed(AsignaturaRepository asignaturaRepository, CursoRepository cursoRepository, HorarioRepository horarioRepository, EstudianteRepository estudianteRepository, MatriculaRepository matriculaRepository, ProfesorRepository profesorRepository) {
        this.asignaturaRepository = asignaturaRepository;
        this.cursoRepository = cursoRepository;
        this.horarioRepository = horarioRepository;
        this.estudianteRepository = estudianteRepository;
        this.matriculaRepository = matriculaRepository;
        this.profesorRepository = profesorRepository;
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
        Profesor profesor2 = new Profesor(2,"Pedro", "Segarra",21212,"ES12345678A","pedro@gmail.com");
        Profesor profesor3 = new Profesor(3,"Pedro", "Segarra",21212,"ES12345678A","pedro@gmail.com");
        Profesor profesor4 = new Profesor(4,"Pedro", "Segarra",21212,"ES12345678A","pedro@gmail.com");
        Profesor profesor5 = new Profesor(5,"Pedro", "Segarra",21212,"ES12345678A","pedro@gmail.com");


        profesorRepository.save(profesor1);
        profesorRepository.save(profesor2);
        profesorRepository.save(profesor3);
        profesorRepository.save(profesor4);
        profesorRepository.save(profesor5);

//        Horario horario1 = new Horario(1,1,new Time(15000), new Time(25000), new Date(2023,9,10));
//        Horario horario2 = new Horario(2,1,new Time(15000), new Time(25000), new Date(2023,9,10));
//        Horario horario3 = new Horario(3,1,new Time(15000), new Time(25000), new Date(2023,9,10));
//        Horario horario4 = new Horario(4,1,new Time(15000), new Time(25000), new Date(2023,9,10));
//        Horario horario5 = new Horario(5,1,new Time(15000), new Time(25000), new Date(2023,9,10));
//
//        horarioRepository.save(horario1);
//        horarioRepository.save(horario2);
//        horarioRepository.save(horario3);
//        horarioRepository.save(horario4);
//        horarioRepository.save(horario5);


        Asignatura asignatura1 = new Asignatura(1, 1, 1, 1,"Álgebra Lineal", "Rojo");

        Estudiante estudiante1 = new Estudiante(1,"sebas","test123","sebas@gmail.com", "Sebastian","Ogueta","14545445","ES32145678B", new Date(2023-8-30));
        Estudiante estudiante2 = new Estudiante(2,"sebas","test123","sebas@gmail.com", "Sebastian","Ogueta","14545445","ES32145678B", new Date(2023-8-30));
        Estudiante estudiante3 = new Estudiante(3,"sebas","test123","sebas@gmail.com", "Sebastian","Ogueta","14545445","ES32145678B", new Date(2023-8-30));
        Estudiante estudiante4 = new Estudiante(4,"sebas","test123","sebas@gmail.com", "Sebastian","Ogueta","14545445","ES32145678B", new Date(2023-8-30));
        Estudiante estudiante5 = new Estudiante(5,"sebas","test123","sebas@gmail.com", "Sebastian","Ogueta","14545445","ES32145678B", new Date(2023-8-30));

        estudianteRepository.save(estudiante1);
        estudianteRepository.save(estudiante2);
        estudianteRepository.save(estudiante3);
        estudianteRepository.save(estudiante4);
        estudianteRepository.save(estudiante5);

//        Matricula matricula1 = new Matricula(1,estudiante1.getId_estudiante(),curso1.getId_curso(),1);
//        Matricula matricula2 = new Matricula(2,estudiante1.getId_estudiante(),curso1.getId_curso(),1);
//        Matricula matricula3 = new Matricula(3,estudiante1.getId_estudiante(),curso1.getId_curso(),1);
//        Matricula matricula4 = new Matricula(4,estudiante1.getId_estudiante(),curso1.getId_curso(),1);
//        Matricula matricula5 = new Matricula(5,estudiante1.getId_estudiante(),curso1.getId_curso(),1);
//
//        matriculaRepository.save(matricula1);
//        matriculaRepository.save(matricula2);
//        matriculaRepository.save(matricula3);
//        matriculaRepository.save(matricula4);
//        matriculaRepository.save(matricula5);

//profesorRepository.save(profesor1);
//
//        //Horario
//
//
//  horarioRepository.save(horario1);
//
//        //Asignatura
//
//
//     asignaturaRepository.save(asignatura1);
//
//        //Estudiante
//
//
 //       estudianteRepository.save(estudiante1);
//
//        //Matricula
//
//
//        matriculaRepository.save(matricula1);





    }

}


