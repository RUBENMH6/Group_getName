package com.example.group_getname.models.entity;

import jakarta.persistence.*;

@Entity
@Table(name="matricula",uniqueConstraints = {@UniqueConstraint(columnNames = {"id_estudiante", "id_curso"})})
public class Matricula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_matricula", nullable = false)
    private int id_matricula;

    @Column(name = "id_estudiante", nullable = false)
    private int id_estudiante;

    @Column(name = "id_curso", nullable = false)
    private int id_curso;

    @Column(name = "estado", nullable = false)
    private int estado;

    //Relaciones

    @ManyToOne
    @JoinColumn(name = "id_curso", nullable = false)
    private Estudiante estudiante;

    @ManyToOne
    @JoinColumn(name = "id_curso", nullable = false)
    private Curso curso;

    public Matricula(int id_matricula, int id_estudiante, int id_curso, int estado) {
        this.id_matricula = id_matricula;
        this.id_estudiante = id_estudiante;
        this.id_curso = id_curso;
        this.estado = estado;
    }

    public Matricula() {

    }

    public int getId_matricula() {
        return id_matricula;
    }

    public void setId_matricula(int id_matricula) {
        this.id_matricula = id_matricula;
    }

    public int getId_estudiante() {
        return id_estudiante;
    }

    public void setId_estudiante(int id_estudiante) {
        this.id_estudiante = id_estudiante;
    }

    public int getId_curso() {
        return id_curso;
    }

    public void setId_curso(int id_curso) {
        this.id_curso = id_curso;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}


