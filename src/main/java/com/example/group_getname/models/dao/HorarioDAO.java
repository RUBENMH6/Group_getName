package com.example.group_getname.models.dao;

import com.example.group_getname.models.entity.Horario;

import java.sql.Time;
import java.sql.Date;
import java.util.List;

public interface HorarioDAO {

    public void save(Horario horario);
    public Horario getForId(int id);
    public List<Horario> findAll();
    public List<Horario> findAllDia(Date dia);
    public List<Horario> findAllTiempoEmpieza(Time tiempoEmpieza);
    public List<Horario> findAllTiempoAcaba(Time tiempoAcaba);
    public void updateIdHorario(Horario horario, int idHorario);
    public void updateIdClase(Horario horario,int idClase);
    public void updateTiempoEmpieza(Horario horario, Time tiempoEmpieza);
    public void updateTiempoAcaba(Horario horario, Time tiempoAcaba);
    public void updateDia(Horario horario,Date dia);
}
