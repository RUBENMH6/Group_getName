package com.example.group_getname.models.entity;

import jakarta.persistence.*;

@Entity
@Table(name="profesor")
public class Profesor {

    //Columnas

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "idProfesor", nullable = false)
    private int idProfesor;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "apellido", nullable = false)
    private String apellido;

    @Column(name = "telefono", nullable = false)
    private int telefono;

    @Column(name = "nif", nullable = false)
    private String nif;

    @Column(name = "email", nullable = false)
    private String email;

    //Constructores

    public Profesor(int idProfesor, String nombre, String apellido, int telefono, String nif, String email) {
        this.idProfesor = idProfesor;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.nif = nif;
        this.email = email;
    }

    public Profesor() {

    }

    //Getters y Setters

    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int id_profesor) {
        this.idProfesor = id_profesor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
