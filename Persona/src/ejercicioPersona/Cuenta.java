package ejercicioPersona;

abstract public class Cuenta {

	protected Persona titular; //variable tipo persona
	protected double cantidad;
	
	public Cuenta() {
		
	}
	
	public Cuenta(Persona titular, double cantidad) {
		this.titular = titular;
		this.cantidad = cantidad;
	}
	
	public void setTitular(Persona titular) {
		this.titular = titular;
	}
	
	public Persona getTitular() {
		return titular;
	}
	
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	
	public double getCantidad() {
		return cantidad;
	}

	@Override
	public String toString() {
		return "Cuenta" + "\n" + titular.mostrar() /*este es el mostrar de la clase persona*/ 
		+ "\n" + "cantidad=" + cantidad;
	}
	
	//Nota: la variable titular al ser de tipo persona, puedo invocar el metodo mostrar de la clase
	//persona
	
}
