package ConexionConSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionSQL {

	// atributos estaticos para usar dentro de los metodos
	static Connection c;
	static Connection conexion;	
	static Statement stmt; 
	static String ScripSQL1;
	static String ScripSQL2;
	
	// Metodo para conectar a la base de datos
	public static Connection Conectar() {
		
		try {
			 c = DriverManager.getConnection("jdbc:mysql://localhost/ConexionJava", "root", "17911977");
			System.out.println("Conectado a la base de datos...");
		} catch (Exception e) {
			System.out.println("No conectado a la base de datos...");
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
		return c;
	}
	
	// metodo para agregar un profesor a las base de datos
	public static void AgregarProfesor(Profesor p) {
		try { // cuando se vaya a hacer una conexion o desconexion a la base de datos se tiene que colocar si o si dentro de un try / catch
			conexion = ConexionSQL.Conectar(); // primero llamamos el metodo conectar para hacer la conexion a la base de datos
			ScripSQL1 = "insert into profesor (dni_profesor, nombre, apellido, email, curso, sueldo)" + " values("+p.getDni()+  // aca creamos el script o querry que vamos a enviar al sql
					"," +'"'+p.getNombre()+ '"' + "," + '"'+p.getApellido()+'"' + "," + '"'+p.getEmail()+'"' 
					+ "," + '"'+p.getCurso()+'"' + "," + '"'+p.getSueldo()+'"' +");";
			
			stmt = conexion.createStatement(); // si o si tenemos que invocar el statement de la conexion que hicimos en la primera linea
			stmt.execute(ScripSQL1); // luego de hacer el statement podemos invocar el motodo execute para ejecutar el script o querry
			System.out.println("Profesor cargado correctamente..");
			conexion.close(); // cerramos la conexion a la base de datos mediante el metodo close
		} catch (Exception e) {
			System.err.println("Error al conectar a la base de datos..."); // si hay algun error en la conexion o el script mostramos el mensaje de error
			e.printStackTrace();
		}finally { // usamos el finally para siempre cerrar la conexion a la base de datos aunque hay o no errores previamente en el codigo
			try {// se vuelve a usar un try / catch porque se va a hacer un cierre de conexion y puede ser un punto de falla
				conexion.close(); // cerramos la conexion
			} catch (SQLException e) {
				System.err.println("Falla al desconectar de la base de datos"); // si hay algin error al cerrar la conexion, va a mostrar este mensaje
				e.printStackTrace();
			}
		}
	}
	// meotodo para agregar a un alumno a la base de datos
	public static void AgregarAlumno(Alumno a) {
		try {
			conexion = ConexionSQL.Conectar();
			ScripSQL1 = "insert into alumno (dni_alumno, nombre, apellido, email, curso, calificacion)" + " values("+a.getDni()+
					"," +'"'+a.getNombre()+ '"' + "," + '"'+a.getApellido()+'"' + "," + '"'+a.getEmail()+'"' 
					+ "," + '"'+a.getCurso()+'"' + "," + '"'+a.getCalificacion()+'"' +");";
			
			stmt = conexion.createStatement();
			stmt.execute(ScripSQL1);
			System.out.println("Alumno cargado correctamente..");
			conexion.close();
		} catch (Exception e) {
			System.err.println("Error al conectar a la base de datos...");
			e.printStackTrace();
		}finally {
			try {
				conexion.close();
			} catch (SQLException e) {
				System.err.println("Falla al desconectar de la base de datos");
				e.printStackTrace();
			}
		}
	}
	
	// metodo para actualizar los datos de un profesor en la base de datos
	public static void ActualizarProfesor(Profesor p, int idProfesor) {
		
		try {
			conexion = ConexionSQL.Conectar();
			ScripSQL1 = "UPDATE profesor SET dni_profesor = " + p.getDni() + "," +"nombre=" + "'"+p.getNombre()+"'" + "," +"apellido="+"'"+p.getApellido()+"'" 
					+ "," +"email=" + "'"+p.getEmail()+"'" + "," +"curso=" +"'"+p.getCurso()+"'" + "," +"sueldo= "+p.getSueldo() + " WHERE id_profesor ="+ idProfesor + ";";
			stmt = conexion.createStatement();
			stmt.execute(ScripSQL1);
			System.out.println("Profesor actualizado correctamente..");
			conexion.close();
		} catch (Exception e) {
			System.err.println("Error al conectar a la base de datos...");
			e.printStackTrace();
		}finally {
			try {
				conexion.close();
			} catch (SQLException e) {
				System.err.println("Falla al desconectar de la base de datos");
				e.printStackTrace();
			}
		}
		
		
	}
	//metodo para actualizar los datos de un alumno en la base de datos
	public static void ActualizarAlumno(Alumno a, int idAlumno) {
		
		try {
			conexion = ConexionSQL.Conectar();
			ScripSQL1 = "UPDATE alumno SET dni_alumno = " + a.getDni() + "," +"nombre=" + "'"+a.getNombre()+"'" + "," +"apellido="+"'"+a.getApellido()+"'" 
					+ "," +"email=" + "'"+a.getEmail()+"'" + "," +"curso=" +"'"+a.getCurso()+"'" + "," + "calificacion= " +a.getCalificacion() + " WHERE id_alumno ="+ idAlumno + ";";
			stmt = conexion.createStatement();
			stmt.execute(ScripSQL1);
			System.out.println("Alumno actualizado correctamente..");
			conexion.close();
		} catch (Exception e) {
			System.err.println("Error al conectar a la base de datos...");
			e.printStackTrace();
		}finally {
			try {
				conexion.close();
			} catch (SQLException e) {
				System.err.println("Falla al desconectar de la base de datos");
				e.printStackTrace();
			}
		}
		
		
	}		
	// metodo para borrar a un profesor o a un alumno mediante su dni en la base de datos
	public static void RemoverUsuario(int dni) {
		
		try {
			conexion = ConexionSQL.Conectar();
			ScripSQL1 = "DELETE FROM profesor WHERE dni_profesor = " + dni; // creo un script para cada tabla de la base de datos, en donde coincida el numero de dni lo va a borrar de esa tabla
			ScripSQL2 = "DELETE FROM alumno WHERE dni_alumno = " + dni;
			stmt = conexion.createStatement();
			stmt.execute(ScripSQL1); // se manda a ejecutar los dos script
			stmt.execute(ScripSQL2);
			System.out.println("Usuario borrado correctamente..");
			conexion.close();
		} catch (Exception e) {
			System.err.println("Error al conectar a la base de datos...");
			e.printStackTrace();
		}finally {
			try {
				conexion.close();
			} catch (SQLException e) {
				System.err.println("Falla al desconectar de la base de datos");
				e.printStackTrace();
			}
		}
	}
	
	//NOTA: SE USAN VARIOS METODOS PARA AGREGAR Y ACTUALIZAR LOS DATOS PORQUE SON DE OBJETOS DIFERENTES, AL ESTOS TENER ATRIBUTOS DIFERENTES TODAVIA NO SE COMO HACER 1 SOLO METODO QUE FUNCIONE PARA 
	// AMBOS OBJETOS AL MISMO TIEMPO (OSEA DE PUEDA USAR UN OBJETO PROFESOR Y DEPUES SI QUIERO USAR EL MISMO METODO CON UN OBJETO ALUMNO, PERO NO AMBOS AL MISMO TIEMPO)
		
	}

		
		
		
