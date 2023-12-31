package com.example.group_getname.models.entity;


import jakarta.persistence.*;

@Entity
@Table(name="asignatura",uniqueConstraints = {@UniqueConstraint(columnNames = {"id_profesor", "id_curso", "id_horario"})})
public class Asignatura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_asignatura")
    private int idAsignatura;

    @Column(name = "id_profesor", nullable = false)
    private int idProfesor;


    @Column(name = "id_curso", nullable = false)
    private int idCurso;

    @Column(name = "id_horario", nullable = false)
    private int idHorario;

    @Column(name = "nombre", nullable = false)
    private String nombre;


    @Column(name = "color", nullable = false)
    private String color;


    //Relaciones

    @ManyToOne
    @JoinColumn(name = "id_profesor", insertable = false, updatable = false)
    private Profesor profesor;

    @ManyToOne
    @JoinColumn(name = "id_curso", insertable = false, updatable = false)
    private Curso curso;

    @ManyToOne
    @JoinColumn(name = "id_horario", insertable = false, updatable = false)
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


    //Getters y Setters

    public int getIdAsignatura() {
        return idAsignatura;
    }

    public void setIdAsignatura(int id_asignatura) {
        this.idAsignatura = id_asignatura;
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

    public void setId(int idAsignatura) {
        this.idAsignatura = this.idAsignatura;
    }

    public int getId() {
        return idAsignatura;
    }
}
