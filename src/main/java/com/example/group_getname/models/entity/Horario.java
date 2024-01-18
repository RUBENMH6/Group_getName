package com.example.group_getname.models.entity;

import jakarta.persistence.*;

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
    private Time tiempo_empieza;
    @Column(name = "tiempo_acaba", nullable = false)
    private Time tiempo_acaba;
    @Column(name = "dia", nullable = false)
    private Date dia;

    //Relaciones
    @ManyToOne
    @JoinColumn(name = "asignatura")
    private Asignatura asignatura;

    //Constructores
    public Horario(int id_horario, int id_asignatura, Time tiempo_empieza, Time tiempo_acaba, Date dia) {
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

    public Time getTiempo_empieza() {
        return tiempo_empieza;
    }

    public void setTiempo_empieza(Time tiempo_empieza) {
        this.tiempo_empieza = tiempo_empieza;
    }

    public Time getTiempo_acaba() {
        return tiempo_acaba;
    }

    public void setTiempo_acaba(Time tiempo_acaba) {
        this.tiempo_acaba = tiempo_acaba;
    }

    public Date getDia() {
        return dia;
    }

    public void setDia(Date dia) {
        this.dia = dia;
    }
}
