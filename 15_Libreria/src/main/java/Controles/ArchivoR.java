/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controles;

/**
 *
 * @author Ximen
 */

import Documentos.Revista;
import java.util.*;
import java.io.*;

class ArchivoR implements Serializable {
    
    /*
    vamos a crear el objeto que vamos a serializar 
    de la lista de los libros
    */
    
    ArrayList<Revista> listarecuperada = new ArrayList<Revista>();
    
    //metodo para generar la lectura del archivo
    //metodo que lee el archivo
    public ArrayList<Revista> leer(){
        try{
            //primero tenemos que crear la lectura del buffer de objetos
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("revista.txt"));
            listarecuperada = (ArrayList<Revista>)in.readObject();
            in.close();
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
            System.out.println("Se origino :" + e.getStackTrace());
        }
        return listarecuperada;
    }
    
    //el metodo que serializa
    //metodo que escribe el archivo
    void serializar(ArrayList<Revista> listaserializada){
        try{
            //generar el archivo de salida
            FileOutputStream salida = new FileOutputStream("revista.txt");
            //generar la creacion de los objetos
            ObjectOutputStream salidaobjeto = new ObjectOutputStream(salida);
            
            //ya que tengo la generacion de la salida la escribimos
            
            salidaobjeto.writeObject(listaserializada);
            
            salidaobjeto.close();
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
            System.out.println("Se origino :" + e.getStackTrace());
        }
    }

   
    
    
}

