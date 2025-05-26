package gestionPersonal;

public class EmpleadoHoras extends Empleado {
	
	private int horasTrabajadas;
	private double tarifaHora;
	
	//Constructores

	public EmpleadoHoras(String nombre, int edad, double salarioBase, int horasTrabajadas, double tarifaHora) {
		super(nombre, edad, salarioBase);
		// TODO Auto-generated constructor stub
		this.horasTrabajadas = horasTrabajadas;
		this.tarifaHora = tarifaHora;
	}

	public EmpleadoHoras() {
		// TODO Auto-generated constructor stub
		nombre = "";
		edad = 0;
		salarioBase = 0;
		horasTrabajadas = 0;
		tarifaHora = 0;
	}

	@Override
	public double calcularSalario() {
		// TODO Auto-generated method stub
		return salarioBase + (horasTrabajadas * tarifaHora);
	}
	
	public void mostrarInfo() {
		super.mostrarInfo();
		System.out.println("Horas trabajadas: "+horasTrabajadas);
		System.out.println("Tarifa por hora: "+tarifaHora);
	}
	
	//Getters setters

	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(int horasTrabajadas) {
		if(horasTrabajadas > 0) {
			this.horasTrabajadas = horasTrabajadas;
		}else {
			this.horasTrabajadas =0;
			System.out.println("Las horas no son validas");
		}
	}

	public double getTarifaHora() {
		return tarifaHora;
	}

	public void setTarifaHora(double tarifaHora) {
		if(tarifaHora > 0) {
			this.tarifaHora = tarifaHora;
		}else {
			this.tarifaHora = 0;
			System.out.println("Tarifa no permitida");
		}
	}

	
	
	
	
}
