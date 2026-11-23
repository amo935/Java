package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una frase:");
        String frase = teclado.nextLine();

        frase = frase.toLowerCase();
        frase = frase.replace(" ", "");

        String fraseInvertida = "";

        for (int i = frase.length() - 1; i >= 0; i--) {
            fraseInvertida = fraseInvertida + frase.charAt(i);
        }

        if (frase.equals(fraseInvertida)) {
            System.out.println("La frase es un palíndromo.");
        } 
        
        else {
            System.out.println("La frase no es un palíndromo.");
        }

        teclado.close();

	}

}
