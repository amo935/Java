package Ejercicio1;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Declaramos el array
        int[] numeros = new int[10];

        // Pedimos diez números reales
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = input.nextInt();
        }

        // Mostramos todos los números introducidos por pantalla
        System.out.println("Los números introducidos son:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        input.close();

	}

}
