package Ejercicio3;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Declaramos el array 'numeros'
        int[] numeros = new int[10];

        // Pedimos diez números al usuario
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = input.nextInt();
        }

        // Declaramos las variables 'maximo' y 'minimo'
        int maximo = numeros[0];
        int minimo = numeros[0];

        /* Recorremos el array, usando un bucle for, para buscar el número 
        mayor y menor dentro del mismo*/ 
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }

            else if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }

        // Mostramos el número mayor y menor dentro del array al usuario
        System.out.println("El número máximo es: " + maximo);
        System.out.println("El número mínimo es: " + minimo);

        input.close();

	}

}
