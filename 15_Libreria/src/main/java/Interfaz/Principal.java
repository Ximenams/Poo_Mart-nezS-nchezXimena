/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

/**
 *
 * @author Ximen
 */
import Controles.ManipularLibros;
import Controles.ManipularRevistas;
import Controles.ManipularPeriodicos;
import java.io.*;
import java.util.*;

public class Principal {
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        //menu prinicipal para poder manipular los datos del libros y
        //de los demas documentos
        
        //instancia de ManipularLibros
        
        ManipularLibros listadelibrosobj = new ManipularLibros();
        ManipularRevistas listaderevistasobj = new ManipularRevistas();
        ManipularPeriodicos listadeperiodicosobj = new ManipularPeriodicos();

        
        int opcion;
        
        do{
            System.out.println("Bienvenido a la Bliblioteca de Sara Cortes y Ximena Martinez");
            System.out.println("Ingrese la opcion deseada:");
            System.out.println("1.- Gestionar Libros");
            System.out.println("2.- Gestionar Revistas");
            System.out.println("3.- Gestionar Periodicos");
            System.out.println("4.- Salir");
            
            opcion = entrada.nextInt();
            
            switch (opcion) {
                case 1:
                    //agregar libro
                    listadelibrosobj.agregarLibro();
                    listaderevistasobj.agregarRevista();
                    listadeperiodicosobj.agregarPeriodico();

                    
                    
                    break;
                case 2:
                    //consultar libros por el id
                    listadelibrosobj.buscar();
                    break;
                case 3: 
                    //consulta de todos los libros
                    listadelibrosobj.consultaGeneral();
                    break;
                case 4: 
                    listadelibrosobj.borrar();
                    break;
                case 5:
                    listadelibrosobj.modificar();
                    break;
                case 6:
                    System.out.println("Adios gracias por su alma");
                    //cuando vamos a generar el archivo
                    listadelibrosobj.grabar();
                default:
                    System.out.println("Error ingrese una opcion valida");
            }
        
        }while((opcion >= 1)&&(opcion < 6));
    }
    
}
