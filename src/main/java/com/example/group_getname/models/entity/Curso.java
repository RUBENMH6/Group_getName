package com.example.group_getname.models.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name="curso",uniqueConstraints = {@UniqueConstraint(columnNames = {"nombre", "fechaInicio", "fechaFin"})})
public class Curso {

    //Columnas

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_curso", nullable = false)
    private int idCurso;

    @Column(name="nombre", nullable = false)
    private String nombre;

    @Column(name="descripcion", nullable = false)
    private String descripcion;

    @Column(name="fecha_inicio", nullable = false)
    private Date fechaInicio;

    @Column(name="fecha_fin", nullable = false)
    private Date fechaFin;

    @Column(name="activo", nullable = false)
    private int activo;

    //Relaciones

    @OneToMany(mappedBy = "curso")
    private List<Asignatura> asignaturas;

    @OneToMany(mappedBy = "curso")
    private List<Matricula> matriculas;

    //Constructores

    public Curso(int idCurso, String nombre, String descripcion, Date fechaInicio, Date fechaFin, int activo) {
        this.idCurso = idCurso;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.activo = activo;
    }

    public Curso() {

    }

    //Getters y Setters

    public List<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(List<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }

    public List<Matricula> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(List<Matricula> matriculas) {
        this.matriculas = matriculas;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int id_curso) {
        this.idCurso = id_curso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fecha_inicio) {
        this.fechaInicio = fecha_inicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fecha_fin) {
        this.fechaFin = fecha_fin;
    }

    public int getActivo() {
        return activo;
    }

    public void setActivo(int activo) {
        this.activo = activo;
    }
}
