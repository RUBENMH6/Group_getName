package com.example.group_getname.models.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "nadador")
public class Aula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id_aula;



    public void setId(int id_aula) {
        this.id_aula = id_aula;
    }

    public int getId() {
        return id_aula;
    }
}
