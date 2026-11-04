/* Este programa tiene como objetivo asegurarse de que los usuarios sean mayores de edad 
 para acceder a los estudios ofrecidos */

package Ejercicio3;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		// Declaramos las variables
		String Nombre, Apellidos;
		int Edad;
				
		Scanner input = new Scanner(System.in);
		
		// Pedimos la edad al usuario/a
		System.out.println("Pon tu edad: ");
		Edad = input.nextByte();
		
		// Usamos if para asegurarnos de que el usuario/a sea mayor de edad
		if (Edad < 18) {
			System.out.println("No tiene la edad requerida para realizar estos "
					+ "estudios");
		}
		
		// Si el usuario/a es mayor de edad, se ejecuta la sentencia else	
		else {
			
			//Pedimos el nombre y apellidos al usuario
			System.out.println("Pon tu nombre: ");
			Nombre = input.nextLine();
			
			System.out.println("Pon tus apellidos: ");
			Apellidos = input.nextLine();
			
			//Mostramos los datos anteriores junto a un mensaje
			System.out.println("Nombre: " + Nombre);
			System.out.println("Apellidos: " + Apellidos);
			System.out.println("Edad: " + Edad);
			System.out.println("Usted a sido admitido/a");
		}

	}

}
