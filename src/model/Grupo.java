/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author estudiante
 */
public class Grupo {
    private String id;
    private int capacidad;
    private Profesor profesor;
    private Horario horario;
    ArrayList <Estudiante> estudiantes = new ArrayList();

    public Grupo() {
    }

    public Grupo(String id, int capacidad) {
        this.id = id;
        this.capacidad = capacidad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
    
    public void agregarEstudiante(Estudiante estudiante){
        estudiantes.add(estudiante);
    }
}
