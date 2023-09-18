package superMercado;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int eleccion = 0;
		boolean salir = false;
		Carrito carrito = new Carrito(); // Creamos el objeto carrito

		// creamos los productos del almacen
		ProductoDeAlmacen Leche = new ProductoDeAlmacen("Leche", 200, 1);
		ProductoDeAlmacen Azucar = new ProductoDeAlmacen("Azucar", 20, 2);
		ProductoDeAlmacen Pan = new ProductoDeAlmacen("Pan", 17, 3);
		ProductoDeAlmacen Sal = new ProductoDeAlmacen("Sal", 7, 4);
		ProductoDeAlmacen Pollo = new ProductoDeAlmacen("Pollo", 250, 1);
		ProductoDeAlmacen Pescado = new ProductoDeAlmacen("Pescado", 150, 1);

		// Creamos la lista de los productos disponibles
		ArrayList<ProductoDeAlmacen> productosDisponibles = new ArrayList<>();
		productosDisponibles.add(Leche);
		productosDisponibles.add(Azucar);
		productosDisponibles.add(Pan);
		productosDisponibles.add(Sal);
		productosDisponibles.add(Pollo);
		productosDisponibles.add(Pescado);

		do {
			// se utiliza las excepciones para notificar cuando se elije la opcion
			// incorrecta
			try {
				System.out.println("\n*** Elija una opcion del menu ***");
				System.out.println("1. Productos disponibles" + "\n" + "2. Agregar productos al carrito" + "\n"
						+ "3. Ver contenido del carrito" + "\n" + "4. Cantidad de productos" + "\n"
						+ "5. Importe total " + "\n" + "6. Salir");
				eleccion = 0;
				eleccion = sc.nextInt();

				if (eleccion > 0 && eleccion <= 6) {
					salir = false;
				} else {
					System.err.println("Solo se permiten numeros del 1 al 6");
				}
			} catch (Exception e) {
				System.err.println("Solo se permiten numeros del 1 al 6");
			} finally {
				if (eleccion > 0 && eleccion <= 6) {
					salir = false;
				} else {
					salir = true;
				}
				sc.nextLine(); // limpiamos el buffer del scanner
			}

			switch (eleccion) {
			case 1: //Opcion 1 es para ver los productos disponibles en el supermercado
				// Se usa el for each para mostrar los productos en la lista de
				// productosDisponibles
				for (ProductoDeAlmacen pro : productosDisponibles) {
					System.out.println(pro.getNombre() + " " + pro.getPrecio() + "$");
				}
				System.out.println();
				salir = volverMenu(); // metodo estatico para volver al menu principal
				break;

			case 2: // Opcion 2 es para agreagar productos al carrito
				boolean salir2 = false;
				int opcion2;

				do {
					boolean comprobar = false; // variable para comprobar si el producto esta disponible o no
					opcion2 = 0; // variable para capturar la desicion del usuario si compra otro producto o
									// vuelve al menu
					System.out.println();

					for (ProductoDeAlmacen pro : productosDisponibles) { // primero mostramos la lista de productos para
																			// facilitar la compra del usuario
						System.out.println(pro.getNombre() + " " + pro.getPrecio() + "$");
					}

					System.out.println();
					System.out.print("Ingrese nombre del producto a comprar: ");
					String nombre = "";
					nombre = sc.nextLine(); // capturamos el nombre del producto que el usuario quiere agregar al
											// carrito

					// se usa el iterador para recorrer la lista de productosDisponibles
					Iterator<ProductoDeAlmacen> it = productosDisponibles.iterator();
					while (it.hasNext()) {
						ProductoDeAlmacen productos = it.next();
						if (productos.getNombre().equalsIgnoreCase(nombre)) { // se compara el nombre producto ingresado con los productos disponibles, sin son iguales se agregar al carrito
							carrito.agregarProducto(productos); // uso del metodo agregar
							System.out.println("Producto agregado al carrito correctamente...");
							comprobar = true;
						}
					}
					
					if (!comprobar) { // si el nombre del producto no existe, entonces entra en este if y muestra el siguiente mensaje
						System.err.println("Producto no dispoble..");
					}
					System.out.println();
					try { // capturamos las excepciones y mostramos un mensaje de error 
						System.out.println("1. Agregar otro producto");
						System.out.println("2. Volver al menu");
						opcion2 = sc.nextInt();

						if (opcion2 == 1) {
							salir2 = true;
						} else if (opcion2 == 2) {
							salir2 = false;
						} else {
							throw new Exception(); //creamos una excepcion si el usuario no ingreso 1 o 2
						}
					} catch (Exception e) {
						System.err.println("Solo se permiten numeros entre 1 y 2");
					}

					sc.nextLine(); //limpiamos el buffer del scanner
				} while (salir2);

				salir = volverMenu(); // metodo estatico para volver al menu principal
				break;

			case 3: // Opcion 3 es para ver el contenido del carrito y borrar productos del carrito
				boolean salir3;
				do {
					// metodo para ver el contenido del carrito
					System.out.println("Contenido del Carrito:");
					carrito.contenidoCarrito();
					System.out.println();

					int opcion3 = 0;
					salir3 = false;

					try { // capturamos excepciones y mostramos mensaje de error

						System.out.println("1. Eliminar producto del carrito");
						System.out.println("2. Volver al menu");
						opcion3 = sc.nextInt();
						sc.nextLine();

						if (opcion3 == 1) {
							boolean comprobar = false; // variable para comprobar si el producto ingresado esta dentro del carrito
							System.out.println("Ingrese nombre del producto a eliminar:");
							String nombre = "";
							nombre = sc.nextLine(); // pedimos nombre del producto al usuario
							salir3 = true;

							// se usa el iterador para recorrer la lista de productosDisponibles
							Iterator<ProductoDeAlmacen> it = carrito.productosCarrito.iterator();
							while (it.hasNext()) {
								ProductoDeAlmacen borraProductos = it.next();
								if (borraProductos.getNombre().equalsIgnoreCase(nombre)) { // se compara el nombre de producto ingresado con los productos agregados al carrito
									it.remove(); // Si el nombre ingresado es igual a uno del carrito, entonces borra ese prodcuto
									System.err.println("Producto borrado correctamente...");
									comprobar = true;
								}

							}
							// validacion para mostrar mensaje de error cuando no este disponible el producto dentro del carrito
							if (!comprobar) {
								System.err.println("El producto ingresado no se encuentra dentro del carrito..");
							}
						} else if (opcion3 == 2) {
							salir3 = false;
						} else {
							throw new Exception(); // creamos una excepcion si el usuario no ingreso 1 o 2
						}
					} catch (Exception f) {
						System.err.println("Solo se permiten numeros entre 1 y 2");
					}

				} while (salir3);

				salir = volverMenu(); // metodo estatico para volver al menu principal
				break;

			case 4: // Opcion 4 es para ver la cantidad de productos dentro del carrito
				// uso del metodo para ver la cantidad de prodcutos
				System.out.println("Actualmente posee " + carrito.verCantidad() + " productos en el carrito...");
				System.out.println();
				salir = volverMenu(); // metodo estatico para volver al menu principal
				break;

			case 5: // opcion 5 es para ver el importe total incluyendo el IVA
				// uso del motodo para ver el importe total
				System.out.println("El total del importe incluyendo el IVA es de: " + carrito.importeTotal());
				System.out.println();
				salir = volverMenu(); // metodo estatico para volver al menu principal
				break;

			case 6: // Opcion 6  es para cerrar el programa
				System.out.println("Gracias por comprar con nosotros....");
				salir = false;
				break;

			default:
				break;
			}

		} while (salir);
		sc.close();
	}

	// Metodo statico para volver al menu principal
	public static boolean volverMenu() {
		Scanner sc = new Scanner(System.in);
		boolean salir = false;
		System.out.println("Presione cualquier tecla para volver al menu....");
		String entrada = sc.nextLine();

		if (entrada != null) {
			salir = true;
		}
		return salir;
	}
}
