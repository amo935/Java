package Ejercicio9;

import java.util.Scanner;

public class ejercicio9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        int[] numeros = new int[100];

        // Rellenar el array con números aleatorios
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = 1 + (int)(Math.random() * 10);
        }

        // Pedir el número N
        System.out.print("Introduce un número: ");
        int n = input.nextInt();

        // Array para guardar las posiciones
        int[] posiciones = new int[100];
        int contador = 0;

        // Buscar el número N
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == n) {
                posiciones[contador] = i;
                contador++;
            }
        }

        // Mostrar las posiciones encontradas
        if (contador == 0) {
            System.out.println("El número no aparece en el array.");
        } 
        
        else {
            System.out.println("El número aparece en las posiciones:");

            for (int i = 0; i < contador; i++) {
                System.out.print(posiciones[i]+ " ");
            }
        }

        input.close();

	}

}
