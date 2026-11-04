/* Este programa solicita al usuario sus datos personales y su nota académica para validar 
que la nota introducida esté comprendida entre 0 y 10 y muestra una ficha con toda la 
información y la calificación correspondiente. Además, se incorporarán estructuras 
condicionales para detectar notas no válidas y contemplar el caso especial de obtener 
un 10, cuya calificación será «Matrícula de Honor». */

package Ejercicio6;

import java.util.Scanner;

public class ejercicio6 {

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
		
		// Usaremos if para asegurarnos de que el valor introducido sea correcto
		if (Nota < 0 || Nota > 10) {
			System.out.println("La nota académica indicada es incorrecta");
		}
		
		else {
				
		// Usamos switch para poner un mensaje diferente dependiendo de la nota puesta
		switch (Nota) {
			 case 5:
				System.out.println("Nota académica: " + Nota + "(Aprobado)");
			    break;
			 case 6:
				 System.out.println("Nota académica: " + Nota + "(Bien)");
			     break;
			 case 7: case 8:
				 System.out.println("Nota académica: " + Nota + "(Notable)");
			     break;
			 case 9: 
			    System.out.println("Nota académica: " + Nota + "(Sobresaliente)");
			    break;
			 case 10: 
				System.out.println("Nota académica: " + Nota + "(Matrícula de Honor)");
				break;
			 default:
				 System.out.println("Nota académica: " + Nota + "(Insuficiente)");
			    break;
			}
		}

	}

}
