package com.example.group_getname;

import com.example.group_getname.models.entity.Curso;
import com.example.group_getname.repository.AsignaturaRepository;
import com.example.group_getname.repository.CursoRepository;
import com.example.group_getname.seed.Seed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Collections;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class GroupGetNameApplication {

	@Autowired
	CursoRepository cursoRepository;
	@Autowired
	AsignaturaRepository asignaturaRepository;
	public static void main(String[] args) {
		SpringApplication.run(GroupGetNameApplication.class, args);

	}

	@Bean
	public CommandLineRunner commandLineRunner(){
		return runner -> {
			Seed seed = new Seed(asignaturaRepository,cursoRepository);
			seed.generateSeeds();
		};

	}



}
