/* Este programa pide al usuario dos números y después
intercambia sus valores utilizando una variable auxiliar.
Finalmente, muestra por pantalla los números con sus
valores intercambiados. */

package Ejercicio3;

//Importamos la utilidad Scanner
import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Declaramos tres variables con valor int
        int num1, num2, change;

        System.out.print("Introduce un número: ");
        num1 = input.nextInt();

        System.out.print("Introduce otro número: ");
        num2 = input.nextInt();

        // Intercambiamos los valores usando las variables anteriores
        change = num1;
        num1 = num2;
        num2 = change;

        // Mostrar los valores intercambiados
        System.out.println("¡El cambio se ha realizado!");
        System.out.println(" Después de completarlo el valor de num1 es " 
        + num1 + ". Y el valor de num2 es " + num2);

	}

}
