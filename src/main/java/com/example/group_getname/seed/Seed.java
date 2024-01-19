package com.example.group_getname.seed;

import com.example.group_getname.models.entity.*;
import com.example.group_getname.repository.*;

import java.sql.Time;
import java.time.LocalDate;
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
        Curso curso1 = new Curso(1,"1CFS", "DAM", LocalDate.of(2023,9,10), LocalDate.of(2024,5,20), 1);
        Curso curso2 = new Curso(2, "1CFS", "DAW", LocalDate.of(2023,9,10),  LocalDate.of(2024,5,20), 1);
        Curso curso3 = new Curso(3, "2CFS", "DAM", LocalDate.of(2023,9,10), LocalDate.of(2024,5,20), 1);
        Curso curso4 = new Curso(4, "2CFS", "DAW", LocalDate.of(2023,9,10),  LocalDate.of(2024,5,20), 1);

        cursoRepository.save(curso1);
        cursoRepository.save(curso2);
        cursoRepository.save(curso3);
        cursoRepository.save(curso4);

        //Profesor
        Profesor profesor1 = new Profesor(1,"Pedro", "Segarra",612345678,"12345678A","pedro@gmail.com");
        Profesor profesor2 = new Profesor(2,"Raúl Pedro", "Aceñero",655432189,"98765432B","raul@gmail.com");
        Profesor profesor3 = new Profesor(3,"Alicia", "Pitarch",677890123,"45678901C","alicia@gmail.com");
        Profesor profesor4 = new Profesor(4,"Carlos", "Saport",644567890,"78901234D","carlos@gmail.com");
        Profesor profesor5 = new Profesor(5,"Aitor", "Ventura",688901234,"56789012E","aitor@gmail.com");


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

        horarioRepository.save(horario1);
        horarioRepository.save(horario2);
        horarioRepository.save(horario3);
        horarioRepository.save(horario4);
        horarioRepository.save(horario5);



        //Estudiantes

        Estudiante estudiante1 = new Estudiante(1,"sebas","test123","sebas@gmail.com", "Sebastian","Ogueta",655432198,"99887766H", LocalDate.of(2023, 8, 30));
        Estudiante estudiante2 = new Estudiante(2,"ruben","test123","ruben@gmail.com", "Rubén","Martínez",677890132,"55443322J", LocalDate.of(2023, 8, 30));
        Estudiante estudiante3 = new Estudiante(3,"licheng","test123","licheng@gmail.com", "Licheng","Qiu",644567891,"77889900K", LocalDate.of(2023, 8, 30));
        Estudiante estudiante4 = new Estudiante(4,"lucia","test123","lucia@gmail.com", "Lucía","Olmedo",688901235,"33221100M", LocalDate.of(2023, 8, 30));

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


