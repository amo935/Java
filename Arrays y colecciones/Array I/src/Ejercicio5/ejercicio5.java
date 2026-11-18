package Ejercicio5;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Declaramos el array y las variables que usaremos
        double[] numeros = new double[20];
        double suma = 0, media;

        // Pedimos 20 números y los guardarmos en el array
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = teclado.nextDouble();
        }

        // Recorremos el array para calcular la suma
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }

        // Calculamos la media 
        media = suma / numeros.length;

        // Mostramos el resultado por pantalla 
        System.out.println("La media de los números es: " + media);

        teclado.close();

	}

}
