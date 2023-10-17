package ConexionConSQL;

public class Alumno extends Persona {

	private double calificacion;
	
	//constructores
	
	public Alumno() {
		
	}
	
	public Alumno(int dni, String nombre, String apellido, String email, String curso, double calificacion) {
		super(dni, nombre, apellido, email, curso);
		this.calificacion = calificacion;
	}

	//setter y getters
	public double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}

	@Override
	public String toString() {
		return "Alumno" + super.toString() + " calificacion=" + calificacion + "]" ;
	}
	
	
	
}
