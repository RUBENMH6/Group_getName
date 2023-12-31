package com.example.group_getname.models.entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.sql.Time;

@Entity
@Table(name="horario")
public class Horario {

    //Columnas

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idHorario", nullable = false)
    private int idHorario;

    @Column(name = "idAsignatura", nullable = false)
    private int idAsignatura;

    @Column(name = "tiempoEmpieza", nullable = false)
    private Time tiempoEmpieza;
    @Column(name = "tiempoAcaba", nullable = false)
    private Time tiempoAcaba;
    @Column(name = "dia", nullable = false)
    private Date dia;

    //Relaciones
    @ManyToOne
    @JoinColumn(name = "idAsignatura")
    private Asignatura asignatura;

    //Constructores
    public Horario(int idHorario, int idAsignatura, Time tiempoEmpieza, Time tiempoAcaba, Date dia) {
        this.idHorario = idHorario;
        this.idAsignatura = idAsignatura;
        this.tiempoEmpieza = tiempoEmpieza;
        this.tiempoAcaba = tiempoAcaba;
        this.dia = dia;
    }

    public Horario() {

    }

    //Getters y Setters
    public int getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(int idHorario) {
        this.idHorario = idHorario;
    }

    public int getIdAsignatura() {
        return idAsignatura;
    }

    public void setIdAsignatura(int idAsignatura) {
        this.idAsignatura = idAsignatura;
    }

    public Time getTiempoEmpieza() {
        return tiempoEmpieza;
    }

    public void setTiempoEmpieza(Time tiempoEmpieza) {
        this.tiempoEmpieza = tiempoEmpieza;
    }

    public Time getTiempoAcaba() {
        return tiempoAcaba;
    }

    public void setTiempoAcaba(Time tiempoAcaba) {
        this.tiempoAcaba = tiempoAcaba;
    }

    public Date getDia() {
        return dia;
    }

    public void setDia(Date dia) {
        this.dia = dia;
    }
}
