package com.example.group_getname.models.entity;

import jakarta.persistence.*;

@Entity
@Table(name="matricula",uniqueConstraints = {@UniqueConstraint(columnNames = {"idEstudiante", "idCurso"})})
public class Matricula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idMatricula", nullable = false)
    private int idMatricula;

    @Column(name = "idEstudiante", nullable = false)
    private int idEstudiante;

    @Column(name = "idCurso", nullable = false)
    private int idCurso;

    @Column(name = "estado", nullable = false)
    private int estado;

    //Relaciones

    @ManyToOne
    @JoinColumn(name = "idEstudiante", nullable = false)
    private Estudiante estudiante;

    @ManyToOne
    @JoinColumn(name = "idCurso", nullable = false)
    private Curso curso;

    //Constructores

    public Matricula(int idMatricula, int idEstudiante, int idCurso, int estado) {
        this.idMatricula = idMatricula;
        this.idEstudiante = idEstudiante;
        this.idCurso = idCurso;
        this.estado = estado;
    }

    public Matricula() {

    }

    //Getters y Setters

    public int getIdMatricula() {
        return idMatricula;
    }

    public void setIdMatricula(int idMatricula) {
        this.idMatricula = idMatricula;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}


