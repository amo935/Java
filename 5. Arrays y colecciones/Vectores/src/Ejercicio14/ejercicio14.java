package Ejercicio14;

public class ejercicio14 {

	public static void main(String[] args) {

		//Declaramos un array y la variable necesarias 
        int[] numeros = new int[55];
        int posicion = 0;

        /* Rellenamos el array usando dos bucles for anidados. Uno para elegir el 
        número y otro para repetirlo tantas veces como corresponda.*/
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                numeros[posicion] = i;
                posicion++;
            }
        }

        // Mostramos el contenido del array por pantalla
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

	}

}
