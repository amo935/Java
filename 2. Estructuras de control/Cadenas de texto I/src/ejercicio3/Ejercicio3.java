package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Introduce tu nombre: ");
        String nombre = input.nextLine();

        System.out.println("Introduce tu primer apellido: ");
        String apellido1 = input.nextLine();

        System.out.println("Introduce tu segundo apellido: ");
        String apellido2 = input.nextLine();

        String usuario = nombre.substring(0, 3) +
                        apellido1.substring(0, 3) +
                        apellido2.substring(0, 3);

        usuario = usuario.toUpperCase();

        System.out.println("Tu código de usuario es: " + usuario);

        input.close();

	}

}
