package reloj;

public class MainApp {

	public static void main(String[] args) throws Exception {
		
		/*Intenta escribir una clase que represente un reloj que señale la hora el minuto, y el segundo.
		 *  La clase dispondrá de dos constructores, uno sin parámetros, que pone el reloj a 0:0:0,
		 *   y otro al que se le pasa ka hora, los minutos y los segundos.

		Además, habrá que realizar los siguientes métodos:

		Uno que da la hora, los minutos y los segundos, separados por el carácter «:» , en una cadena.
		Otro que también da la hora, pero en formato 24 horas (como el anterior) o en formato de 12 horas, 
		en cuyo caso debe distinguir entre «am» (para horas de 0 a 11) o «pm», para horas de 12 a 23,
		 también en una cadena.*/
		
		
		Reloj reloj1 = new Reloj();
		Reloj reloj2 = new Reloj(23, 59, 25);
		
		reloj1.dameHora();
		reloj2.dameHora("12");
		
		
	}
}
