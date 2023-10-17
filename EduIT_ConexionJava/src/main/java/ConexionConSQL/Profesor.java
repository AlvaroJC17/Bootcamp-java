package ConexionConSQL;

public class Profesor extends Persona {

	private int sueldo;
	
	
	// constructores
	public Profesor() {
		
	}
	
	public Profesor(int dni, String nombre, String apellido, String email, String curso, int sueldo) {
		super(dni, nombre, apellido, email, curso);
		this.sueldo = sueldo;
	}

	//setters y getters
	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	//toString
	@Override
	public String toString() {
		return "Profesor" +  super.toString() + " sueldo=" + sueldo + "]" ;
	}
	
	
	
	
	
	
		
	
	
	
}
