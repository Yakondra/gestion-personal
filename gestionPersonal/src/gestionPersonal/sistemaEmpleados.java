package gestionPersonal;

import java.util.ArrayList;
import java.util.Scanner;

public class sistemaEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner lectorInput = new Scanner(System.in);
		
		ArrayList<Empleado> empleados = new ArrayList<>();
		
		boolean salir = true;
		
		while (salir) {
			
			System.out.println("1. Añadir empleado.");
			System.out.println("2. Calcular y mostrar salario del empleado.");
			System.out.println("3. Mostrar info de todos los empleados.");
			System.out.println("4. Salir");
			System.out.println("\nSelecciona una de las opciones:");
			int opcion = lectorInput.nextInt();
			lectorInput.nextLine();
			
			switch (opcion) {
			case 1:
				if (empleados.size() == 6) {
					System.out.println("No se puede añadir más empleados");
					break;
				}
				
				System.out.println("Seleccione tipo de empleado: (fijo o por horas");
				String tipo = lectorInput.nextLine().toLowerCase();
				
				if (tipo.equals("fijo")) {
					System.out.println("Introduce el nombre: ");
					String nombre = lectorInput.nextLine();
					System.out.println("Indica su edad: ");
					int edad = lectorInput.nextInt();
					System.out.println("Salario base: ");
					double salarioBase = lectorInput.nextDouble();
					
					EmpleadoFijo empleado1 = new EmpleadoFijo(nombre, edad, salarioBase);
					empleados.add(empleado1);
					System.out.println("Empleado añadido");
					
				}else if (tipo.equals("por horas")) {
					System.out.println("Introduce el nombre: ");
					String nombre = lectorInput.nextLine();
					System.out.println("Indica su edad: ");
					int edad = lectorInput.nextInt();
					System.out.println("Salario base: ");
					double salarioBase = lectorInput.nextDouble();
					System.out.println("Indique las horas trabajadas: ");
					int horasTrabajadas = lectorInput.nextInt();
					System.out.println("Indique la tarifa por horas: ");
					double tarifaHora = lectorInput.nextDouble();
					
					EmpleadoHoras empleado2 = new EmpleadoHoras(nombre, edad, salarioBase, horasTrabajadas, tarifaHora);
					empleados.add(empleado2);
					System.out.println("Empleado añadido");
				}else {
					System.out.println("Datos no válidos");
				}
				break;
			case 2:
				if (empleados.isEmpty()) {
					System.out.println("No hay empleados en la lista");
				}else {
					System.out.println("Hay "+empleados.size()+" empleados. Seleccione uno:");
					int indice = lectorInput.nextInt();
					
					if (indice > 0 && indice <= empleados.size()) {
						System.out.println("Salario: "+empleados.get(indice-1).calcularSalario());
					}else {
						System.out.println("Empleado no valido");
					}
				}
				break;
			case 3:
				if (empleados.isEmpty()) {
					System.out.println("No hay empleados en la lista");
				}else {
					for (Empleado e : empleados) {
						e.mostrarInfo();
					}
				}
				break;
			case 4:
				salir = false;
				System.out.println("Hasta la proxima");
				break;
				default:
					System.out.println("Opcion no valida");
				
			}
			
		}
		
		lectorInput.close();
		

	}

}
