package Ejercicio11;

public class ejercicio11 {

    public static void main(String[] args) {

        // Crear dos arrays de 100 posiciones
        int[] array1 = new int[100];
        int[] array2 = new int[100];

        // Rellenar el primer array con valores del 1 al 100
        for (int i = 0; i < array1.length; i++) {
            array1[i] = i + 1;
        }

        // Copiar el primer array en orden inverso al segundo
        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[99 - i];
        }

        // Mostrar el primer array
        System.out.println("Primer array:");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }

        // Mostrar el segundo array
        System.out.println("\n\nSegundo array (orden inverso):");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
 
	}

}
