/* Este programa solicita a un estudiante las calificaciones obtenidas en cuatro 
asignaturas y calcula la nota media, determinando si cumple el requisito académico para 
acceder a estudios superiores.*/

package Ejercicio4;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		// Declaramos las variables
		double nota1, nota2, nota3, nota4, media;
		
		
		// Solicitamos las notas al usuario
        System.out.print("Introduce la nota de la asignatura 1: ");
        nota1 = teclado.nextDouble();

        System.out.print("Introduce la nota de la asignatura 2: ");
        nota2 = teclado.nextDouble();

        System.out.print("Introduce la nota de la asignatura 3: ");
        nota3 = teclado.nextDouble();

        System.out.print("Introduce la nota de la asignatura 4: ");
        nota4 = teclado.nextDouble();

        // Calculamos la nota media
        media = (nota1 + nota2 + nota3 + nota4) / 4;

        // Mostramos la nota media por pantalla
        System.out.println("La nota media es: " + media);

        // Redondeamos hacia arriba o abajo 
        System.out.println("La media redondeada hacia arriba es: "
                + Math.ceil(media));

        System.out.println("La media redondeada hacia abajo es: "
                + Math.floor(media));

        // Comprobamos si la media supera 8
        if (media > 8) {
            System.out.println("Puedes acceder a estudios superiores.");
        } 
        
        else {
            System.out.println("La nota media obtenida no es suficiente "
                    + "para acceder a los estudios que deseabas.");
        }

	}

}
