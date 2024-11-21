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
public class Asignatura {
    private String codigo;
    private String nombre;
    private int creditos;
    ArrayList <Grupo> grupos = new ArrayList();
    
    

    public Asignatura() {
    }

    public Asignatura(String codigo, String nombre, int creditos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
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

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
    
    public void agregarGrupo(Grupo grupo){
        grupos.add(grupo);
    }
    
    public void asignarDocente(Grupo grupo){
        Profesor profesor = new Profesor();
        grupo.setProfesor(profesor);
    }
    
}
