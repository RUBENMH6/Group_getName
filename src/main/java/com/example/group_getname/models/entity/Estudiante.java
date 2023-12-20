package com.example.group_getname.models.entity;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "estudiante")
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false)
    private int id;

    @Column(name="user_name", nullable = false)
    private String user_name;

    @Column(name="contraseña", nullable = false)
    private String contraseña;

    @Column(name="email", nullable = false)
    private String email;

    @Column(name="nombre", nullable = false)
    private String nombre;

    @Column(name="apellido", nullable = false)
    private String apellido;

    @Column(name="telefono", nullable = false)
    private String telefono;

    @Column(name="nif", nullable = false)
    private String nif;

    @Column(name="date_registered", nullable = false, columnDefinition = "DATETIME DEFAULT '0000-00-00 00:00:00'")
    private Date date_registered;

    public Estudiante(int id, String user_name, String contraseña, String email, String nombre, String apellido, String telefono, String nif, Date date_registered) {
        this.id = id;
        this.user_name = user_name;
        this.contraseña = contraseña;
        this.email = email;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.nif = nif;
        this.date_registered = date_registered;
    }

    public Estudiante() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public Date getDate_registered() {
        return date_registered;
    }

    public void setDate_registered(Date date_registered) {
        this.date_registered = date_registered;
    }
}
