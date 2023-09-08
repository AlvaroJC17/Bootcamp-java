// Subclase

package ejemploHerencia;

public class Cliente extends Persona {
	//Atributos
	private String categoria;
	private int codigo;
	
	//constructor
	
	Cliente(){
		
	}
	
	Cliente(String categoria, int codigo,String nombres, String apellidos, String tipo, int documento){
		super(nombres, apellidos, tipo, documento); // el comando super invoca los atributos de la clase padre para poder usarlo dentro de esta clase
		this.categoria = categoria;
		this.codigo = codigo;
	}
	
	
	//metodos

	@Override
	public String toString() { //metodo toString usando Super
		return "Cliente [categoria=" + categoria + ", codigo=" + codigo + ", getNombres()=" + getNombres()
				+ ", getApellidos()=" + getApellidos() + ", getTipo()=" + getTipo() + ", getDocumento()="
				+ getDocumento() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
	public void Saludar() {
		super.Saludar();
		System.out.println("Hola soy cliente " + this.getNombres());
	}
	
	
	
	
}
