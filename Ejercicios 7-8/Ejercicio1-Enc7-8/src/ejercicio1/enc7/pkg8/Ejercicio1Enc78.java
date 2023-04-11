package ejercicio1.enc7.pkg8;

import java.util.Scanner;

public class Ejercicio1Enc78 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int rta = 0;
        do {
            System.out.println("Ingrese dos numeros para realizar la operacion");

            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            System.out.println("Seleccione la operacion que desea realizar con los numeros: " + num1 + " y " + num2);
            System.out.println("SUMAR (1)");
            System.out.println("RESTAR (2)");
            System.out.println("MULTIPLICAR (3)");
            System.out.println("DIVIDIR (4)");
            System.out.println("SALIR DEL PROGRAMA (5)");
            
            rta = sc.nextInt();

            switch (rta) {
                case 1:
                    int resultadoA = sumar(num1, num2);
                    System.out.println("**************************************");
                    System.out.println("El resultado de la SUMA: " + resultadoA);
                    System.out.println("**************************************");
                    break;
                case 2:
                    int resultadoB = restar(num1, num2);
                    System.out.println("**************************************");
                    System.out.println("El resultado de la RESTA: " + resultadoB);
                    System.out.println("**************************************");
                    break;
                case 3:
                    int resultadoC = multiplicar(num1, num2);
                    System.out.println("**************************************");
                    System.out.println("El resultado de la MULTIPLICACION: " + resultadoC);
                    System.out.println("**************************************");
                    break;
                case 4:
                    double resultadoD = dividir(num1, num2);
                    System.out.println("**************************************");
                    System.out.println("El resultado de la DIVISION: " + resultadoD);
                    System.out.println("**************************************");
                    break;
                case 5:
                    System.out.println("**************************************");
                    System.out.println("Saliendo del Programa...");
                    System.out.println("**************************************");
                    break;
                default:
                    System.out.println("**************************************");
                    System.out.println("ERROR...");
                    System.out.println("**************************************");
                    break;
            }
        } while (rta != 5);
    }

    //------------------SUMA--------------------
    public static int sumar(int num1, int num2) {
        int suma;
        suma = num1 + num2;
        return suma;
    }

    //------------------RESTA-------------------
    public static int restar(int num1, int num2) {
        int resta;
        resta = num1 - num2;
        return resta;
    }

    //------------------MULTIPLICACION----------
    public static int multiplicar(int num1, int num2) {
        int multi;
        multi = num1 * num2;
        return multi;
    }

    //------------------DIVISION---------------
    public static float dividir(int num1, int num2) {
        float div;
        div = num1 / num2;
        return div;
    }
}
