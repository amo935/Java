/* Este programa permite recoger los datos personales y académicos del usuario, evaluar 
su nota numérica y generar una ficha informativa con todos los datos introducidos, mostrando 
la calificación obtenida en formato cualitativo (insuficiente, aprobado, bien, notable o 
sobresaliente) según la nota alcanzada. */

package Ejercicio5;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		// Declaramos las variables
		String Nombre, Apellidos, Formacion;
		int Nota;
		
		Scanner input = new Scanner(System.in);
		
		// Pedimos datos al usuario
		System.out.println("Pon tu nombre: ");
		Nombre = input.nextLine();
		
		System.out.println("Pon tus apellidos: ");
		Apellidos = input.nextLine();
		
		System.out.println("Indica tu ciclo formativo: ");
		Formacion = input.nextLine();
		
		System.out.println("Indica la nota académica: ");
		Nota = input.nextInt();
		
		// Mostramos los datos introducidos por pantalla
		System.out.println("Nombre: " + Nombre);
		System.out.println("Apellidos: " + Apellidos);
		System.out.println("Ciclo Formativo: " + Formacion);
		
		// Usamos switch para poner un mensaje diferente dependiendo de la nota puesta
		switch (Nota) {
	    case 4:
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
	    	System.out.println("El valor introducido no es válido.");
	        break;
	}

	}

}
