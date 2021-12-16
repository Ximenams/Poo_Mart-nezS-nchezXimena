/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MaquinaDeVenta;

/**
 *
 * @author Ximen
 */
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.*;

public class Interfaz  {

    public static void main(String[] args ) {
      
        JOptionPane.showMessageDialog(null,"¡Bienvenido al Cinepolis !");
       
	    double edad,monto;
	    double n;
	    char pago;
 
            

	    Scanner sc = new Scanner(System.in);
	    System.out.println(" Ingrese su edad ");
	    Scanner teclado = new Scanner(System.in);
	    edad=sc.nextFloat();
	    System.out.println(" Ingrese el modo de pago : \n [E] = Efectivo o [T] = Tarjeta ");
	    pago = teclado.next().charAt(0);
 
        switch (pago) {
            case 'E':
                if(edad <12){
                    monto= (42) ;
                    System.out.println("El precio correspondiente es " + monto ); }
 
                else if(edad < 60 && edad >= 12 ){
                    monto = ( 42 )   ;
                    System.out.println("el precio correspondiente es " + monto );}
 
                break;
 
            case 'T':
                if(edad <12){
                    monto= (42) ;
                    System.out.println("El precio correspondiente es " + monto ); }
 
                else if(edad < 60 && edad >= 12 ){
                    monto = ( 42 )   ;
                    System.out.println("el precio correspondiente es " + monto );}
                default:
	    }
    }

  
}
