package ejercicio5.enc9.pkg11;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5Enc911 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //int[][] matriz = new int[3][3];
        int[][] matriz = new int [3][3];
        int fila = 1;
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Fila Numero: °" + fila);
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = sc.nextInt();
            }
            fila++; 
        }
        
        
        System.out.println("Matriz Normal: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                System.out.print("[" + matriz[i][j] + "]");
            }

            System.out.println(" ");
        }
        
        int[][] Transpuesta = transponer(matriz);
        System.out.println(" ");
        System.out.println("Matriz Transpuesta: ");
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[" + Transpuesta[i][j] + "]");
            }
            System.out.println(" ");

        }

        System.out.println(" ");
        System.out.println("Matriz Negativa: ");
        
        int[][] Negativa = invertir(matriz);
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[" + Negativa[i][j] + "]");
            }
            System.out.println(" ");
        }
        
        
        if (Arrays.deepEquals(Transpuesta, Negativa)) {
            System.out.println("Es una matriz AntiSimetrica");
            
        }else{
            System.out.println("No es una matriz AntiSimetrica");
        }
        
    }

    //TRANSPONER MATRIZ******************
    public static int[][] transponer(int[][] matriz){
       int matrizT[][] = new int[matriz.length][matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                matrizT[i][j] = matriz[j][i];

            }
        } 
        return matrizT;
    }
    
    //PASAR MATRIZ A NEGATIVO*************
    
    public static int[][] invertir(int[][] matriz){
        
        int matrizN[][] = new int[matriz.length][matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matrizN[i][j] = matriz[i][j]*-1;
            }
        }
        return matrizN;
    }    
}
