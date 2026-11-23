package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Introduce una cadena de texto:");
        String cadena = input.nextLine();

        String[] palabras = cadena.split(" ");

        for (int i = 0; i < palabras.length; i++) {
            System.out.println(palabras[i]);
        }

        input.close();

	}

}
