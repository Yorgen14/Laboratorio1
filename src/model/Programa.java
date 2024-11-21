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
public class Programa {
    private String codigo;
    private String nombre;
    private Profesor director;
    ArrayList <Asignatura> asignaturas = new ArrayList();

    public Programa() {
    }

    public Programa(String codigo, String nombre, Profesor director) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.director = director;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesor getDirector() {
        return director;
    }

    public void setDirector(Profesor director) {
        this.director = director;
    }
    
    public void agregarAsignatura(Asignatura asignatura){
        asignaturas.add(asignatura);
    }
    
    public void verAsignaturas(){
        for(Asignatura asignatura: asignaturas){
            System.out.println(asignatura.getCodigo() + " - " + asignatura.getNombre());
        }
    }
    
}
