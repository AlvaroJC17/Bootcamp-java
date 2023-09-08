package ejemploHerencia;

public class Empleado extends Persona {

	private String tipoContrato;
	private int sueldos;
	private Telefono telefono; // al haber creado la clase Telefono ya podemos crear objetos telefonos en cualquier clase
	
	Empleado(String nombres, String apellidos, String tipo, int documento, String tipoContrato, int sueldos){
		super(nombres, apellidos, tipo, documento);
		this.tipoContrato = tipoContrato;
		this.sueldos = sueldos;
	}
	
	
	Empleado(String nombres, String apellidos, String tipo, int documento){
		super(nombres, apellidos, tipo, documento);
	}
	
	Empleado(String nombres, String apellidos, String tipo, int documento, String tipoContrato, int sueldos, Telefono telefono){
		super(nombres, apellidos, tipo, documento);
		this.tipoContrato = tipoContrato;
		this.sueldos = sueldos;
		this.telefono = telefono;
	}
	
	Empleado(){
		
	}
	
	public double calcularSueldo(int dias) {
		double total = this.sueldos / dias;
		return total;
	}
}
