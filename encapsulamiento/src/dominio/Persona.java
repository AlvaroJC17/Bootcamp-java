package dominio;

public class Persona { // clase Persona

	private String nombre; // atributo, al colocar private, se crea una atributo que solo puede ser llamado y modificado por el metodo get y set
	private double sueldo; // atributo
	private boolean eliminado; // atributo

	public Persona (String nombre, double sueldo, boolean eliminado) { // constructor de la clase
		
		this.nombre = nombre; // se pone this antes del = por que hace referencia al atributo de la clase y se coloca nombre despues del = por que es el nombre del argumento del constructor, osea no tiene que ver nada una variable con la otra
		this.sueldo = sueldo; // igual que el this anterior
		this.eliminado = eliminado; // igual que el this anterior
		
	}

	public String getNombre() { // metodo get, sirve para ver el valor del atributo,  aunque el nombre del atributo esta en minuscula, al anteponer la palabra get se tiene que colocar la segunda palabra con la primera letra en mayuscula, debido al camel case
		
		return this.nombre; // this hace referencia al atributo nombre de la clase, devuelve un valor por lo que tiene que llevar un return.
	}
	
	public void setNombre(String nombre) { // metodo get, no retorna nada, por lo que se crea con void y sirve para modificar el atributo
		
		this.nombre = nombre; // hace referencia al atributo nombre de la clase
	}
	
	public double getSueldo() { // igual que el get anterior, solo que la variable es de tipo double
		
		return this.sueldo; // igual al anterior, solo que devuelve un double
	}
	
	public void setSueldo(double sueldo) { // igual que el set anterior
		
		this.sueldo = sueldo; // igual que anterior
	}
	
	public boolean isEliminado() { // es un get, pero al ser para una variable boolean se cambia la palabra get por is, y el resto es igual a los anteriores get
		
		return this.eliminado; // hace referencia al atributo eliminado de la clase, devuelve un valor booleano
	}
	
	public void setEliminado(boolean eliminado) { // el set es igual que los anteriores y tampovo devuelve valores
		
		this.eliminado = eliminado;
	}
	
	public String toString() { // toString, sirve para visualizar el valor de todos los atributos del objeto de manera mas facil
		return "Persona [nombre:" + this.nombre + ", Sueldo: " + this.sueldo + ", eliminado: " + this.eliminado + "]";
	}
	

}
