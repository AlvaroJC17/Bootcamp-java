package ejercicioPersona;


public class MainApp {

	public static void main(String[] args) throws Exception {
	
	//Prueba para ver si mi clase es concreta	
		
	/*Persona p1 = new Persona();
	p1.setNombre("Kuaka");
	p1.setDNI(95822499);
	p1.setEdad(17);
	
	p1.mostrar();
	p1.esMayorDeEdad();
	
	Cuenta cuenta1 = new Cuenta(new Persona("Alvaro", 36, 95822499), 200);
	System.out.println(cuenta1.toString());*/
		
	// pruba con cambiando las clases a abstractas
		
		CuentaAhorro ca = new CuentaAhorro();
		ca.retirar(200);
		
		

	}

}
