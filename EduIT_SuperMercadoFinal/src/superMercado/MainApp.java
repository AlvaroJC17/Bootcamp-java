package superMercado;

import java.util.ArrayList;
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
				System.out.println("\n1. Productos disponibles" + "\n" + "2. Agregar productos al carrito" + "\n"
						+ "3. Ver contenido del carrito" + "\n" + "4. Cantidad de productos" + "\n"
						+ "5. Importe total " + "\n" + "6. Salir");
				
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
			case 1: 
				Carrito.productosDisponibles(productosDisponibles); // metodo para ver el contenido de la lista productos disponibles
				salirMenuPrincipal = Carrito.volverMenu(); // metodo estatico para volver al menu principal
				break;
				
			case 2:	
				boolean salirCase2;
				do {
					salirCase2 = false;
					boolean comprobarDisponibilidad = false; // variable para comprobar si el producto esta disponible o no
					int opcion2 = 0; // variable para capturar la desicion del usuario si compra otro producto o vuelve al menu
					
					System.out.println("***PRODUCTOS DISPONIBLES PARA COMPRAR***");
					Carrito.productosDisponibles(productosDisponibles); // Primero mostramos los productos disponibles para que sea mas facil comprar
					System.out.print("Ingrese nombre del producto a comprar: ");
					String nombre = sc.nextLine(); // capturamos el nombre del producto que el usuario quiere agregar al carrito
					comprobarDisponibilidad = Carrito.agregarProducto(nombre, productosDisponibles); // metodo para agregar un producto al carrito y devolver ComprobarDisponibilidad = true;
					
					if (!comprobarDisponibilidad) { // si el nombre del producto no existe, entonces entra en este if y muestra el siguiente mensaje
						System.err.println("Producto no disponible..");
					}
					
					boolean salirSubMenu = false; // variable para salir del bucle del submenu
					do {
					try { // capturamos las excepciones y mostramos un mensaje de error 
						System.out.println("\n1. Agregar otro producto");
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
				boolean salirCase3 = false;
				do {
					if (carrito.carritoVacio()) { // Uso del metodo para ver si el carrito esta vacio
						System.out.println("Contenido del Carrito:" + "\n" + "El carrito esta vacio...");
						}else {
						System.out.println("Contenido del Carrito:");
						carrito.contenidoCarrito(); // metodo para ver el contenido del carrito
					}

					int opcion3 = 0;
					boolean salirAlMenu2 = false;	
					do {
					try { // capturamos excepciones y mostramos mensaje de error
						System.out.println("\n1. Eliminar producto del carrito");
						System.out.println("2. Volver al menu");
						opcion3 = sc.nextInt();
						sc.nextLine();
						
						if (opcion3 == 1) {
							boolean comprobar = false; // variable para comprobar si el producto ingresado esta dentro del carrito
							System.out.println("Ingrese nombre del producto a eliminar:");
							String nombre = sc.nextLine(); // pedimos nombre del producto al usuario
							salirCase3 = true;
							comprobar = Carrito.removerProducto(nombre); // metodo para borrar un producto y devolver el valor de comprobar = true;
														
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
				// uso del metodo para ver la cantidad de productos
				System.out.println("Actualmente posee " + carrito.verCantidad() + " productos en el carrito...");
				salirMenuPrincipal = Carrito.volverMenu(); 
				break;

			case 5:
				// uso del motodo para ver el importe total
				System.out.println("El total del importe incluyendo el IVA es de: " + carrito.importeTotal());
				salirMenuPrincipal = Carrito.volverMenu();
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
}
		
		

	
	
