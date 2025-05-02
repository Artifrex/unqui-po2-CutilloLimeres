package ar.edu.unq.po2.tp5;


public class Producto implements CobrableEnCaja {
	
	protected String nombre;
	private int stock;
	public Double precioBase;
	
	public Producto (String nombre, int stock, Double precioBase) {
		this.nombre = nombre;
		this.stock = stock;
		this.precioBase = precioBase;
	}
	
	public void registrar() { //preguntar como hacer esto sin que producto conozca a caja y caer
							  // en el if
		Caja.agregarProducto(this);
		this.stock--;		
	}
		
	public Double getPrecio() {
		return precioBase;
	}

}
