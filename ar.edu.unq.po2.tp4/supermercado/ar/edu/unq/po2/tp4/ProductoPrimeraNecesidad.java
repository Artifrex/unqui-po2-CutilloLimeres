package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto {
	
	private Double descuentoAplicable;
	
	public ProductoPrimeraNecesidad (String nombre, Double precio, Boolean esPrecioCuidado, Double descuentoAplicable) {
		super(nombre,precio,esPrecioCuidado);
		this.descuentoAplicable = descuentoAplicable;
	}
	
	@Override
	public Double getPrecio() {
		return this.precio * descuentoAplicable;
	}
	
}
