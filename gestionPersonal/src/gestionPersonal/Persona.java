package gestionPersonal;

public class Persona {
	
	protected String nombre;
	protected int edad;
	
	//Constructores
	
	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public Persona() {
		nombre = "";
		edad = 0;
	}
	
	//Metodo comun
	
	public void mostrarDatos() {
		System.out.println("Nombre: "+nombre);
		System.out.println("Edad: "+edad);
	}

	//Getters setters
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		if(edad >0){
			this.edad = edad;
		}else {
			this.edad = 0;
		}
	}

	
	
	
	
	
}
