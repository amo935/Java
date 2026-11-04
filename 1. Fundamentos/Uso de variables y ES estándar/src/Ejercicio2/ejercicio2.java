/* * Este programa solicita al usuario los datos de un equipo de fútbol para
después muestrar todos los datos introducidos por pantalla. */

package Ejercicio2;

import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Solicitamos los datos al usuario
        System.out.print("Introduce el nombre del equipo: ");
        String equipo = teclado.nextLine();

        System.out.print("Introduce su año de fundación: ");
        int fundacion = teclado.nextInt();
        teclado.nextLine();

        System.out.print("Introduce el nombre del estadio: ");
        String estadio = teclado.nextLine();

        System.out.print("Introduce el nombre del capitán de equipo: ");
        String capitan = teclado.nextLine();

        // Se muestran los datos por pantalla
        System.out.println();
        System.out.println("**********************************************************************************************");
        System.out.println("******* Nombre del Equipo: " + equipo);
        System.out.println("******* Fundado en: " + fundacion);
        System.out.println("******* Estadio: " + estadio);
        System.out.println("******* Capitán: " + capitan);
        System.out.println("**********************************************************************************************");

        teclado.close();
    }
}


