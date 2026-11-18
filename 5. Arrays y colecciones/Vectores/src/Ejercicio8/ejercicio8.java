package Ejercicio8;


import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Creamos un array de 100 números reales 
        double[] numeros = new double[100];

        // Rellenamos el array con valores entre 0.0 y 1.0
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Math.random();
        }

        // Pedimos al usuario el valor R
        System.out.print("Introduce un valor entre 0 y 1: ");
        double R = input.nextDouble();

        // Contamos los valores iguales o superiores a R 
        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] >= R) {
                contador++;
            }
        }

        // Mostrar el resultado
        System.out.println("Hay " + contador +
                " números iguales o superiores a " + R);

        input.close();
    }
}
