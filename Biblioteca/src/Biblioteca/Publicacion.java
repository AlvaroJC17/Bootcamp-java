package Biblioteca;
// Superclase
abstract public class Publicacion {

	
	private int codigo;
	private String titulo;
	private int año;
	
	public Publicacion(int codigo, String titulo, int año) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.año = año;
	}
	
	public Publicacion() {
		
	}
	
	
	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}



	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public int getAño() {
		return año;
	}



	public void setAno(int año) {
		this.año = año;
	}



	public String toString() {
		return "codigo:" + this.codigo + "\n" + "titulo:" + this.getTitulo() + "\n" +  "Ano:" + this.getAño();
	}
	

	
}
