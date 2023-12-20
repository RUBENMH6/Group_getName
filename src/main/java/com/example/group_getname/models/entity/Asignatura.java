package com.example.group_getname.models.entity;


import jakarta.persistence.*;
import org.springframework.lang.NonNull;

@Entity
@Table(name="asignatura",uniqueConstraints = {@UniqueConstraint(columnNames = {"id_profesor", "id_curso", "id_horario"})})
public class Asignatura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_asignatura")
    private int id_asignatura;

    @Column(name = "id_profesor")
    private int id_profesor;

    @NonNull
    @Column(name = "id_curso")
    private int id_curso;

    @NonNull
    @Column(name = "id_horario")
    private int id_horario;

    @NonNull
    @Column(name = "nombre")
    private String nombre;


    @NonNull
    @Column(name = "color")
    private String color;

    public int getId_asignatura() {
        return id_asignatura;
    }

    public void setId_asignatura(int id_asignatura) {
        this.id_asignatura = id_asignatura;
    }

    public int getId_profesor() {
        return id_profesor;
    }

    public void setId_profesor(int id_profesor) {
        this.id_profesor = id_profesor;
    }

    public int getId_curso() {
        return id_curso;
    }

    public void setId_curso(int id_curso) {
        this.id_curso = id_curso;
    }

    public int getId_horario() {
        return id_horario;
    }

    public void setId_horario(int id_horario) {
        this.id_horario = id_horario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setId(int id_aula) {
        this.id_asignatura = id_asignatura;
    }

    public int getId() {
        return id_asignatura;
    }
}
