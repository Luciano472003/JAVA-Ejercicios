package ejercicio4.enc7.pkg8;

import java.util.Scanner;

public class Ejercicio4Enc78 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero para ver si es Primo o no: ");
        int num = sc.nextInt();
        String yn = "y";
        
        boolean esPrimo = NPrimo(num);
        
        if (esPrimo) {
            System.out.println("El numero " + num + " es Primo");
        } else {
            System.out.println("El numero " + num + " NO es Primo");
        }
        
    }

    public static boolean NPrimo(int num) {
        boolean primo = true;
 
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    primo = false;
                    break;
                }
            }
 
        return primo;
    }
}
