package Ejercicio4;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        // Creamos la matriz
        double[][] notas = new double[4][5];

        // Pedimos las notas que han sacado los alumnos
        for (int i = 0; i < 4; i++) {
            System.out.println("\nNotas del Alumno " + (i + 1));

            for (int j = 0; j < 5; j++) {
                System.out.print("Introduce la nota de la asignatura "
                                 + (j + 1) + ": ");
                notas[i][j] = teclado.nextDouble();
            }
        }

        // Calculamos el mínimo, máximo y la media de cada alumno
        for (int i = 0; i < 4; i++) {

            double minimo = notas[i][0], maximo = notas[i][0];
            double suma = 0;

            for (int j = 0; j < 5; j++) {

                if (notas[i][j] < minimo) {
                    minimo = notas[i][j];
                }

                if (notas[i][j] > maximo) {
                    maximo = notas[i][j];
                }

                suma = suma + notas[i][j];
            }

            double media = suma / 5;

            // Mostrar resultados
            System.out.println("\nResultados del Alumno " + (i + 1));
            System.out.println("Nota mínima: " + minimo);
            System.out.println("Nota máxima: " + maximo);
            System.out.println("Nota media: " + media);
        }

        teclado.close();

	}

}
