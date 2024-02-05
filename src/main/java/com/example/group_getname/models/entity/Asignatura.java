package com.example.group_getname.models.entity;


import jakarta.persistence.*;

@Entity
@Table(name="asignatura",uniqueConstraints = {@UniqueConstraint(columnNames = {"id_profesor", "id_curso", "id_horario"})})
public class Asignatura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_asignatura")
    private int id_asignatura;

    @Column(name = "id_profesor", nullable = false)
    private int id_profesor;


    @Column(name = "id_curso", nullable = false)
    private int id_curso;

    @Column(name = "id_horario", nullable = false)
    private int id_horario;

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


    public Asignatura(int id_asignatura, int id_profesor, int id_curso, int id_horario, String nombre, String color) {
        this.id_asignatura = id_asignatura;
        this.id_profesor = id_profesor;
        this.id_curso = id_curso;
        this.id_horario = id_horario;
        this.nombre = nombre;
        this.color = color;
    }

    public Asignatura() {

    }

    //Getters y Setters
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

    public void setId_curso(int idCurso) {
        this.id_curso = idCurso;
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

    public void setId(int id_asignatura) {
        this.id_asignatura = id_asignatura;
    }

    public int getId() {
        return id_asignatura;
    }
}
