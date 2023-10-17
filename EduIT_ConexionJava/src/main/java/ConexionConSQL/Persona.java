package ConexionConSQL;

public class Persona {

	private int dni;
	private String nombre;
	private String apellido;
	private String email;
	private String curso;
	
	// Constructores
	public Persona() {
		
	}
	
	public Persona(int dni, String nombre, String apellido, String email, String curso) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.curso = curso;
	}

	
	//setter y getters
	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	//	//metodo toString
	@Override
	public String toString() {
		return "[dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", curso="
				+ curso;
	}
	

	
	
	
	
	
	
	
	
}
