package test;

import dominio.Persona;

public class PersonaPrueba {
	
	public static void main(String[] args) {
		
	Persona persona1 = new Persona("Juan", 5000, false); // este objeto tiene como argumento los valores creados en el packet dominio class Persona
	System.out.println("persona1: " + persona1.toString());
	persona1.setNombre("Juan Carlos"); // al usar el set modificamos el valor del objeto de Juan a Juan Carlos
	
	System.out.println("Persona1 nombre : " + persona1.getNombre()); // se usa el get para acceder al valor del objeto
	System.out.println("persona1 sueldo: "  + persona1.getSueldo()); // se usa el get para visualizar el valor de sueldo
	System.out.println("Persona1 boolean: " + persona1.isEliminado()); // se usa is por que es boolean y con este podemos visualizar el valor
	
	System.out.println("persona1: " + persona1.toString()); // se llama el metodo toString del objeto
	
	
	
	
	
	
	}

}
