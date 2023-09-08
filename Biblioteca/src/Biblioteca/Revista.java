package Biblioteca;
//subclase
public class Revista extends Publicacion {
	
	private int numero;
	
	
	public Revista(int numero, int codigo, String titulo, int ano) {
		super(codigo, titulo, ano);
		this.numero = numero;
	}
	
	public Revista() {
		
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String toString() {
		return super.toString() + "\n" + "Numero:" + this.getNumero();
	}
	

}
