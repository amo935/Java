/* Este programa pide al usuario/a datos para saber si cumple con los requisitos para
ser admitido/a a un curso.*/

package Ejercicio2;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		// Declaramos las variables
		String Nombre;
		int Edad;
		double Nota;
		
		Scanner input = new Scanner(System.in);
		
		// Pedimos datos al usuario
		System.out.println("Pon tu nombre: ");
		Nombre = input.nextLine();
		
		System.out.println("Pon tu edad: ");
		Edad = input.nextByte();
		
		System.out.println("Indica tu altura nota académica: ");
		Nota = input.nextDouble();
		
		// Usamos if para indicar al usuario/a si está admitido/a
		if (Edad > 18 && Nota > 7) {
			System.out.println( Nombre + ", usted ha sido admitido/a en el curso, "
					+ "cumple con las condiciones requeridas");
		}
		
		// Usamos else para indicar al usuario/a que no está admitido/a en el curso
		else {
			System.out.println( Nombre + ", lo sentimos, no ha sido admitido/a en "
					+ "el curso ya que no cumple los requisitos mínimos");
		}

	}

}
