package Ejercicio1;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		//Declaramos las variables
		String name;
		String lastNames;
		String age;
		double salary;
		double workingYears;
		double salaryN;
		double totalSalary;
		double aumento;
				
		//Usamos Scanner para pedir datos por consola
		Scanner input = new Scanner(System.in);
				
		//Pedimos al usuario los datos requeridos
		System.out.println("Pon tu nombre: ");
		name = input.nextLine();
				
		System.out.println("Pon tus apellidos: ");
		lastNames = input.nextLine();
				
		System.out.println("Pon tu fecha de nacimiento: ");
		age = input.nextLine();
				
		System.out.println("Indica tu salario bruto actual: ");
		salary = input.nextDouble();
				
		System.out.println("Indica los años trabajados en la empresa: ");
		workingYears = input.nextDouble();
		
		if (salary > 0 && workingYears >= 1) {
			//Calculamos el salario neto y total del emplead@
			salaryN = salary - salary * 15 / 100;
				aumento = workingYears * 2 / 100;
				totalSalary = salaryN + salaryN * aumento;
			
			System.out.println("Estimad@ " + name + 
			" su salario bruto es " + salary + 
			", teniendo en cuenta un IRPF del 15% su salario neto es " 
			+ salaryN);
			
			System.out.println("Debido a sus " + workingYears + 
			" años trabajando en la empresa su salario "
			+ "se incrementará en un 2% por cada año. El aumento es de " 
			+ aumento + " y el salario total es " + totalSalary);
			
		}
		
		else {
			System.out.println("Ha puesto un dato incorrecto en uno o más campos.");
		};

	}

}
