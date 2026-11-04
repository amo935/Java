/*Este programa ayuda al departamento de RRHH a filtrar candiatos para un puesto de trabajo, 
basandose en los siguientes requisitos:

- Salario deseado anual
- Edad
- Experiencia
- Proyectos realizados 
*/

package Ejercicio2;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		// Declaramos las variables
		String Nombre, Apellidos;
		int Edad, SalarioDeseado;
		short Experiencia, ProyectosRealizados;
				
		Scanner input = new Scanner(System.in);
				
		// Pedimos los valores al usuario/a
		System.out.println("Nombre: ");
		Nombre = input.nextLine();
						
		System.out.println("Apellidos: ");
		Apellidos = input.nextLine();
				
		System.out.println("Edad: ");
		Edad = input.nextInt();
				
		System.out.println("¿Cuál es tu salario anual ideal?: ");
		SalarioDeseado = input.nextInt();
				
		/* Esta parte del código es un if anidado, usado para comprobar si el candiato 
		cumple las condiciones */
		if (SalarioDeseado > 30.000 || Edad < 45) {
			System.out.println("Lo sentimos no cumples nuestro perfil");
		}
				
		else {
			System.out.println("Años de experiencia: ");
			Experiencia = input.nextShort();
					
			System.out.println("¿Cuántos proyectos has realizado?: ");
			ProyectosRealizados = input.nextShort();
					
			if (Experiencia > 2 && ProyectosRealizados > 3) {
				System.out.println("Enhorabuena. Ha sido contratado/a");
				
				/*Si el candidato/a ha realizado más de 5 proyectos o tiene más de 5 años de 
				experiencia, recibirá 30000 euros anuales. En caso contrario recibirá 
				25000 euros*/
				if (Experiencia > 5 || ProyectosRealizados > 5) {
					System.out.println("Su salario anual será 30.000 euros");
				}
				
				else {
					System.out.println("Su salario anual será 25.000 euros");
				}
			}
					
			else {
				System.out.println("Lo sentimos no cumples nuestro perfil");
			}
		}

	}

}
