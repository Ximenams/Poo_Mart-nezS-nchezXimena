/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany._arraypersona;

/**
 *
 * @author Ximen
 */
public class Persona {
    private int edad;
    private String nombre;
    private int id;
    
    public Persona(){
    }

    public Persona(int edad, String nombre, int id) {
        this.edad = edad;
        this.nombre = nombre;
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
