package Ejercicio17;

import java.util.Scanner;
import java.util.Arrays;

public class ejercicio17 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Creamos dos arrays para guardar 10 números en cada uno
        int[] array1 = new int[10];
        int[] array2 = new int[10];

        // Pedimos los 10 primeros números
        System.out.println("Introduce 10 números:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            array1[i] = teclado.nextInt();
        }

        // Pedimos los 10 últimos números
        System.out.println("Introduce otros 10 números:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 11) + ": ");
            array2[i] = teclado.nextInt();
        }

        // Comparamos los dos arrays usando equals
        if (Arrays.equals(array1, array2)) {
            System.out.println("Las dos secuencias son iguales.");
        } 
        
        else {
            System.out.println("Las dos secuencias son diferentes.");
        }

        teclado.close();
    }
}

