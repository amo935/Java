package Ejercicio2;

public class ejercicio2 {

	public static void main(String[] args) {
		
		// Creamos la matriz
        int[][] matriz = new int[10][10];

        // Rellenamos la matriz con las tablas de multiplicar
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = (i + 1) * (j + 1);
            }
        }

        // Mostramos la matriz por pantalla
        System.out.println("Tablas de multiplicar del 1 al 10:");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

	}

}
