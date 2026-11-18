package Ejercicio7;

import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] numerosListados;
		int P, Q;
		
		// Pedimos los números al usuario
		System.out.println("Dame un número: ");
		P = input.nextInt();
				
		System.out.println("Dame otro número: ");
		Q = input.nextInt();
		
		/* Comprobamos si P es menor o mayor que Q para establecer el tamaño 
		del array */ 
		if (P <= Q) {
			numerosListados = new int[Q - P + 1];
        } else {
        	numerosListados = new int[P - Q + 1];
        }

        // Rellenamos el array de forma ascendente o descendente
        for (int i = 0; i < numerosListados.length; i++) {
            if (P <= Q) {
            	numerosListados[i] = P + i;
            } else {
            	numerosListados[i] = P - i;
            }
        }

        /* Mostramos un mensaje distinto dependiendo de si se cumple la 
        condición o no */
        System.out.println(P > Q ? "Lista de números descendente:" : 
        "Lista de números ascendente:");
        
        // Mostramos el contenido del array al usuario
        for (int i = 0; i < numerosListados.length; i++) {
            System.out.print(numerosListados[i] + " ");
        }

        input.close();

	}

}
