package ejercicioPersona;

abstract public class Persona {

	protected String nombre;

	protected Integer edad;

	protected Integer dni;
	
	//constructor
	public Persona(String nombre, Integer edad, Integer dni) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
	}

	//polimorfismo
	public Persona() {

	}


	public void setNombre(String nombre) {

	this.nombre = nombre;

	}

	public String getNombre() {

	return nombre;

	}

	public Integer getDNI() {

	return dni;

	}

	public void setDNI(Integer dni) {

	this.dni = dni;

	}	
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public int getEdad() {
		return this.edad;
	}
	public boolean esMayorDeEdad(){
		edad = this.getEdad();
		boolean esMayor = false;
		if(edad >=18) {
			esMayor = true;
		}else {
			esMayor = false;
		}
		return esMayor;
	}
	
	
	public String mostrar() {
		return "Nombre: " + this.getNombre() + "\n" + "DNI: " + this.getDNI() + "\n" + "Edad: " +  this.getEdad() 
		+ "\n" + "Es mayor de edad: " + esMayorDeEdad();
	}
		
	
	public String toString() {
	return "Nombre: " + this.getNombre() + "\n" + "DNI: " + this.getDNI() + "/n" + this.edad;
}


	

	
}

	

