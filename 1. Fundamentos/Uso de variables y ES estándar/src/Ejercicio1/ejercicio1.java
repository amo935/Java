/* Este es un programa, el cuál haciendo uso de la entrada estándar, solicita 
los datos personales al usuario para mostrarlos por pantalla al mismo. */

package Ejercicio1;

//Importamos la utilidad Scanner
import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		
		//Declaramos las variables
		String name;
		String lastName;
		byte age;
		String address;
		double metres;
		double weight;
		
		//Usamos Scanner para pedir datos por consola
		Scanner input = new Scanner(System.in);
		
		//Pedimos al usuario los datos requeridos
		System.out.println("Pon tu nombre: ");
		name = input.nextLine();
		
		System.out.println("Pon tus apellidos: ");
		lastName = input.nextLine();
		
		System.out.println("Pon tu edad: ");
		age = input.nextByte();
		
		/*Usamos otro Scanner porque crea un conflicto con el buffer */
		Scanner teclado = new Scanner(System.in);
		
		//Seguimos pidiendo datos al usuario con el nuevo Scanner
		System.out.println("Pon tu dirección: ");
		address = teclado.nextLine();
		
		System.out.println("Indica tu altura en metros: ");
		metres = teclado.nextDouble();
		
		System.out.println("Indica tu peso en kilos: ");
		weight = teclado.nextDouble();
		
		//Se mostrará por pantalla los datos introducidos anteriormente
		System.out.println("Nombre: " + name);
		System.out.println("Apellidos: " + lastName);
		System.out.println("Edad: " + age);
		System.out.println("Dirección: " + address);
		System.out.println("Estatura: " + metres);
		System.out.println("Peso: " + weight);

	}

}

