package com.example.group_getname.models.entity;


import jakarta.persistence.*;

@Entity
@Table(name="asignatura",uniqueConstraints = {@UniqueConstraint(columnNames = {"idProfesor", "idCurso", "idHorario"})})
public class Asignatura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idAsignatura")
    private int idAsignatura;

    @Column(name = "idProfesor", nullable = false)
    private int idProfesor;


    @Column(name = "idCurso", nullable = false)
    private int idCurso;

    @Column(name = "idHorario", nullable = false)
    private int idHorario;

    @Column(name = "nombre", nullable = false)
    private String nombre;


    @Column(name = "color", nullable = false)
    private String color;


    //Relaciones

    @ManyToOne
    @JoinColumn(name = "idProfesor", insertable = false, updatable = false)
    private Profesor profesor;

    @ManyToOne
    @JoinColumn(name = "idCurso", insertable = false, updatable = false)
    private Curso curso;

    @ManyToOne
    @JoinColumn(name = "idHorario", insertable = false, updatable = false)
    private Horario horario;

    //Constructor


    public Asignatura(int idAsignatura, int idProfesor, int idCurso, int idHorario, String nombre, String color, Profesor profesor, Curso curso, Horario horario) {
        this.idAsignatura = idAsignatura;
        this.idProfesor = idProfesor;
        this.idCurso = idCurso;
        this.idHorario = idHorario;
        this.nombre = nombre;
        this.color = color;
        this.profesor = profesor;
        this.curso = curso;
        this.horario = horario;
    }

    public Asignatura() {

    }

    //Getters y Setters
    public int getIdAsignatura() {
        return idAsignatura;
    }

    public void setIdAsignatura(int idAsignatura) {
        this.idAsignatura = idAsignatura;
    }

    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public int getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(int idHorario) {
        this.idHorario = idHorario;
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
        this.idAsignatura = idAsignatura;
    }

    public int getId() {
        return idAsignatura;
    }
}
