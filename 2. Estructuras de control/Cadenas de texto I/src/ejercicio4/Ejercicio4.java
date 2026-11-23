package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        // Pedimos al usuario que escriba una frase
        System.out.println("Introduce una frase:");
        String frase = teclado.nextLine();

        frase = frase.toLowerCase();
        
        // Declaramos las variables que almacenarán la cantidad de vocales
        int a = 0, e = 0, i = 0, o = 0, u = 0;

        for (int j = 0; j < frase.length(); j++) {

            char letra = frase.charAt(j);

            switch (letra) {
                case 'a':
                    a++;
                    break;
                case 'e':
                    e++;
                    break;
                case 'i':
                    i++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'u':
                    u++;
                    break;
            }
        }

        System.out.println("Nº de A's: " + a);
        System.out.println("Nº de E's: " + e);
        System.out.println("Nº de I's: " + i);
        System.out.println("Nº de O's: " + o);
        System.out.println("Nº de U's: " + u);

        teclado.close();
	}

}
