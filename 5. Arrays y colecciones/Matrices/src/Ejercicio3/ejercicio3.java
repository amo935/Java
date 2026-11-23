package Ejercicio3;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int filas, columnas, positivos = 0, negativos = 0, ceros = 0;

        // Pedimos el tamaño de la matriz
        System.out.print("Introduce el número de filas: ");
        filas = teclado.nextInt();

        System.out.print("Introduce el número de columnas: ");
        columnas = teclado.nextInt();

        // Creamos la matriz con los datos anteriores
        int[][] matriz = new int[filas][columnas];

        // Introducimos los valores de la matriz
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {

                System.out.print("Introduce un número para la fila "
                                 + (i + 1) + " y columna " + (j + 1) + ": ");

                matriz[i][j] = teclado.nextInt();
            }
        }

        /* Recorremos la matriz y contamos la cantidad de los diferentes valores 
        introducidos */
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {

                if (matriz[i][j] > 0) {
                    positivos++;
                } 
                
                else if (matriz[i][j] < 0) {
                    negativos++;
                } 
                
                else {
                    ceros++;
                }
            }
        }

        // Mostramos la cantidad de cada tipo de valor
        System.out.println("\nResultados:");
        System.out.println("Números positivos: " + positivos);
        System.out.println("Números negativos: " + negativos);
        System.out.println("Cantidad de ceros: " + ceros);

        teclado.close();

	}

}
