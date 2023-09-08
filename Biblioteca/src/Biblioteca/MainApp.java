package Biblioteca;

public class MainApp {

	public static void main(String[] args) {
		
		Revista revista1 = new Revista(1, 25, "Legion", 2023);
		System.out.println(revista1.toString());
		
		Libro libro1 = new Libro(false, 26, "Omega", 2023);
		System.out.println(libro1.toString());
		libro1.prestado();
		libro1.prestar();
		libro1.prestado();
		libro1.devolver();
		libro1.prestado();
		
		System.out.println();
		
		Libro libro2 = new Libro(true, 27, "Titan", 2023);
		libro2.prestado();
		libro2.prestar();
		libro2.devolver();
		libro2.prestar();
		libro2.devolver();
		libro2.devolver();

	}

}
