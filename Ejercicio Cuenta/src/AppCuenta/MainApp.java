package AppCuenta;

public class MainApp {

	public static void main(String[] args) throws Exception {
		
		Cuenta cta1 = new Cuenta(); // ejemplo con el constructo por defecto y usando el metodo ingresar y retirar
		cta1.ingresar(100);
		cta1.retirar(50.6);
		System.out.println(cta1.toString());
		
		Cuenta cta2 = new Cuenta("PEPE", 200); // ejemplo con el constructor que usa parametros usario y salgo ingresado y el metodo retirar
		cta2.retirar(99);
		System.out.println(cta2.toString());
		
		Cuenta cta3 = new Cuenta("FOXY", 200); // ejemplo con el segundo constructor en donde el retiro es mayor al ingreso, el resulto debe ser cero
		cta3.retirar(500);
		System.out.println(cta3);
		
		Cuenta cta4 = new Cuenta("" ,10); // ejemplo con el segundo constructor donde no se coloca el usuario, debe tirar una execpcion porque usuario es obligatorio
		cta4.retirar(100);
		System.out.println(cta4);
		
		
		
		
		
		
		
		
		
	
		
		

	}

}
