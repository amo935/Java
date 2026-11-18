package Ejercicio10;

import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int personas, encima = 0, debajo = 0;
        double suma = 0, media, max, min;

        System.out.print("Introduce el numero de personas: ");
        personas = sc.nextInt();

        double[] alturas = new double[personas];

        // Introducir alturas y calcular suma
        for (int i = 0; i < personas; i++) {
            System.out.print("Altura de la persona " + (i + 1) + ": ");
            alturas[i] = sc.nextDouble();
            suma += alturas[i];
        }

        // Calcular media
        media = suma / personas;

        // Calcular maximo, minimo y contar personas
        max = min = alturas[0];

        for (int i = 0; i < personas; i++) {
            max = Math.max(max, alturas[i]);
            min = Math.min(min, alturas[i]);

            if (alturas[i] > media) {
                encima++;
            } else if (alturas[i] < media) {
                debajo++;
            }
        }

        // Mostrar resultados
        System.out.println("--- RESULTADOS ---");
        System.out.println("Altura media: " + media + " metros");
        System.out.println("Altura maxima: " + max + " metros");
        System.out.println("Altura minima: " + min + " metros");
        System.out.println("Personas por encima de la media: " + encima);
        System.out.println("Personas por debajo de la media: " + debajo);

        sc.close();
    }
}
