package ar.edu.unq.po2.tp5;
import java.util.ArrayList;
import java.util.List;

public class Caja {
	
	private List<Producto> productos = new ArrayList<Producto>();
	
	public Double montoTotalAPagar() {
		return productos.stream().mapToDouble(producto -> producto.getPrecio()).sum();
	}
	
	public void registrar(CobrableEnCaja c) {
		c.registrar();
	}
	
	public static void agregarProducto(Producto producto) {
		productos.add(producto);
	}
	
	public List<Producto> getProductos() {
		return this.productos;
	}

}
