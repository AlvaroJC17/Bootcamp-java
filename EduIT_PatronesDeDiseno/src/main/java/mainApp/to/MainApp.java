package mainApp.to;

import java.sql.SQLException;
import java.util.Scanner;
import dbMetodos.dao.DatabaseController;
import productos.vo.Productos;

public class MainApp {

	public static void main(String[] args) {
		
		// instancia de databasecontroller para poder invocar los metodos
		DatabaseController dataBase = new DatabaseController();
		
		// 
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Boolean salirDelPrograma = true;
		int opcion = 0;
	do {
		
		
		try {
			System.out.println("\n*** ELIJA UNA OPCION DEL MENU ***");
			System.out.println();
			System.out.println("1. Agregar producto" + "\n" + "2. Modificar Producto" + "\n"
					+ "3. Eliminar Producto" + "\n" + "4. Listar Productos" +"\n" + "5. Salir del Programa");
				opcion = sc.nextInt();
				if (opcion >= 1 && opcion <= 5) {
					salirDelPrograma = false;
				}else {
					System.err.println("Solo se permiten numeros del 1 al 4");
					salirDelPrograma = true;
				}
		} catch (Exception e) {
			System.err.println("Solo se permiten numeros de 1 al 4");
			
		}
		
		sc.nextLine();
	
	
	
	switch (opcion) {
	case 1:
		sc.nextLine();
		System.out.println("Ingrese nombre del producto: ");
		String nombre = sc.nextLine();
		System.out.println("Ingrese codigo del producto: ");
		int codigo = sc.nextInt();
		System.out.println("Ingrese precio del producto: ");
		double precio = sc.nextDouble();
		Productos p = new Productos(nombre, codigo, precio);
		dataBase.AgregarProductos(p);
		salirDelPrograma = DatabaseController.volverMenu();
		break;
		
	case 2:
		System.out.println("Ingrese codigo del producto a modificar:");
		codigo = sc.nextInt();
		sc.nextLine();
		System.out.println("Ingrese nuevo nombre del producto:");
		nombre = sc.nextLine();
		System.out.println("Ingrese nuevo precio del producto");
		precio = sc.nextDouble();
		
		dataBase.modificarProducto(codigo, nombre, precio);
		salirDelPrograma = DatabaseController.volverMenu();
		break;
		
	case 3:
		System.out.println("Ingrese codigo del producto a remover:");
		codigo = sc.nextInt();
		dataBase.removerProducto(codigo);
		salirDelPrograma = DatabaseController.volverMenu();
	break;
	
	case 4:
		try {
			dataBase.listarProductos();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		salirDelPrograma = DatabaseController.volverMenu();
		break;
	case 5:
		System.out.println("ADIOS!!!");
		salirDelPrograma = DatabaseController.volverMenu();
		break;
		
	default:
	
		break;
	}
	} while (salirDelPrograma);
	}
}
	


	
	

