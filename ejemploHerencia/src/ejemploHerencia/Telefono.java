package ejemploHerencia;

public class Telefono {

	private int numero;
	private int codigo;
	private String operadora;
	
	public Telefono() {
		
	}
	
	public Telefono(int numero, int codigo, String operadora) {
		this.numero = numero;
		this.codigo = codigo;
		this.operadora = operadora;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getOperadora() {
		return operadora;
	}

	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}

	@Override
	public String toString() {
		return "Telefono [numero=" + this.numero + ", codigo=" + this.codigo + ", operadora=" + this.operadora + "]";
	}
	
	
}
