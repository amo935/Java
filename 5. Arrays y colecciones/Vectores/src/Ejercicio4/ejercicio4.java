package Ejercicio4;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Declaramos el array y las variables que usaremos
        int[] numeros = new int[20];
        int sumaPositivos = 0, sumaNegativos = 0;

        // Pedimos 20 números al usuario y los guardamos en el array
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = input.nextInt();
        }

        /* Iniciamos un bucle for para que realice la suma ambos tipos de 
        números*/
        for (int i = 0; i < numeros.length; i++) {
        	
        	/* Calculamos las sumas de los números positivos y negativos de
        	forma independiente usando condicionales*/
            if (numeros[i] > 0) {
                sumaPositivos += numeros[i];
            } else if (numeros[i] < 0) {
                sumaNegativos += numeros[i];
            }
        }

        // Mostramos por pantalla el resultado de ambas sumas
        System.out.println("Suma de los números positivos: " + sumaPositivos);
        System.out.println("Suma de los números negativos: " + sumaNegativos);

        input.close();

	}

}
