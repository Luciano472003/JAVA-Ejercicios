package ejercicio2.enc4.pkg6;

import java.util.Scanner;

public class Ejercicio2Enc46 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una frase");

        String frase = sc.nextLine();
        String Fcorrecta = "eureka";
        //boolean comparacion = frase.equals(Fcorrecta);

        if (frase.equals(Fcorrecta) != false) {

            System.out.println("La frase es Incorrecta");

        } else {
            System.out.println("La frase es Correcta");

        }

    }

}


