/* Este programa realiza la comparación entre dos números y muestra el resultado al usuario,
comprobando también si el valor introducido es válido. */

package Ejercicio1;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		// Declaramos las variables
		int num1, num2;
		
		// Pedimos los datos al usuario/a
		System.out.println("Dame un número: ");
		num1 = entrada.nextInt();
		
		System.out.println("Dame otro número: ");
		num2 = entrada.nextInt();
		
		// Usamos if y else if para comparar los números 
		if (num1 > num2) {
			System.out.println(num1 + " es mayor que " + num2);
		}
			
		else if(num1< num2) {
			System.out.println(num1 + " es menor que " + num2);
		}
		
		else if (num1 == num2){
			System.out.println("Ha puesto el mismo número");
		}
		
		// Usamos else cuando no se cumple ninguna de las condiciones anteriores
		else {
			System.out.println("Ha puesto un valor no válido");
		}
	}

}
