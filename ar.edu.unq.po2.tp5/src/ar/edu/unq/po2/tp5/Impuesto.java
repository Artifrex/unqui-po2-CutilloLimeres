package ar.edu.unq.po2.tp5;

public class Impuesto extends Factura {
	
	private Double tasaServicio;
	
	public Impuesto (String nombre, Agencia agencia, Double tasaServicio) {
		super(nombre, agencia);
		this.tasaServicio = tasaServicio;
	}
	
	@Override
	public Double getPrecio() {
		return tasaServicio;
	}

}
