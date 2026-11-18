package Ejercicio20;

import java.util.Scanner;

public class ejercicio20 {

	public static void main(String[] args)  {

        Scanner teclado = new Scanner(System.in);

        // Creamos un array de 1000 posiciones
        int[] numeros = new int[1000];

        /* Rellenamos el array con números aleatorios entre 0 y 99, utilizando un 
        bucle for y Math.random() */
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random() * 100);
        }

        // Pedimos un número al usuario
        System.out.print("Introduce un número (0-99): ");
        int n = teclado.nextInt();

        // Creamos una variable para contar el número de apariciones
        int contador = 0;
        
        // Buscamos el número dentro del array y cuenta sus apariciones dentro del mismo
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == n) {
                contador++;
            }
        }

        // Mostramos el resultado por pantalla
        if (contador > 0) {
            System.out.println("El número " + n + " sí existe en el array.");
            System.out.println("Aparece " + contador + " veces.");
        } 
        
        else {
            System.out.println("El número " + n + " no existe en el array.");
        }

        teclado.close();

	}

}
