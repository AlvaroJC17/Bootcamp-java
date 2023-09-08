package dominio;

public class Persona {

	private int idPersona;
	private String nombre;
	private static int contadorPersona;
	
	public Persona(String nombre) {
		
		this.nombre = nombre;
		Persona.contadorPersona++;
		this.idPersona = Persona.contadorPersona++;
	}

	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static int getContadorPersona() {
		return contadorPersona;
	}

	public static void setContadorPersona(int contadorPersona) {
		Persona.contadorPersona = contadorPersona;
	}

	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", nombre=" + nombre + "]";
	}
	
	
		
		
	
	
}
