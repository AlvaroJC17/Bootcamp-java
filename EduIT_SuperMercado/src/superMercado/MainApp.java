package superMercado;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MainApp {
	


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int eleccion = 0;
		boolean salirMenuPrincipal = false;
		Carrito carrito = new Carrito(); // Creamos el objeto carrito

		// creamos los productos del almacen
		ProductoDeAlmacen Leche = new ProductoDeAlmacen("Leche", 200, 1);
		ProductoDeAlmacen Azucar = new ProductoDeAlmacen("Azucar", 20, 2);
		ProductoDeAlmacen Pan = new ProductoDeAlmacen("Pan", 17, 3);
		ProductoDeAlmacen Sal = new ProductoDeAlmacen("Sal", 7, 4);
		ProductoDeAlmacen Pollo = new ProductoDeAlmacen("Pollo", 250, 5);
		ProductoDeAlmacen Pescado = new ProductoDeAlmacen("Pescado", 150, 6);

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
				System.out.println("\n*** ELIJA UNA OPCION DEL MENU ***");
				System.out.println();
				System.out.println("1. Productos disponibles" + "\n" + "2. Agregar productos al carrito" + "\n"
						+ "3. Ver contenido del carrito" + "\n" + "4. Cantidad de productos" + "\n"
						+ "5. Importe total " + "\n" + "6. Salir");
				eleccion = 0;
				eleccion = sc.nextInt();

				if (eleccion > 0 && eleccion <= 6) {
					salirMenuPrincipal = false;
				} else {
					System.err.println("Solo se permiten numeros del 1 al 6"); // mensaje de error cuando se coloca un numero fuera de del rango entre 1 y 2
					salirMenuPrincipal = true;
				}
			} catch (Exception e) {
				salirMenuPrincipal = true;
				System.err.println("Solo se permiten numeros del 1 al 6"); // mensaje de error cuando se crean la excepcion al ingresar una letra
			} 
			sc.nextLine(); // limpiamos el buffer del scanner

			switch (eleccion) {
			case 1: // Opcion 1 es para ver los productos disponibles en el supermercado
				// Se usa el for each para mostrar los productos en la lista de
				// productosDisponibles
				for (ProductoDeAlmacen pro : productosDisponibles) {
					System.out.println("Producto: " + pro.getNombre() + " / " + "Precio: " + pro.getPrecio() + "$" + " / " + "Codigo: " + pro.getCodigo());
				}
				System.out.println();
				salirMenuPrincipal = volverMenu(); // metodo estatico para volver al menu principal
				break;

			case 2:
				
				boolean salirCase2;
				do {
					salirCase2 = false;
					boolean comprobarDisponibilidad = false; // variable para comprobar si el producto esta disponible o no
					int opcion2 = 0; // variable para capturar la desicion del usuario si compra otro producto o vuelve al menu
					System.out.println();
					System.out.println("Productos disponibles para comprar:");
					for (ProductoDeAlmacen pro : productosDisponibles) { // primero mostramos la lista de productos para
																			// facilitar la compra del usuario
						System.out.println(pro.getNombre() + " " + pro.getPrecio() + "$");
					}

					System.out.println();
					System.out.print("Ingrese nombre del producto a comprar: ");
					String nombre = sc.nextLine(); // capturamos el nombre del producto que el usuario quiere agregar al carrito

					// se usa el iterador para recorrer la lista de productosDisponibles y hacer la comparacion
					Iterator<ProductoDeAlmacen> it = productosDisponibles.iterator();
					while (it.hasNext()) {
						ProductoDeAlmacen productos = it.next();
						if (productos.getNombre().equalsIgnoreCase(nombre)) { // se compara el nombre producto ingresado con los productos disponibles, sin son iguales se agregar al carrito
							carrito.agregarProducto(productos); // uso del metodo agregar
							System.out.println("Producto agregado al carrito correctamente...");
							comprobarDisponibilidad = true;
						}
					}
					
					if (!comprobarDisponibilidad) { // si el nombre del producto no existe, entonces entra en este if y muestra el siguiente mensaje
						System.err.println("Producto no dispoble..");
					}
					System.out.println();
						
					boolean salirSubMenu = false; // variable para salir del bucle del submenu
					do {
					try { // capturamos las excepciones y mostramos un mensaje de error 
						System.out.println("1. Agregar otro producto");
						System.out.println("2. Volver al menu");
						opcion2 = sc.nextInt();

						if (opcion2 == 1) {
							salirSubMenu = false;
							salirCase2 = true;
						} else if (opcion2 == 2) {
							salirSubMenu = false;
							salirMenuPrincipal = true;
						} else {
							throw new Exception(); //creamos una excepcion si el usuario no ingreso 1 o 2
						}
					} catch (Exception e) {
						salirMenuPrincipal = true;
						salirSubMenu = true;
						System.err.println("Solo se permiten numeros entre 1 y 2");
					}
					sc.nextLine(); //borramos el buffer del scanner
					
					} while (salirSubMenu);
				} while (salirCase2);
				break;

			case 3:
				
				boolean salirCase3;
				do {
					
					if (carrito.carritoVacio()) { // Uso del metodo para ver si el carrito esta vacio
						System.out.println("Contenido del Carrito:" + "\n" + "El carrito esta vacio...");
						
					}else {
						System.out.println("Contenido del Carrito:");
						carrito.contenidoCarrito(); // metodo para ver el contenido del carrito
					}

					int opcion3 = 0;
					salirCase3 = false;
					boolean salirAlMenu2 = false;
						
					do {
					try { // capturamos excepciones y mostramos mensaje de error
						System.out.println();
						System.out.println("1. Eliminar producto del carrito");
						System.out.println("2. Volver al menu");
						opcion3 = sc.nextInt();
						sc.nextLine();
						
						if (opcion3 == 1) {
							boolean comprobar = false; // variable para comprobar si el producto ingresado esta dentro del carrito
							System.out.println("Ingrese nombre del producto a eliminar:");
							String nombre = "";
							nombre = sc.nextLine(); // pedimos nombre del producto al usuario
							salirCase3 = true;

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
							salirCase3 = false;
							salirMenuPrincipal = true;
						} else {
							throw new Exception(); // creamos una excepcion si el usuario no ingreso 1 o 2
						}
					} catch (Exception f) {
						salirAlMenu2 = false;
						salirCase3 = true;
						System.err.println("Solo se permiten numeros entre 1 y 2");
						sc.nextLine();
					}
					} while (salirAlMenu2);
				} while (salirCase3);
				break;
						
			case 4:
				// uso del metodo para ver la cantidad de prodcutos
				System.out.println("Actualmente posee " + carrito.verCantidad() + " productos en el carrito...");
				System.out.println();
				salirMenuPrincipal = volverMenu(); // metodo estatico para volver al menu principal
				break;

			case 5:
				// uso del motodo para ver el importe total
				System.out.println("El total del importe incluyendo el IVA es de: " + carrito.importeTotal());
				System.out.println();
				salirMenuPrincipal = volverMenu(); // metodo estatico para volver al menu principal
				break;

			case 6:
				System.out.println("Gracias por comprar con nosotros....");
				salirMenuPrincipal = false;
				break;

			default:
				break;
			}

		} while (salirMenuPrincipal);
		sc.close();
	}

	// Metodo statico para volver al menu principal
	public static boolean volverMenu() {
		Scanner sc = new Scanner(System.in);
		boolean salir = false;
		System.out.println("Presione Enter o cualquier tecla para volver al menu....");
		String entrada = sc.nextLine();

		if (entrada != null) {
			salir = true;
		}
		return salir;
	}
}
