package ar.edu.unq.po2.tp5;

public class ProductoCooperativa extends Producto{

	public ProductoCooperativa(String nombre, int stock, Double precioBase) {
		super(nombre, stock, precioBase);
	}
	
	@Override
	public Double getPrecio() {
		return precioBase - this.dctoAplicable();
	}
	
	private Double dctoAplicable() {
		return precioBase * 0.1;
	}

}
