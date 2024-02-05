package com.example.group_getname;

import com.example.group_getname.repository.*;
import com.example.group_getname.seed.Seed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class GroupGetNameApplication {

	@Autowired
	UsuarioRepository usuarioRepository;
	@Autowired
	CursoRepository cursoRepository;
	@Autowired
	AsignaturaRepository asignaturaRepository;
	@Autowired
	HorarioRepository horarioRepository;
	@Autowired
	ProfesorRepository profesorRepository;
	@Autowired
	EstudianteRepository estudianteRepository;
	@Autowired
	MatriculaRepository matriculaRepository;
	public static void main(String[] args) {
		SpringApplication.run(GroupGetNameApplication.class, args);

	}

	@Bean
	public CommandLineRunner commandLineRunner(){
		return runner -> {
			Seed seed = new Seed(usuarioRepository,asignaturaRepository,cursoRepository, horarioRepository,  estudianteRepository, matriculaRepository, profesorRepository);
			seed.generateSeeds();
		};

	}



}
