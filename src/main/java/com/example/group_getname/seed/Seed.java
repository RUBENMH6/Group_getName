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
        Curso curso1 = new Curso(1,"Acceso a datos", "Descripcion 1", new Date(2023,9,10), new Date(2024,5,20), 1);
        Curso curso2 = new Curso(2, "Desarrollo Multimedia", "Descripcion 2", new Date(2023,9,10), new Date(2024,5,20), 1);
        Curso curso3 = new Curso(3, "Desarrollo Interfaces", "Descripcion 3", new Date(2023,9,10), new Date(2024,5,20), 1);
        Curso curso4 = new Curso(4, "Gestión empresarial", "Descripcion 4", new Date(2023,9,10), new Date(2024,5,20), 1);
        Curso curso5 = new Curso(5, "Servicios y procesos", "Descripcion 5", new Date(2023,9,10), new Date(2024,5,20), 1);

        cursoRepository.save(curso1);
        cursoRepository.save(curso2);
        cursoRepository.save(curso3);
        cursoRepository.save(curso4);
        cursoRepository.save(curso5);

        //Profesor
        Profesor profesor1 = new Profesor(1,"Pedro", "Segarra",21212,"ES12345678A","pedro@gmail.com");
        Profesor profesor2 = new Profesor(2,"Raúl Pedro", "Aceñero",21212,"ES12345678A","raul@gmail.com");
        Profesor profesor3 = new Profesor(3,"Alicia", "Pitarch",21212,"ES12345678A","alicia@gmail.com");
        Profesor profesor4 = new Profesor(4,"Carlos", "Saport",21212,"ES12345678A","carlos@gmail.com");
        Profesor profesor5 = new Profesor(5,"Aitor", "Ventura",21212,"ES12345678A","aitor@gmail.com");


        profesorRepository.save(profesor1);
        profesorRepository.save(profesor2);
        profesorRepository.save(profesor3);
        profesorRepository.save(profesor4);
        profesorRepository.save(profesor5);

        //Horarios

        Horario horario1 = new Horario(1,1,new Time(15000), new Time(25000), new Date(2023,9,10));
        Horario horario2 = new Horario(2,1,new Time(15000), new Time(25000), new Date(2023,9,10));
        Horario horario3 = new Horario(3,1,new Time(15000), new Time(25000), new Date(2023,9,10));
        Horario horario4 = new Horario(4,1,new Time(15000), new Time(25000), new Date(2023,9,10));
        Horario horario5 = new Horario(5,1,new Time(15000), new Time(25000), new Date(2023,9,10));

//        horarioRepository.save(horario1);
//        horarioRepository.save(horario2);
//        horarioRepository.save(horario3);
//        horarioRepository.save(horario4);
//        horarioRepository.save(horario5);



        //Estudiantes

        Estudiante estudiante1 = new Estudiante(1,"sebas","test123","sebas@gmail.com", "Sebastian","Ogueta","14545445","ES32145678B", new Date(2023-8-30));
        Estudiante estudiante2 = new Estudiante(2,"ruben","test123","ruben@gmail.com", "Rubén","Martínez","14545445","ES32145678B", new Date(2023-8-30));
        Estudiante estudiante3 = new Estudiante(3,"licheng","test123","licheng@gmail.com", "Licheng","Qiu","14545445","ES32145678B", new Date(2023-8-30));
        Estudiante estudiante4 = new Estudiante(4,"lucia","test123","lucia@gmail.com", "Lucía","Olmedo","14545445","ES32145678B", new Date(2023-8-30));

        estudianteRepository.save(estudiante1);
        estudianteRepository.save(estudiante2);
        estudianteRepository.save(estudiante3);
        estudianteRepository.save(estudiante4);

        //Matricula

        Matricula matricula1 = new Matricula(1,1, 1,1);
        Matricula matricula2 = new Matricula(2,1,1,1);
        Matricula matricula3 = new Matricula(3,1,1,1);
        Matricula matricula4 = new Matricula(4,1,1,1);
        Matricula matricula5 = new Matricula(5,1,1,1);

//        matriculaRepository.save(matricula1);
//        matriculaRepository.save(matricula2);
//        matriculaRepository.save(matricula3);
//        matriculaRepository.save(matricula4);
//        matriculaRepository.save(matricula5);


    }

}


