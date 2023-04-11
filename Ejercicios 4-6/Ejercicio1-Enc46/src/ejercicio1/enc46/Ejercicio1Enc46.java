package ejercicio1.enc46;

import java.util.Scanner;

public class Ejercicio1Enc46 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un numero para verificar si es PAR o IMPAR");
        
        int numero = sc.nextInt();
        int verif = numero%2;
        if (verif!=0){
            System.out.println("El numero " + numero + " es IMPAR");
        }else {
            System.out.println("El numero " + numero + " es PAR");
        }
    } 
}
