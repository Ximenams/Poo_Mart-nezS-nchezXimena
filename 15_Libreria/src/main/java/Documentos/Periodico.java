/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Documentos;

/**
 *
 * @author Ximen
 */
import java.io.*;
import java.util.*;

public class Periodico {
    
    
    private String fecha2;
    private String fecha;
    private String nombre;
    private String autor;
    private String editorial;
    private float precio;
    public Periodico(){
    
    }
    
   public Periodico(String fecha2, String fecha, String nombre, String autor, String editorial, float precio) {
        this.nombre = nombre;
        this.autor = autor;
        this.editorial = editorial;
        this.precio = precio;
        this.fecha2 = fecha2;
        this.fecha = fecha;
    }

    /**
     *
     * @param fecha
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public String getFecha() {
        return fecha;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getEditorial() {
        return editorial;
    } 
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
     public float getPrecio() {
        return precio;
    }
    
 
    public String getFecha2() {
        return fecha2;
    }

    public void setFecha2(String fecha2) {
        this.fecha2 = fecha2;
    }
    
    public void aceptarDatos(){
       
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el nombre del periodico: ");
        nombre = entrada.nextLine();
        System.out.println("Ingresa el nombre del autor: ");
        autor = entrada.nextLine();
        System.out.println("Ingresa la editorial del periodico: ");
        editorial = entrada.nextLine();
        System.out.println("Ingresa el precio del periodico:");
        precio = entrada.nextFloat();
        System.out.println("Ingresa la fecha de publicacion");
        fecha2 = entrada.nextLine();
        fecha = entrada.nextLine();
        //13 de enero de 2021
        //13/01/2021
        //13/Enero/2021
        //2021/01/13
        //casteo del objeto       
    }
   
    
    
    
    
}
