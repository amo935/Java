/*
Este programa solicita dos números al usuario y utiliza la clase
Math para encontrar el menor, calcular la potencia del primero
elevado al segundo, obtener la raíz cuadrada del primero y generar
un número aleatorio entre 0 y el segundo número.
*/

package Ejercicio5;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Declaramos las variables
        double num1, num2;
        
        //Pedimos los números al usuario
        System.out.print("Introduce un número: ");
        num1 = input.nextDouble();

        System.out.print("Introduce otro número: ");
        num2 = input.nextDouble();

        // Mostramos el número menor de los dos
        System.out.println("El número menor es: " + Math.min(num1, num2));

        // Calculamos el primer número elevado al segundo
        System.out.println("La potencia es: " + Math.pow(num1, num2));

        // Calculamos la raíz cuadrada del primer número
        System.out.println("La raíz cuadrada del primer número es: "
        + Math.sqrt(num1));

        /* La función genera un número aleatorio y lo multiplica por el 
        segundo número para que el número esté entre 0 y el valor de num2*/
        System.out.println("El número aleatorio es: "
        + (Math.random() * num2));

	}

}
