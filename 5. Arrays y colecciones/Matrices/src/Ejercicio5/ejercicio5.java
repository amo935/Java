package Ejercicio5;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        // Declaramos una variable para almacenar el número de personas
        int personas;

        // Pedimos el número de personas
        System.out.print("Introduce el número de personas: ");
        personas = input.nextInt();

        // Creamos la matriz con las filas y columnas que necesitamos
        double[][] datos = new double[personas][2];

        // Introducimos los datos de cada persona
        for (int i = 0; i < personas; i++) {

            System.out.println("\nPersona " + (i + 1));

            System.out.print("Introduce el género (0 = hombre, 1 = mujer): ");
            datos[i][0] = input.nextInt();

            System.out.print("Introduce el sueldo: ");
            datos[i][1] = input.nextDouble();
        }

        // Mostramos los datos de las personas registradas anteriormente
        System.out.println("\nDATOS REGISTRADOS:");

        for (int i = 0; i < personas; i++) {
        	
        	// Declaramos una variable para mostrar el género en texto
            String genero;
            
            /* Pondrá el género correspondiente basándose en el valor de la
            primera columna de la matriz */ 
            if (datos[i][0] == 0) {
                genero = "Hombre";
            } 
            
            else {
                genero = "Mujer";
            }
            
         // Mostrará por pantalla los siguientes datos
            System.out.println("\nPersona " + (i + 1));
            System.out.println("Género: " + genero);
            System.out.println("Sueldo: " + datos[i][1]);
        }

        // Declaramos las variables para calcular las medias
        double sumaHombres = 0, sumaMujeres = 0;
        int contadorHombres = 0, contadorMujeres = 0;

        /* Recorremos la matriz para sumar los sueldos y cantidad de hombres y 
        mujeres por separado */
        for (int i = 0; i < personas; i++) {

            if (datos[i][0] == 0) {
                sumaHombres = sumaHombres + datos[i][1];
                contadorHombres++;
            } 
            
            else if (datos[i][0] == 1) {
                sumaMujeres = sumaMujeres + datos[i][1];
                contadorMujeres++;
            }
        }

        // Declaramos las variables para calcular la media de los sueldos
        double mediaHombres = 0, mediaMujeres = 0;
        
        /* Calculamos y mostramos una media o ambas dependiendo de si hay hombres o 
        mujeres solamente */
        if (contadorHombres > 0) {
            mediaHombres = sumaHombres / contadorHombres;
            System.out.println("\nSueldo medio de los hombres: " + mediaHombres);
        } 
        
        else {
            System.out.println("\nNo hay hombres registrados.");
        }

        if (contadorMujeres > 0) {
            mediaMujeres = sumaMujeres / contadorMujeres;
            System.out.println("Sueldo medio de las mujeres: " + mediaMujeres);
        } 
        
        else {
            System.out.println("No hay mujeres registradas.");
        }

        // Mostramos por pantalla si existen diferencias salariales o no las hay
        if (contadorHombres > 0 && contadorMujeres > 0) {

            if (mediaHombres > mediaMujeres) {
                System.out.println("\nExiste una diferencia salarial a favor de los "
                		+ "hombres.");
            } 
            
            else if (mediaMujeres > mediaHombres) {
                System.out.println("\nExiste una diferencia salarial a favor de las "
                		+ "mujeres.");
            } 
            
            else {
                System.out.println("\nNo existe diferencia entre los sueldos medios.");
        	}
        }
        
        else {
        	System.out.println("\nNo existen datos para procesar la petición");
        }

        input.close();

	}

}
