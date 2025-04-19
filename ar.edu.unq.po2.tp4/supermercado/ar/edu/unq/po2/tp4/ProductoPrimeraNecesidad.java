package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto {
	
	public ProductoPrimeraNecesidad (String nombre, Double precio, Boolean esPrecioCuidado) {
		super(nombre,precio,esPrecioCuidado);
	}
	
	@Override
	public Double getPrecio() {
		return this.precio * descuentoAplicable();
	}
	
	private Double descuentoAplicable() {
		return 0.9;
	}
}
