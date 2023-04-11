
package ejercicio3.enc9.pkg11;

import static java.lang.Math.random;
import java.util.Random;
import java.util.Scanner;


public class Ejercicio3Enc911 {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la dimension del vector");
        int n = sc.nextInt();

        int[] vector = new int[n];

        //  Llenamos el vector con valores aleatorios entre 1 y 10.000

        for (int i = 0; i < vector.length; i++) {
            
            Random aleatorio = new Random();

            vector[i] = aleatorio.nextInt(10000); // Creamos numeros aleatorios desde 1 hasta 10000

        }

        //  Calculamos cuantos digitos tiene cada numero almacenado en el vector

        int[] numeroDeDigitos = new int[n];

        for (int i = 0; i < vector.length; i++) {
            
            int division = vector[i] , contadorDigitos = 0 ;

            while ( division > 0 ) {

                division = division / 10 ;

                contadorDigitos++;

            }

            numeroDeDigitos[i] = contadorDigitos;

        }

        //  Imprimimos el vector
        System.out.println("El vector tiene los siguientes valores");
        for (int i = 0; i < vector.length; i++) {
            
            System.out.print( vector[i] + " " );

        }

        //  Imprimimos la cantidad de digitos que tiene cada valor dentro del 'vector'.
        for (int i = 0; i < numeroDeDigitos.length; i++) {
            
            System.out.println("El vector en la posicion " + i + " tiene almacenado un numero con [" + numeroDeDigitos[i] + "] digitos");

        }
        
    }
    
}
