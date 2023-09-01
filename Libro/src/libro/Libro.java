package libro;

public class Libro {
	
	// ATRIBUTOS

	private String autor;
	private String titulo;
	private String poseedor = "";
	private boolean status;
	
	//GETTERS y SETTERS
	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getPoseedor() {
		return poseedor;
	}
	public void setPoseedor(String poseedor) {
		this.poseedor = poseedor;
	}
	
	public void setStatus(boolean status ) {
		this.status = status;
	}
	
	public boolean getStatus(){
		return status;	
	}
	
	//SOBRECARGA
	
	public Libro(){
		
	};
	
	public Libro (String autor, String titulo, String poseedor) {
		this.autor = autor;
		this.titulo = titulo;
		this.poseedor = poseedor;
	};
	
	//METODOS
	
	public void prestar(String poseedor) {
		if (this.poseedor.equals("")) {
			System.out.println("El libro " + this.getTitulo() + " ha sido prestado a " + poseedor);
			this.setStatus(true);
		}else {
			System.out.println("El libro " + this.getTitulo() + " ya ha sido prestado a " + this.getPoseedor());
			this.setStatus(false);
		}
	}
	
	public void estado() {
		
		if (this.status) {
			System.out.println("Estados del libro: Disponible");
		}else {
			System.out.println("Estado del libro: No Disponible");
		}
		
	}
	
	
			
			
	
	
	
	
	
	
	
	
}
