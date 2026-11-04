/* Este programa simula el funcionamiento de una calculadora básica y solicita al 
usuario dos valores numéricos permitiéndole seleccionar, mediante un menú de opciones, la 
operación matemática que desea realizar. 

A continuación, el programa ejecutará la operación seleccionada y mostrará el resultado por
pantalla.*/

package Ejercicio5;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		// Declaramos las variables
		int num1, num2, resultado;
		short operacion;
		
		Scanner input = new Scanner(System.in);
		
		// Pedimos los números y la operación que quiere realizar el usuario
		System.out.println("ntroduzca el valor 1: ");
		num1 = input.nextInt();
		
		System.out.println("ntroduzca el valor 2: ");
		num2 = input.nextInt();
		
		System.out.println("Indique la operación que quiere realizar (Inserte un número):");
		System.out.println("(1) Suma");
		System.out.println("(2) Resta");
		System.out.println("(3) Multiplicación");
		System.out.println("(4) División");
		
		operacion = input.nextShort();
		
		// Realiza la operación seleccionada anteriormente y muestra el resultado por pantalla
		switch (operacion) {
	    case 1:
	    	resultado = num1 + num2;
	    	System.out.println("Resultado: " + resultado);
	        break;
	    case 2:
	    	resultado = num1 - num2;
	    	System.out.println("Resultado: " + resultado);
	        break;
	    case 3:
	    	resultado = num1 * num2;
	    	System.out.println("Resultado: " + resultado);
	        break;
	    case 4:
	    	resultado = num1 / num2;
	    	System.out.println("Resultado: " + resultado);
	        break;
	    default:
			System.out.println("Los valores introducidos no son válidos.");
		    break;
		}
		
	}

}
