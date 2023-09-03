package reloj;

public class Reloj {

	
private int horas;
private int minutos;
private int segundos;

public Reloj(){
	
	this.horas = 0;
	this.minutos = 0;
	this.segundos = 0;
}

public Reloj(int horas, int minutos, int segundos) {
	
	this.horas = horas;
	this.minutos = minutos;
	this.segundos = segundos;
}

public void setHoras(int horas) {
	this.horas = horas;
}

public int getHoras() {
	return horas;
}

public void setMinutos(int minutos) {
	this.minutos = minutos;
}

public int getMinutos() {
	return minutos;
}

public void setSegundos(int segundos) {
	this.segundos = segundos;
}

public int getSegundos() {
	return segundos;
}

private void comprobarHoras(int horas, int minutos, int segundos) throws Exception {
	this.horas = horas;
	this.minutos = minutos;
	this.segundos = segundos;
	
	if (this.getHoras() > 23){
		throw new Exception("Error en la hora"); 
	}if (minutos > 59) {
		throw new Exception("Error en los minutos");
	}if (segundos > 59) {
		throw new Exception("Error en los segundos"); 
	}
}

public void dameHora() throws Exception {
	comprobarHoras(this.getHoras(), this.getMinutos(), this.getSegundos());
	System.out.println("La hora es: " + this.getHoras() + ":" + this.getMinutos() + ":" + this.getSegundos());
}

public void dameHora(String formatoHora) throws Exception {
	
	
	if (formatoHora != "12" && formatoHora != "24" && formatoHora != "" && formatoHora != null) {
		throw new Exception("El argumento a elegir es solo 12 o 24, tampoco puede estar vacio");
	}
	
	comprobarHoras(this.getHoras(), this.getMinutos(), this.getSegundos());
	
	if (formatoHora == "24") {
		if (this.horas >= 0 && this.horas <= 23 ) {
			System.out.println("La hora es: " + this.getHoras() + ":" + this.getMinutos() + ":" + this.getSegundos());
		}
	}
	
	if (formatoHora == "12") {
		if (this.getHoras() >= 0 && this.getHoras() <= 12) {
			System.out.println("La hora es: " + this.getHoras() + ":" + this.getMinutos() + ":" + this.getSegundos() + " am");
		}else if(this.getHoras() >= 13  && this.getHoras() <= 23) {
			this.horas = this.getHoras() - 12;
			System.out.println("La hora es: " + this.getHoras() + ":" + this.getMinutos() + ":" + this.getSegundos() + " pm");
		}
	}
		
	
		
 }
	
	
	
	
	
	
	
	
	
}
