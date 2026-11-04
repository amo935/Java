/*Este programa calcula el importe total que ha gastado un cliente en un supermercado
durante cuatro compras y comprobar si tiene derecho a recibir un vale descuento de 50 €.*/

package Ejercicio4;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		// Declaramos las variables
		String Nombre, Apellidos;
		int ImporteGastado1, ImporteGastado2, ImporteGastado3, ImporteGastado4
		, ImporteMedio;
		
		Scanner input = new Scanner(System.in);
		
		// Pedimos datos al cliente
		System.out.println("Pon tu nombre: ");
		Nombre = input.nextLine();
		
		System.out.println("Pon tus apellidos: ");
		Apellidos = input.nextLine();
		
		System.out.println("Importe 1: ");
		ImporteGastado1 = input.nextInt();
		
		System.out.println("Importe 2: ");
		ImporteGastado2 = input.nextInt();
		
		System.out.println("Importe 3: ");
		ImporteGastado3 = input.nextInt();
		
		System.out.println("Importe 4: ");
		ImporteGastado4 = input.nextInt();
		
		//Realizamos la media de los importes anteriores
		
		ImporteMedio = (ImporteGastado1 + ImporteGastado2 + ImporteGastado3
				+ ImporteGastado4) / 4;
		
		//Mostramos por pantalla los valores anteriores
		System.out.println("Nombre: " + Nombre);
		System.out.println("Apellidos: " + Apellidos);
		System.out.println("Importe Gastado1: " + ImporteGastado1);
		System.out.println("Importe Gastado2: " + ImporteGastado2);
		System.out.println("Importe Gastado3: " + ImporteGastado3);
		System.out.println("Importe Gastado4: " + ImporteGastado4);
		System.out.println("Importe Medio: " + ImporteMedio);
		
		/* Usamos if para comprobar si la media de los importes es inferior a 300 euros. 
		En caso contrario, indicará al cliente el descuento adquirido*/
		if (ImporteMedio < 300) {
			System.out.println("Lo sentimos pero sus compras no han alcanzado "
					+ "los 300 euros este mes, no dispone de descuento.");
		}
		
		else {
			System.out.println("¡Felicidades! Ha ganado un vale descuento de 50 "
					+ "euros.");
		}
		
	}

}
