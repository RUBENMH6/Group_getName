package com.example.group_getname.models.entity;

public enum Roles {
    ESTUDIANTE("ESTUDIANTE"),
    PROFESOR("PROFESOR"),
    ADMINISTRADOR("ADMINISTRADOR");

    private final String role;

    Roles(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}

