package com.example.group_getname.models.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.sql.Time;

@Entity
@Table(name="horario")
public class Horario {

    //Columnas

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_horario", nullable = false)
    private int id_horario;

    @Column(name = "id_asignatura", nullable = false)
    private int id_asignatura;

    @Column(name = "tiempo_empieza", nullable = false)
    private LocalTime tiempo_empieza;
    @Column(name = "tiempo_acaba", nullable = false)
    private LocalTime tiempo_acaba;
    @Column(name = "dia", nullable = false)
    private LocalDate dia;

    //Relaciones
    @ManyToOne
    @JoinColumn(name = "asignatura")
    private Asignatura asignatura;

    //Constructores
    public Horario(int id_horario, int id_asignatura, LocalTime tiempo_empieza, LocalTime tiempo_acaba, LocalDate dia) {
        this.id_horario = id_horario;
        this.id_asignatura = id_asignatura;
        this.tiempo_empieza = tiempo_empieza;
        this.tiempo_acaba = tiempo_acaba;
        this.dia = dia;
    }

    public Horario() {

    }

    //Getters y Setters
    public int getId_horario() {
        return id_horario;
    }

    public void setId_horario(int id_horario) {
        this.id_horario = id_horario;
    }

    public int getId_asignatura() {
        return id_asignatura;
    }

    public void setId_asignatura(int id_asignatura) {
        this.id_asignatura = id_asignatura;
    }

    public LocalTime getTiempo_empieza() {
        return tiempo_empieza;
    }

    public void setTiempo_empieza(LocalTime tiempo_empieza) {
        this.tiempo_empieza = tiempo_empieza;
    }

    public LocalTime getTiempo_acaba() {
        return tiempo_acaba;
    }

    public void setTiempo_acaba(LocalTime tiempo_acaba) {
        this.tiempo_acaba = tiempo_acaba;
    }

    public LocalDate getDia() {
        return dia;
    }

    public void setDia(LocalDate dia) {
        this.dia = dia;
    }
}
