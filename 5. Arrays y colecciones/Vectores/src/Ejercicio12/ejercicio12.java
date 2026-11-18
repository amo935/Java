package Ejercicio12;

import java.util.Scanner;

public class ejercicio12 {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        char opcion;
        int v, p;

        do {
            System.out.println("\na. Mostrar valores");
            System.out.println("b. Introducir valor");
            System.out.println("c. Salir");
            System.out.print("Elige una opcion: ");
            opcion = sc.next().charAt(0);

            switch (opcion) {

                case 'a':
                    for (int i = 0; i < 10; i++) {
                        System.out.println(numeros[i]);
                    }
                    break;

                case 'b':
                    System.out.print("Introduce el valor V: ");
                    v = sc.nextInt();

                    System.out.print("Introduce la posicion P (0-9): ");
                    p = sc.nextInt();

                    numeros[p] = v;
                    break;

                case 'c':
                    System.out.println("Fin del programa");
                    break;

                default:
                    System.out.println("Opcion incorrecta");
            }

        } while (opcion != 'c');

        sc.close();

	}

}
