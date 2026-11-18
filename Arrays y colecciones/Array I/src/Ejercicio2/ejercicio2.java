package Ejercicio2;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Declaramos el array y la variable 'suma'
        int[] numeros = new int[10];
        int suma = 0;

        // Pedimos diez números al usuario
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = input.nextInt();
        }

        // Realizamos la suma de todos los números introducidos
        for (int i = 0; i < numeros.length; i++) {
        	suma = suma + numeros[i];
        }
        
     // Mostramos el resultado por pantalla
        System.out.println("La suma de todos los números es: " + suma);

        input.close();

	}

}
