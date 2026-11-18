package Ejercicio19;


import java.util.Scanner;
import java.util.Arrays;

public class ejercicio19 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int[] puntuaciones = new int[8];

        // Pedir las puntuaciones
        for (int i = 0; i < puntuaciones.length; i++) {

            int valor;

            do {
                System.out.print("Introduce la puntuación del jugador " + (i + 1) + ": ");

                while (!teclado.hasNextInt()) {
                    System.out.println("Introduce un número entero: ");
                    teclado.nextLine();
                }

                valor = teclado.nextInt();

                if (valor < 1000 || valor > 2800) {
                    System.out.println("La puntuación debe estar entre 1000 y 2800.");
                }

            } while (valor < 1000 || valor > 2800);

            puntuaciones[i] = valor;
        }

        // Ordenar las puntuaciones
        Arrays.sort(puntuaciones);

        // Mostrar el ranking descendente
        System.out.println("\nRanking del torneo:");

        for (int i = puntuaciones.length - 1; i >= 0; i--) {
            System.out.println(puntuaciones[i]);
        }

        teclado.close();
    }
}

