package superMercado;
//Subclase
public class ProductoDeAlmacen extends Producto implements IVA {
	
	//Atributos
	private int codigo;
	
	
	// Constructores
	public ProductoDeAlmacen() {
		
	}

	ProductoDeAlmacen(String nombre, double precio, int codigo){
		super(nombre, precio);
		this.codigo = codigo;
	}
	
	// Setters y Getters
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	//Matodos
	@Override
	public String toString() {
		return super.toString() + " Codigo = " + codigo;
	}
	
	// Metodo de la interface IVA
	@Override
	public double cacularIva() {
		double precio = super.getPrecio();
		double totalIva = precio * IVA;
		return totalIva;
	}
	
		
		

	
	

}
