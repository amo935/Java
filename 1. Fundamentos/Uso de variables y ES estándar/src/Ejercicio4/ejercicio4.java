/* Este programa utiliza una enumeración (enum) para crear una lista de 
cuatro tallas: pequeña, mediana, grande y extragrande. * Después, guarda 
cada talla en una variable y muestra todas ellas por pantalla acompañadas 
de un texto explicativo. */

package Ejercicio4;

public class ejercicio4 {

    // Creamos una lista enumerada con las tallas
    enum Tamanio {
        pequeña,
        mediana,
        grande,
        extragrande
    }

    public static void main(String[] args) {

        // Creamos cuatro variables que almacenen las distintas tallas
        Tamanio talla1 = Tamanio.pequeña;
        Tamanio talla2 = Tamanio.mediana;
        Tamanio talla3 = Tamanio.grande;
        Tamanio talla4 = Tamanio.extragrande;

        // Mostramos por pantalla los valores acompañados de un texto 
        System.out.println("La primera talla es " + talla1 + " porque siempre está arriba del todo.");
        System.out.println("La segunda talla es " + talla2 + " porque es superior la primera xd.");
        System.out.println("La tercera talla es " + talla3 + " porque tiene un gran tamaño.");
        System.out.println("La tercera talla es " + talla4 + " y está por encima de las anteriores xd.");
    }
}

