package com.example.group_getname.models.entity;

import jakarta.persistence.*;

@Entity
@Table(name="matricula",uniqueConstraints = {@UniqueConstraint(columnNames = {"id_estudiante", "id_curso"})})
public class Matricula {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_matricula")
    private int id_matricula;

    @Column(name = "id_estudiante")
    private int id_estudiante;

    @Column(name = "id_curso")
    private int id_curso;

    @Column(name = "estado")
    private int estado;

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


