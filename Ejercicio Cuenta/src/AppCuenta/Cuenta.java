package AppCuenta;

public class Cuenta {

	private String titular;
	private double cantidad;
	
	public Cuenta() {} // constructor por defecto
	
	public Cuenta(String titular, int cantidad) throws Exception { // constructor con parametros y execpciones
		this.titular = titular;
		this.cantidad = cantidad;
		
		if (titular.equals("")) {
			throw new Exception("Usuario es obligatorio");
		}
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public String getTitular() {
		return titular;
	}
	
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	
	public double getCantidad() {
		return cantidad;
	}
	

	public double ingresar(double cantidad) { // metodo para devolver o cuando el numero es negativo
		this.cantidad = cantidad;
		
		if (this.getCantidad() < 0) {
			return this.cantidad = 0;
		}else {
			this.cantidad = cantidad;
		}
		return this.getCantidad();
	}
		
	
	public double retirar(double dinero) { // metodo para calcular la resta y devolver cero si el saldo es negativo
		double total = this.cantidad - dinero;
		
		if (total < 0) {
			this.setCantidad(0);
		}else {
			this.setCantidad(total);
		}
		return this.getCantidad();
	}
		
	@Override // metodo toString para devolver el formato de texto de los objetos
	public String toString() {
		return "El saldo en la cuenta de " + this.getTitular() + " es de: " + this.getCantidad();
	}
}
		
	
	
		
