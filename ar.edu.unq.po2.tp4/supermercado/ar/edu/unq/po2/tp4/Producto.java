package ar.edu.unq.po2.tp4;

public class Producto {
	
	private Double precio;
	private Boolean esPrecioCuidado = false;
	private String nombre;
	
	public Producto(String nombre, Double precio, Boolean esPrecioCuidado)  {
		this.precio = precio;
		this.nombre = nombre;
		this.esPrecioCuidado = esPrecioCuidado;
	}
	
	public Producto(String nombre, Double precio)  {
		this.precio = precio;
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public Boolean esPrecioCuidado() {
		return esPrecioCuidado;
	}
	
	public void setEsPrecioCuidado(Boolean estado) {
		this.esPrecioCuidado = estado;
	}
	
	public void aumentarPrecio(double aumento) {
		this.precio += aumento;
	}

}
