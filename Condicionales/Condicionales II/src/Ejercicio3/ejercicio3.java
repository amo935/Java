/* Este programa solicita al usuario una nota entera comprendida entre 0 y 10 y muestra 
la calificación correspondiente en función del valor introducido. */

package Ejercicio3;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		// Declaramos la variable
		int Nota;
		
		Scanner input = new Scanner(System.in);
		
		// Pedimos la nota al usuario
		System.out.println("Nota: ");
		Nota = input.nextInt();
		
		// Dependiendo de la nota, nos mostrará un mensaje u otro
		switch (Nota) {
		case 0: case 1: case 2: case 3: case 4:
	    	System.out.println("Nota académica: " + Nota + "(Insuficiente)");
	        break;
	    case 5:
	    	System.out.println("Nota académica: " + Nota + "(Aprobado)");
	        break;
	    case 6:
	    	System.out.println("Nota académica: " + Nota + "(Bien)");
	        break;
	    case 7: case 8:
	    	System.out.println("Nota académica: " + Nota + "(Notable)");
	        break;
	    case 9: case 10:
	    	System.out.println("Nota académica: " + Nota + "(Sobresaliente)");
	        break;
	    default:
	    	System.out.println("La nota introducida es incorrecta.");
	        break;
	}

	}

}
