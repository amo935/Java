package Ejercicio13;

import java.util.Scanner;

public class ejercicio13 {

	public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        //Declaramos las variables
        int V, I, N;

        // Pedimos datos al usuario
        System.out.print("Introduce un valor inicial: ");
        V = teclado.nextInt();

        System.out.print("Introduce el incremento aplicable al número"
        		+ " anterior: ");
        I = teclado.nextInt();

        System.out.print("Introduce la cantidad de valores a mostrar: ");
        N = teclado.nextInt();

        // Creamos un array para guardar N cantidad de números 
        int[] secuencia = new int[N];

        // Almacenamos la secuencia en el array
        for (int i = 0; i < N; i++) {
            secuencia[i] = V + (i * I);
        }

        // Mostramos la secuencia por pantalla al usuario
        System.out.println("La secuencia aritmetica es:");

        for (int i = 0; i < N; i++) {
            System.out.print(secuencia[i] + " ");
        }

        teclado.close();

	}

}
