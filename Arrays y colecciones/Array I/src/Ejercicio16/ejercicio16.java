
package Ejercicio16;

import java.util.Arrays;

public class ejercicio16 {
    public static void main(String[] args) {

        // Creamos un array de 55 posiciones
        int[] numeros = new int[55];

        int posicion = 0;

        // Rellenamos el array usando un bucle for y Arrays.fill
        for (int i = 1; i <= 10; i++) {

            Arrays.fill(numeros, posicion, posicion + i, i);

            posicion = posicion + i;
        }

        // Mostramos el contenido del array por pantalla
        System.out.println(Arrays.toString(numeros));
    }
}
