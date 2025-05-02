package ar.edu.unq.po2.tp5;
import java.util.ArrayList;
import java.util.List;

public class Caja {
	
	private List<Producto> productos = new ArrayList<Producto>();
	private int montoAcumulado;
	
	public Caja(int montoAcumulado) {
		this.montoAcumulado = montoAcumulado;
	}
	
	public int montoTotalAPagar() {
		return productos.stream().mapToInt(producto -> producto.getPrecio()).sum();
	}
	
	public void registrar(CobrableEnCaja c) {
		c.registrar();
	}
	
	public void agregarProducto(Producto producto) {
		productos.add(producto);
	}

}
