package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;

public class Recaudador implements Agencia {

	private List<Factura> facturas = new ArrayList<Factura>();
	
	public void registrarPago(Factura factura) {
		facturas.add(factura);
	}
	
	public Double montoFacturas() {
		return facturas.stream().mapToDouble(factura -> factura.getPrecio()).sum();
	}
}
