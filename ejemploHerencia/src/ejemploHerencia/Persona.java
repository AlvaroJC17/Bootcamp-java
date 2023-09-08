//Superclase
package ejemploHerencia;

abstract public class Persona {
	
	//atributos

	private String nombres;
	private String apellidos;
	private String tipo;
	private int documento;
	
	//metodos
	//constructor
	public Persona() {
		
	}
	
	public Persona (String nombres, String apellidos, String tipo, int documento) {
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.tipo = tipo;
		this.documento = documento;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getDocumento() {
		return documento;
	}

	public void setDocumento(int documento) {
		this.documento = documento;
	}
	
	public String toString() {
		return "";
	}
	
	//metodo o funcion
	
	public void Saludar() {
		System.out.println("Holaaaa " + this.nombres);
	}
}
