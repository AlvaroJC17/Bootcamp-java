package ejercicioPersona;

public class CuentaAhorro extends Persona implements IOperaciones, IConsultar {

	@Override
	public String consultarInfoBancoCentral() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void retirar(double monto) {
		double total;
		total = monto - IOperaciones.COMISION;
		System.out.println("Es saldo retirado es: " + total);
		
	}

	@Override
	public void depositar(double monto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double consultar() {
		// TODO Auto-generated method stub
		return 0;
	}

	



}
