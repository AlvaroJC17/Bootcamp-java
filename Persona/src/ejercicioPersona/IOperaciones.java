package ejercicioPersona;

public interface IOperaciones {

	//Constante
	
	final int COMISION = 10; //dentro de las interfaces se asumen que todas las variables son constantes porlo que no es necesario colocar la palabra reservada final
	
	//metodos abstractos, dentro de las interfaces todos los metodos que se creen sera abstractos
	
	void retirar(double monto);
	
	void depositar(double monto);
	
	double consultar();
}
