package ar.edu.unq.po2.tp5;
import java.util.ArrayList;
import java.util.List;

public class Caja {
	
	private List<RegistrableEnCaja> productos = new ArrayList<RegistrableEnCaja>();
	private Recaudador recaudador;
	
	public Caja (Recaudador recaudador) {
		this.recaudador = recaudador;
	}
	
	public Double montoTotalAPagar() {
		return this.montoFacturas() + this.montoProductos();
	}
	private Double montoProductos() {
		return productos.stream().mapToDouble(producto -> producto.getPrecio()).sum();
	}
	
	private Double montoFacturas() {
		return recaudador.montoFacturas();
	}
	
	public void registrar(CobrableEnCaja c) {
		c.registrar();
		
		if (c instanceof RegistrableEnCaja) {
			productos.add((RegistrableEnCaja) c);
		}
	}
	
	public List<RegistrableEnCaja> getProductos() {
		return this.productos;
	}

}
