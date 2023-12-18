package com.example.group_getname.models.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="cursos",uniqueConstraints = {@UniqueConstraint(columnNames = {"nombre", "fecha_inicio", "fecha_fin"})})
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_curso")
    private int id_curso;

    @Column(name="nombre")
    private String nombre;

    @Column(name="descripcion")
    private String descripcion;

    @Column(name="fecha_inicio")
    private Date fecha_inicio;

    @Column(name="fecha_fin")
    private Date fecha_fin;

    @Column(name="activo")
    private int activo; //boolean ??



}
