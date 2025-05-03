package ar.edu.unq.po2.tp5;

public abstract class Factura implements CobrableEnCaja {
	
	private String nombre;
	private Agencia agencia;
	
	public Factura (String nombre, Agencia agencia) {
		this.nombre = nombre;
		this.agencia = agencia;
	}
	
	public void registrar() {
		agencia.registrarPago(this);
	}
	
	public abstract Double getPrecio();

}
