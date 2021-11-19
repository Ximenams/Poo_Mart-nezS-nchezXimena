
import java.util.Scanner;
 
public class Cuados {
   
    Scanner teclado = new Scanner(System.in);
   
    int n;
    int ancho = 0;
    int linea = 0;



    String as="*",e;
   
    public void entradato() {
        System.out.print("Por favor ingrese lado del cuadrado: ");
        n = teclado.nextInt();
    }
   
    public void proceso() {
        if(n >= 2 && n <= 50) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    for (int i = 0; i < ancho; i++) {
                        if(i==ancho-1) e=""; else e = " ";
                        if(linea>1&&linea<ancho){
                            if(i>0&&i<ancho){
                                as="/";
                            }else{
                                 as="*";
                            }
                            System.out.printf("%s"+e,as);
                         }else{
                         }
                         }
                         if(i==ancho&&linea<=ancho-1){
                              System.out.printf("\n");
                              linea++;
                         }
                    }
                   
                }
                System.out.println("");
            }
        }else {
            System.out.println("Por favor ingrese un numero entre 2 y 50");
        }
    }
   
   System.out.println("\nAncho: "+ancho+"   Simbolo: "+as);
   
   
 
    public static void main(String[] args) {
        Cuados fc = new Cuados();
        fc.entradato();
        fc.proceso();
    }
}