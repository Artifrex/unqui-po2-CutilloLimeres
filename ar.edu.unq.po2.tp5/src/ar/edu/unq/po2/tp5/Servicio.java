package ar.edu.unq.po2.tp5;

public class Servicio extends Factura {
	
	private Double costoPorUnidad;
	private Double cantConsumidaPeriodo;
	
	
	public Servicio (String nombre, Agencia agencia, Double costoPorUnidad, Double cantConsumidaPeriodo) {
		super(nombre, agencia);
		this.costoPorUnidad = costoPorUnidad;
		this.cantConsumidaPeriodo = cantConsumidaPeriodo;
	}
	
	@Override
	public Double getPrecio() {
		return costoPorUnidad * cantConsumidaPeriodo;
	}

}
