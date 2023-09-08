package ejemploHerencia;

public class MainApp {

	public static void main(String[] args) {
		/* con una clase concreta puedo crear objetos como sigue
		 * 
		 * Persona persona = new Persona();
		 * persona.setNombre("Juan Gabriel");
		 * persona.Saludar();
		 * 
		 * Con una clase definida como abstracta no se pueden crear objetos
		 * 
		 * Los constructores no se heredan
		 * */
		
		
		//Creamos un objeto cliente usando los atributos y metodos de la superclase
		
		Cliente cliente1 = new Cliente();
		cliente1.setNombres("pepe");
		cliente1.Saludar();
		
		Cliente cliente2 = new Cliente("Luis", 123, "Perez", "dni", "vip", 53);
		
		Empleado empleado1 = new Empleado("Martin", "Perez", "pasaporte", 444, "indefinido", 4500, new Telefono(11,2525,"Claro"));
		
		Ahorrista ahorrista1 = new Ahorrista(); // objeto del tipo ahorritas, este clase es subclase de cliente.
		ahorrista1.setNombres("Foxy");
		ahorrista1.Saludar();
	}

}
