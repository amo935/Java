package Ejercicio15;

import java.util.Scanner;

public class ejercicio15 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		// Pedir los valores N y M
		System.out.print("Introduce un valor: ");
        int M = teclado.nextInt();
		
        System.out.print("Indica el número de repeticiones: ");
        int N = teclado.nextInt();

        // Creamos el array
        int[] numeros = new int[N];

        // Rellenamos el array con el primer valor introducido
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = M;
        }

        // Mostramos el contenido del array
        System.out.println("Resultado:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        teclado.close();

	}

}
