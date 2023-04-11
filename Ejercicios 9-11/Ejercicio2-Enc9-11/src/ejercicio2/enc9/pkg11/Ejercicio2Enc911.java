
package ejercicio2.enc9.pkg11;

import java.util.Random;
import java.util.Scanner;


public class Ejercicio2Enc911 {

 
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la dimension del vector:");
        int n = sc.nextInt();

        int[] vector = new int[n];

        //Llenamos el vector con numeros aleatorios.
        for (int i = 0; i < vector.length; i++) {
            
            Random aleatorio = new Random();

            vector[i] = aleatorio.nextInt(20);

        }

        //Preguntamos que numero quiere buscar el usuario.
        System.out.println("¿Que valor desea buscar dentro del vector?");
        int buscado = sc.nextInt();

        //Recorremos el vector para ver si esta el valor buscado.
        int contadorEncontrados = 0;

        for (int i = 0; i < vector.length; i++) {
            
            if ( vector[i] == buscado ) {
            
                contadorEncontrados++;
                System.out.println("El valor [" + buscado + "] se encuentra en la posicion [" + i + "] del vector");

            }

        }

        if ( contadorEncontrados == 0) {

            System.out.println("No se encontraron coincidencias entre el valor buscado y los valores del vector");

        }

        //Imprimimos el vector para ver los valores del mismo
        System.out.println("El vector tiene los siguientes valores");
        for (int i = 0; i < vector.length; i++) {
            
            System.out.print( vector[i] + " " );
            
        }
        sc.close();
        
    }
    
}
