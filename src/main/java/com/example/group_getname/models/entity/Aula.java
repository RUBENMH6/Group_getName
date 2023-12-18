package com.example.group_getname.models.entity;


import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Table(name="aula",uniqueConstraints = {@UniqueConstraint(columnNames = {"id_profesor", "id_curso", "id_horario"})})
public class Aula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id_aula;

    @Column(name = "id_profesor")
    private int id_profesor;

    @NotNull
    @Column(name = "id_curso")
    private int id_curso;

    @Column(name = "id_horario")
    private int id_horario;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "color")
    private String color;
    public void setId(int id_aula) {
        this.id_aula = id_aula;
    }

    public int getId() {
        return id_aula;
    }
}
