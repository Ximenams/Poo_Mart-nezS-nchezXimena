
import java.util.Scanner;
/*
Realice un programa que permita leer 10 calificaciones de 
una asignatura y los guarde en un array para que muestre: 

    Imprimir todas las calificaciones. 

    Promedio de las calificaciones. 

    La calificación más alta y la más baja. 

    El número de calificaciones superiores al promedio. 

    La cantidad de alumnos aprobados y reprobados. 
*/

public class calificaciones {
  public static void  main(String[] args) {
      

        Scanner entrada = new Scanner(System.in);
        int i;
        int calificaciones[] = new int[10];
        double promedio = 0 , total = 0;
        

        System.out.println("Calificaciones ");
        for (i = 0; i < 10; i++){
            System.out.println("calificaciones" + i + "=");
            calificaciones[i] = entrada.nextInt(); 
            total = total + calificaciones [i]; 
            promedio = total/10;
           

        }
        System.out.println("Total:"  + total);
        System.out.println("promedio:"  + promedio);
        double max=0;
        double min=6;
        for (i=0;i<calificaciones.length;i++)
        {
        if(calificaciones[i]>max){
            max=(calificaciones[i]);
                        }
        if(calificaciones[i]<min){
            min=(calificaciones[i]);
            }
        }
        System.out.println("La calificacion mas alta  es : "+max);
        System.out.println("La calificacion mas baja es : "+min);	
        double apro=0;
		double repro=0;
        double diez =0;
        double nueve =0;
	    double ocho =0;
	    double siete =0;
	    double seis =0;
	    double menorseis=0;

        for (i=0;i<calificaciones.length;i++){
        if(calificaciones[i]==10){
			diez++;
			apro++;
        }
        if(calificaciones[i]==9){
            nueve++;
            apro++;
        }
        if(calificaciones[i]==8){
            ocho++;
            apro++
        }
        if(calificaciones[i]==7){
            siete++;
            apro++;
        }                                               
       if(calificaciones[i]==6){
       seis++;
       apro++;
       }
		
		if(calificaciones[i]<6){
            seis++;
			repro++;
		                  }
 
	    }   
        
		System.out.println("La cantidad de Aprobados son : "+apro);
		System.out.println(" La cantidad de Reprobados son: "+repro);
            

	    
  }   

	
}
