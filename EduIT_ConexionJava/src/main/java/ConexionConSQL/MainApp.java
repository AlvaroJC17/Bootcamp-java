package ConexionConSQL;

public class MainApp {

	public static void main(String[] args) {
		
		
		
		ConexionSQL.Conectar(); // a modo de prueba validamos la conexion a la base de datos
		
		
		Profesor p1 = new Profesor(95969342, "Nani", "Benitez", "nani@gamail.com", "Castellano", 30000);
		ConexionSQL.AgregarProfesor(p1); // agregamos al profesor p1
		
		Profesor p2 = new Profesor(95822499, "Alvaro", "Cortesia", "alvarocortesia@gmail.com", "Java", 50000);
		ConexionSQL.AgregarProfesor(p2); // agregamos al profesor p2
		
		Profesor p3 = new Profesor(987654321, "JUAN", "PEREZ", "perez@gmail.com", "fisica", 90000);
		ConexionSQL.ActualizarProfesor(p3, 4); // al pasar un profesor p3 y un id_profesor(4), actualizamos los datos al cual pertenece ese id por los datos del profesor p3, el id lo vi en la tabla sql
		
		Alumno a1 = new Alumno(95524602, "Santi", "Cortesia", "santi@gmail.com", "Ingles", 10);
		ConexionSQL.AgregarAlumno(a1); // agregamos al alumno a1
		
		Alumno a2 = new Alumno(12345678, "Pedro", "Perez", "perez@gmail.com", "matematicas", 5);
		ConexionSQL.AgregarAlumno(a2); // agregamos al alumno a2
		
		Alumno a3 = new Alumno (74196385, "Lord", "Aizen", "lord@gmail.com", "quimica", 20);
		ConexionSQL.ActualizarAlumno(a3, 5); // actualizamos al alumno con el id 5 por los datos del alumno a3
		
		ConexionSQL.RemoverUsuario(7196385); // eliminamos al usuario con el dni 7196385
	}

}
