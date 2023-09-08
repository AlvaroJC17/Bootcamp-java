package Biblioteca;
// subclase
public class Libro extends Publicacion implements Prestable {

	private boolean prestado = false;
	
	public Libro(boolean prestado,int codigo, String titulo, int ano ) {
		super(codigo, titulo, ano);
		this.prestado = prestado;
	}
	
	public Libro() {
		
	}

	public boolean getPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}
	
	public String toString() {
		return super.toString() + "\n" +  "Prestado: " + this.getPrestado();
	}
	
	@Override
	public void prestado() {
		if (prestado) {
			System.out.println("El libro " + this.getTitulo() + " esta prestado");
		}else {
			System.out.println("El libro " + this.getTitulo() + " no esta prestado");
		}
	}


	@Override
	public void prestar() {
		if(!prestado) {
			this.prestado = true;
			System.out.println("Gracias por solicitar el libro " + this.getTitulo());
		}else {
			System.out.println("El libro " + this.getTitulo() + " ya fue prestado");
		}
	}
	
	@Override
	public void devolver() {
		if (prestado) {
			prestado = false;
			System.out.println("Gracias por devolver el libro " + this.getTitulo());
		}else {
			System.out.println("libro " + this.getTitulo() + " disponible, no es necesario devolver");
		}
	}

	
	
	

}
