package com.example.group_getname.models.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "users_admin")
public class Administrador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_admin")
    private int id_admin;

    @Column(name = "username", nullable = false)
    private String username;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;



    public Administrador(String username, String nombre, String email, String password) {
        this.username = username;
        this.nombre = nombre;
        this.email = email;
        this.password = password;
    }

    public Administrador() {

    }

    public int getIdUserAdmin() {
        return id_admin;
    }

    public void setIdUserAdmin(int id_admin) {
        this.id_admin = id_admin;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return nombre;
    }

    public void setName(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
