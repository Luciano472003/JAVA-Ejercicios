package ejercicio2.enc7.pkg8;

import java.util.Scanner;

public class Ejercicio2Enc78 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int Cant = 0;
        String nom;
        int edad;
        String rta;
        
        do {
            System.out.println("Cuantas personas va a ingresar: ");
            Cant = sc.nextInt();
     
            for (int i = 0; i < Cant; i++) {

                System.out.println("Ingrese nombre: ");
                sc.nextLine();
                nom = sc.nextLine();

                System.out.println("Ingrese edad: ");
                edad = sc.nextInt();

                
                System.out.println("----------------");
                System.out.println("NOMBRE: " + nom);
                System.out.println("EDAD: " + edad);
                
                if (edad >= 18) {
                    System.out.println("Mayor de edad");
                } else {
                    System.out.println("Menor de edad");
                }
                System.out.println("----------------");
            }
            System.out.println("Desea Ingresar mas personas? (si/no)");
            sc.nextLine();
            rta = sc.nextLine().toLowerCase();
            
        } while (!rta.equals("no"));
        System.out.println("Entendible, que tenga un buen dia...");
    }


}
