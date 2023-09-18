package superMercado;

//Superclase
abstract public class Producto {

	// Atributos
	private double precio;
	private String nombre;

	// Constructores
	Producto() {

	}

	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	// Setters y getters
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// Metodos
	@Override
	public String toString() {
		return "Nombre: " + nombre + ", " + "Precio = " + precio + ", ";
	}

}
