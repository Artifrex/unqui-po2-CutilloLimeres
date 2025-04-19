package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto {
	
	private Double descuentoAplicable;
	
	public ProductoPrimeraNecesidad (String nombre, Double precio, Boolean esPrecioCuidado, Double descuentoAplicable) {
		super(nombre,precio,esPrecioCuidado);
		this.descuentoAplicable = descuentoAplicable;
	}
	
	@Override
	public Double getPrecio() {
		//NO ME PARECE BUENA IDEA DENTRO DEL GETTER
		//HACER UNA OPERACIÓN, PERO POR AHORA LO DEJO ASÍ.
		return this.precio * descuentoAplicable;
	}
	
}
