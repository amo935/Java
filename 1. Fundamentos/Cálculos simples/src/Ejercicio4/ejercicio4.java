/*
Este programa solicita un número decimal al usuario y aplica las funciones 
ceil, floor y round de la clase Math.

Finalmente, muestra los resultados. A continuación explicaré qué hace cada 
función.

- Ceil: redondea hacia arriba al entero más próximo.
- Floor: redondea hacia abajo al entero más próximo.
- Round: redondea al entero más próximo sin poner decimales (ya sea hacia 
arriba o abajo).

*/

package Ejercicio4;

//Importamos la utilidad Scanner
import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        double num;

        System.out.print("Introduce un número con decimales: ");
        num = input.nextDouble();

        // Aplicar las funciones de Math
        System.out.println("Funciones para redondear en Java el número " 
        + num);

        System.out.println("Ceil: " + Math.ceil(num));
        System.out.println("Floor: " + Math.floor(num));
        System.out.println("Round: " + Math.round(num));

	}

}
