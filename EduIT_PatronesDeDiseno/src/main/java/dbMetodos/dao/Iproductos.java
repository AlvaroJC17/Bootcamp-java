package dbMetodos.dao;

import productos.vo.Productos;

public interface Iproductos {

	void AgregarProductos(Productos p);
	
	void removerProducto(int c);
	
	void modificarProducto(int codigo, String nombre, double precio);
}
