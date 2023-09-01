package libro;

public class AppLibro {

	public static void main(String[] args) {
		
		Libro libro1  = new Libro();
		libro1.setAutor("Alvaro");
		libro1.setTitulo("LA HISTORIA DE FOXY");
		libro1.setPoseedor("LOLA");
		
		libro1.estado();
		libro1.prestar("GGGG");
		
		
		

	}

}
