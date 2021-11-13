/*
Desarrollar un algoritmo que realice la sumatoria de los
números enteros comprendidos entre el 1 y el 10, es decir,
1+2+3+....+10

*/


import java.util.Scanner;

public class Ejercicio2{
    //el identado del codigo
    //metodo principal
    public static void main(String[]args){
        
        //definir un objeto de la libreria Scanner que nos sirva para obtener los datos
        Scanner entrada = new Scanner(System.in);
        /*
        Para realizar una instancia del objeto se debe de colocar:
        
        Nombreclase nombreobjeto = new Nombreclase();
        
        System.in Es una clase superior donde nosotros podemos obtener los datos
        que vienen (por parte de la consola)
        */
        
        //definicion de variables
        int num1, num2;
        int resultado=0;

        do{
            System.out.println("Introduce los numeros que quieras sumar; si pones 0 se detiene  la suma : ");
        //asignar el primer numero a su variable
        num1 = entrada.nextInt();
        //System.out.println("Introduce el segundo numero a sumar: ");
        //asignar el segundo numero a su variable
        //num2 = entrada.nextInt();
        
        resultado = resultado +num1 ;

        


        }while(num1 !=0);

        System.out.println("El resultado de la suma es: "+ resultado);


        for(int i = 1; i < 10; i++){ 
            sumar = sumar + i;
        }
           

    }

        




    }
}