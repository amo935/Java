package Ejercicio2;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		// Declaramos las variables
		double pesetas, euros, TotalPesetas, TotalEuros;
		
		//Usamos Scanner para pedir datos por consola
		Scanner input = new Scanner(System.in);
		
		//Pedimos al usuario que indique los euros que tiene
		System.out.println("¿Cuántos euros tiene?: ");
		euros = input.nextDouble();
		
		//Calculamos cuantas pesetas serían y lo mostramos por pantalla
		TotalPesetas = euros * 166.386;
		System.out.println("Tiene un total de " + TotalPesetas + " pesetas");
		
		/*Hacemos la conversión al reves, es decir, de euros a pesetas*/
		System.out.println("¿Cuántos pesetas tiene?: ");
		pesetas = input.nextDouble();
		
		TotalEuros = pesetas * 0.0060;
		System.out.println("Tiene un total de " + TotalEuros + " euros");
		
	}

}
