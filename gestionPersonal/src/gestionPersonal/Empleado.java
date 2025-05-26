package gestionPersonal;

public abstract class Empleado extends Persona {
	
	protected double salarioBase;

	public Empleado(String nombre, int edad, double salarioBase) {
		super(nombre, edad);
		// TODO Auto-generated constructor stub
		this.salarioBase = salarioBase;
	}

	public Empleado() {
		// TODO Auto-generated constructor stub
		super();
		salarioBase = 0;
		
	}
	
	//Metodo abstracto
	
	public abstract double calcularSalario();
	
	//Metodo comun
	
	public void mostrarInfo() {
		super.mostrarDatos();
		System.out.println("Salario base: "+salarioBase);
	}

	
	//Getters setters
	
	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		if(salarioBase > 0){
			this.salarioBase = salarioBase;
		}else {
			System.out.println("Salario base no permitido");
		}
	}

	
	
	
}
