package ejercicio1.enc9.pkg11;

import java.util.Scanner;

public class Ejercicio1Enc911 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
       
        int[] vector1 = new int[100];

        for ( int i = 99 ; i >= 0 ; i-- ) {
    
            vector1[i] = i;

            System.out.println("El valor del vector en el indice " + i + " es igual a: " + vector1[i] );
        }
    
    
    
    }
    

}


