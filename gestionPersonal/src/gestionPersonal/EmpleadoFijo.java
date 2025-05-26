package gestionPersonal;

public class EmpleadoFijo extends Empleado {

	public EmpleadoFijo(String nombre, int edad, double salarioBase) {
		super(nombre, edad, salarioBase);
		// TODO Auto-generated constructor stub
	}

	public EmpleadoFijo() {
		// TODO Auto-generated constructor stub
		nombre = "";
		edad = 0;
		salarioBase = 0;
	}

	@Override
	public double calcularSalario() {
		// TODO Auto-generated method stub
		return salarioBase;
	}

	public void mostrarInfo() {
		super.mostrarInfo();
		System.out.println("El empleado es fijo");
		System.out.println("Nombre: "+nombre);
		System.out.println("Edad: "+edad);
		System.out.println("Salario base:"+salarioBase);
		
	}
	
}
