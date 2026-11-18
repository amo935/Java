package Ejercicio18;

import java.util.Arrays;

public class ejercicio18 {

	public static void main(String[] args)  {

        // Creamos un array de 30 posiciones
        int[] numeros = new int[30];

        // Rellenamos el array con números aleatorios del 0 al 9
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 10);
        }

        // Mostramos el array sin ordenar
        System.out.println("Secuencia sin ordenar:");
        System.out.println(Arrays.toString(numeros));

        // Ordenamos el array
        Arrays.sort(numeros);

        // Mostramos el array ordenado
        System.out.println("Secuencia ordenada:");
        System.out.println(Arrays.toString(numeros));

	}

}
