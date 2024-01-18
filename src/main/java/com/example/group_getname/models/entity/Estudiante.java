package com.example.group_getname.models.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "estudiante")
public class Estudiante {

    //Columnas

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_estudiante", nullable = false)
    private int id_estudiante;

    @Column(name="username", nullable = false)
    private String username;

    @Column(name="password", nullable = false)
    private String password;

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


    //Relaciones

    @OneToMany(mappedBy = "estudiante")
    private Set<Matricula> matriculas;

    //Constructores

    public Estudiante(int id_estudiante, String user_name, String password, String email, String nombre, String apellido, String telefono, String nif, Date date_registered) {
        this.id_estudiante = id_estudiante;
        this.username = user_name;
        this.password = password;
        this.email = email;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.nif = nif;
        this.date_registered = date_registered;
    }

    public Estudiante() {

    }

    //Getters y Setters

    public Set<Matricula> getMatriculas() {
        return this.matriculas;
    }

    public void setMatriculas(Set<Matricula> matriculas) {
        this.matriculas = matriculas;
    }

    public int getId_estudiante() {
        return id_estudiante;
    }

    public void setId_estudiante(int id) {
        this.id_estudiante = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public Date getDateRegistered() {
        return date_registered;
    }

    public void setDateRegistered(Date date_registered) {
        this.date_registered = date_registered;
    }
}
