package dbMetodos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import dbConnection.ds.DataBaseConnection;
import productos.vo.Productos;

public class DatabaseController implements Iproductos {

	static Connection c;
	static Connection conexion;	
	static PreparedStatement stmt; 
	static Statement stmt2;
	static String ScripSQL;
	
	public void AgregarProductos(Productos p) {
		try {
			conexion = DataBaseConnection.Conectar();
			ScripSQL = "insert into productos (nombre, codigo, precio) values (?,?,?)";
			stmt = conexion.prepareStatement(ScripSQL);
			stmt.setString(1, p.getNombre());
			stmt.setInt(2, p.getCodigo());
			stmt.setDouble(3, p.getPrecio());
			stmt.execute();
			System.out.println("Producto cargado correctamente..");
			conexion.close();
			stmt.close();
		} catch (Exception e) {
			System.err.println("Error al conectar a la base de datos...");
			e.printStackTrace();
		}finally {
			try {
				stmt.close();
				conexion.close();
			} catch (SQLException e) {
				System.err.println("Falla al desconectar de la base de datos");
				e.printStackTrace();
			}
		}
		
	}

	public  void removerProducto(int codigo) {
		
		try {
			conexion = DataBaseConnection.Conectar();
			ScripSQL = "delete from productos where codigo = ?"; 				
			stmt = conexion.prepareStatement(ScripSQL);
			stmt.setInt(1, codigo);
			stmt.execute();
			System.out.println("Producto borrado correctamente..");
			conexion.close();
			stmt.close();
		} catch (Exception e) {
			System.err.println("Error al conectar a la base de datos...");
			e.printStackTrace();
		}finally {
			try {
				stmt.close();
				conexion.close();
			} catch (SQLException e) {
				System.err.println("Falla al desconectar de la base de datos");
				e.printStackTrace();
			}
		}
		
	}

	public void modificarProducto(int codigo, String nombre, double precio) {
		try {
			conexion = DataBaseConnection.Conectar();
			ScripSQL = "update productos set nombre = ?, precio = ? where codigo = ?"; 
			stmt = conexion.prepareStatement(ScripSQL);
			stmt.setString(1, nombre);
			stmt.setDouble(2, precio);
			stmt.setInt(3, codigo);
			stmt.execute();
			System.out.println("Producto modificado correctamente..");
			conexion.close();
			stmt.close();
		} catch (Exception e) {
			System.err.println("Error al conectar a la base de datos...");
			e.printStackTrace();
		}finally {
			try {
				stmt.close();
				conexion.close();
			} catch (SQLException e) {
				System.err.println("Falla al desconectar de la base de datos");
				e.printStackTrace();
			}
		}
		
		
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
		
		public  void listarProductos() throws SQLException {
			conexion = DataBaseConnection.Conectar();
			ScripSQL = "select * from productos"; 
			stmt2 = conexion.createStatement();
			ResultSet datos = stmt2.executeQuery(ScripSQL);
			while(datos.next()) {
			String nombre = datos.getString("nombre");
			double precio = datos.getDouble("precio");
			int codigo = datos.getInt("codigo");
			System.out.println("Nombre: " + nombre + " Precio: " + precio + " Codigo: " + codigo);
				
			}
		}

}
