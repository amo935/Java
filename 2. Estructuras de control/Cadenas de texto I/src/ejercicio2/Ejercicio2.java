package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

        System.out.println("Escribe la primera cadena de texto:");
        String cadena1 = input.nextLine();

        System.out.println("Escribe la segunda cadena de texto:");
        String cadena2 = input.nextLine();

        if (cadena1.equals(cadena2)) {
            System.out.println("Las dos cadenas son exactamente iguales.");
        } 
        
        else {
            System.out.println("Las dos cadenas no son exactamente iguales.");
        }

        if (cadena1.equalsIgnoreCase(cadena2)) {
            System.out.println("Si no tenemos en cuenta las mayúsculas y minúsculas, las cadenas son iguales.");
        } 
        
        else {
            System.out.println("Las cadenas siguen siendo diferentes aunque no tengamos en cuenta las mayúsculas y minúsculas.");
        }

        input.close();

	}

}
