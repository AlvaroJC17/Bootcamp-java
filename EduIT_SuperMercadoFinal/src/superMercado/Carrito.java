package superMercado;
//Clase
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Carrito {

	//Constructor
	public Carrito() {

	}

	static ArrayList<ProductoDeAlmacen> productosCarrito = new ArrayList<>();

	//Metodos
	
	// se usa el iterador para recorrer la lista de productosDisponibles y hacer la comparacion
	public static boolean agregarProducto(String nombre, ArrayList <ProductoDeAlmacen> productosDisponibles ) {
		boolean comprobarDisponibilidad = false;
		Iterator<ProductoDeAlmacen> it = productosDisponibles.iterator();
		while (it.hasNext()) {
			ProductoDeAlmacen productos = it.next();
			if (productos.getNombre().equalsIgnoreCase(nombre)) { // se compara el nombre producto ingresado con los productos disponibles, sin son iguales se agregar al carrito
				productosCarrito.add(productos); // uso del metodo agregar
				System.out.println("Producto agregado al carrito correctamente...");
				comprobarDisponibilidad = true;
			}
		}
		return comprobarDisponibilidad;
	}
	
	// Metodo para borra el producto del carrito
	public static boolean removerProducto(String nombre) {
		// se usa el iterador para recorrer la lista de productosDisponibles
		boolean comprobar = false;
		Iterator<ProductoDeAlmacen> it = productosCarrito.iterator();
		while (it.hasNext()) {
			ProductoDeAlmacen borraProductos = it.next();
			if (borraProductos.getNombre().equalsIgnoreCase(nombre)) { // se compara el nombre de producto ingresado con los productos agregados al carrito
				it.remove(); // Si el nombre ingresado es igual a uno del carrito, entonces borra ese prodcuto
				System.err.println("Producto borrado correctamente...");
				comprobar = true;
			}

		}
		return comprobar;
	}

	public String verCantidad() {
		int cantidad = productosCarrito.size();
		String valorCantidad = Integer.toString(cantidad);
		return valorCantidad;
	}

	public double importeTotal() {
		double total = 0;
		Iterator<ProductoDeAlmacen> it = productosCarrito.iterator();
		while (it.hasNext()) {
			ProductoDeAlmacen preciosProductos = it.next();
			if (preciosProductos.getPrecio() > 0) {
				total += preciosProductos.getPrecio() + preciosProductos.cacularIva();
			}
		}
		return total;
	}

	public void contenidoCarrito() {
		for (ProductoDeAlmacen ca : productosCarrito) {
			System.out.println("* " + ca.getNombre());
		}
	}
	
	// Se usa el for each para mostrar los productos en la lista de productosDisponibles
	public static void productosDisponibles(ArrayList <ProductoDeAlmacen> productosDisponibles) {
		for (ProductoDeAlmacen pro : productosDisponibles) {
			System.out.println("Producto: " + pro.getNombre() + " / " + "Precio: " + pro.getPrecio() + "$" + " / " + "Codigo: " + pro.getCodigo());
		}
		System.out.println();
	}

	public boolean carritoVacio() {
		boolean estaVacio = productosCarrito.isEmpty();
		return estaVacio;
		
	}
	
	// Metodo statico para volver al menu principal
	@SuppressWarnings("resource")
	public static boolean volverMenu() {
		Scanner sc = new Scanner(System.in);
		boolean salir = false;
		System.out.println("\nPresione Enter o cualquier tecla para volver al menu....");
		String entrada = sc.nextLine();

		if (entrada != null) {
			salir = true;
		}
		return salir;
	}

}
