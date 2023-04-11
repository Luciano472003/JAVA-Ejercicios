package ejercicios.ejemplo.condicionales;

import java.util.Scanner;

public class EjerciciosEJEMPLOCondicionales {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la nota");
        int nota = sc.nextInt();
        
        while(nota < 0 && nota > 10);{
            System.out.println("Nota invalida, intentelo de nuevo");
        
        }
        System.out.println("La nota es valida");
    }
        
       
    
}
