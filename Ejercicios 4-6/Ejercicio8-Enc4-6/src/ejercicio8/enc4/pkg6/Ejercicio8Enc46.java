
package ejercicio8.enc4.pkg6;

import java.util.Scanner;


public class Ejercicio8Enc46 {

 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int rta = 0;

        do{
            System.out.println("Ingrese un numero a partir de 4");
            rta = sc.nextInt();
        }while(rta<4);

        for (int i=0; i<1; i++){
           
            for (int j=0; j<rta; j++){
                System.out.print("* ");
            }

            System.out.println("");
        }

        
        for (int i=1; i<rta-2; i++){
           System.out.print("* ");
            for (int j=0; j<rta; j++){
                System.out.print("  ");
            }
            System.out.print("*");
            System.out.println("");
        }


        for (int i=rta-1; i<rta+1; i++){
        
            for (int j=0; j<rta; j++){
                System.out.print("* ");
            }

            System.out.println("");
            
        }
        
        
        
        
    }
    
}
