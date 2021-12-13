/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Documentos;

import java.util.Scanner;

/**
 *
 * @author Ximen
 */
public class Revista {
    
    //Tipo_Revista -< espectaculos, chismes, de no tengo idea pq no compro
    private String tipo_revista;
    private String nombre;
    private String autor;
    private String editorial;
    private float precio;

    public Revista(){
    
    }

    public Revista(String tipo_revista, String nombre, String autor, String editorial, float precio) {
        this.nombre = nombre;
        this.autor = autor;
        this.editorial = editorial;
        this.precio = precio;
        this.tipo_revista = tipo_revista;
    }

    public String getTipo_revista() {
        return tipo_revista;
    }

    public void setTipo_revista(String tipo_revista) {
        this.tipo_revista = tipo_revista;
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
    
    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    
    //los datos del tipo de revista 
    
    public void agregarRevista(){
        //primero necesito jalar el metodo de aceptar datos y despues agregar
        //el tipo de revista
        CLibro datoslibro = new CLibro();
        
        Scanner entrada = new Scanner(System.in);
        
        datoslibro.aceptarDatos(); //tdos los datos del documento
        System.out.println("Ingresa el tipo de revista");
        tipo_revista = entrada.nextLine(); 
    }
    
}
