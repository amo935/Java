package Ejercicio6;

import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		// Declaramos las variables
        int N, M;

        // Pedimos al usuario dos números
        System.out.print("Introduce un número para definir la cantidad de "
        + "repeticiones: ");
        N = teclado.nextInt();

        System.out.print("Introduce otro número para duplicarlo: ");
        M = teclado.nextInt();

        // Creamos el array de tamaño N
        int[] numeros = new int[N];

        // Rellenamos todas las posiciones con M
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = M;
        }

        // Mostramos el contenido del array por pantalla
        System.out.println(N > 1 ? "Repetición de "+ M + " unas " + N + " veces:" 
        : "Repetición de "+ M + " una vez:");
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        teclado.close();

	}

}
