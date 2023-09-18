package superMercado;
//Clase
import java.util.ArrayList;
import java.util.Iterator;

public class Carrito {

	//Constructor
	public Carrito() {

	}

	ArrayList<ProductoDeAlmacen> productosCarrito = new ArrayList<>();

	//Metodos
	public void agregarProducto(ProductoDeAlmacen pr) {
		productosCarrito.add(pr);
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
			System.out.println(ca.getNombre());
		}
	}

}
