package com.example.group_getname.models.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

@Entity
@Table(name="horario")
public class Horario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_horario")

    private int id_horario;

    @Column(name = "id_clase")
    private int id_clase;

    @Column(name = "tiempo_empieza")
    private Time tiempo_empieza;
    @Column(name = "tiempo_acaba")
    private Time tiempo_acaba;
    @Column(name = "dia")
    private Date dia;

    public Horario(int id_horario, int id_clase, Time tiempo_empieza, Time tiempo_acaba, Date dia) {
        this.id_horario = id_horario;
        this.id_clase = id_clase;
        this.tiempo_empieza = tiempo_empieza;
        this.tiempo_acaba = tiempo_acaba;
        this.dia = dia;
    }

    public Horario() {

    }

    public int getId_horario() {
        return id_horario;
    }

    public void setId_horario(int id_horario) {
        this.id_horario = id_horario;
    }

    public int getId_clase() {
        return id_clase;
    }

    public void setId_clase(int id_clase) {
        this.id_clase = id_clase;
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
