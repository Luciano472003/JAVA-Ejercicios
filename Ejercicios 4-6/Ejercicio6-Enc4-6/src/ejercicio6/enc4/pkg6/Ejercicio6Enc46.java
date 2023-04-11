package ejercicio6.enc4.pkg6;

import java.util.Scanner;

public class Ejercicio6Enc46 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese 2 numeros");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int opcion;

        do{
            System.out.print("Seleccione la operacion a realizar:"
                    + " 1: SUMAR"
                    + " 2: RESTAR"
                    + " 3: MULTIPLICAR"
                    + " 4: DIVIDIR"
                    + " 5: SALIR");
            
            int rta = 0;
            System.out.println("Sus numeros: " + num1 + " y " + num2);
            opcion = sc.nextInt();

            switch (opcion){ 
                case 1:
                    int suma = num1 + num2;
                    System.out.println("Suma: " + suma);

                    break;
                case 2:
                    int resta = num1 - num2;
                    System.out.println("Resta: " + resta);
                    break;
                case 3:
                    int multi = num1 * num2;
                    System.out.println("Multiplicacion: " + multi);
                    break;
                case 4:
                    double divi = (num1/num2);
                    System.out.println("Division: " + divi);
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                    }
        }while (opcion != 5);
    }             
        
    
}
