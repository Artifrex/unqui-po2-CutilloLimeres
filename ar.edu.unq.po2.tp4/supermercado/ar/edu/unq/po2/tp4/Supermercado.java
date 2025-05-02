package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
	
	private String nombre;
	private String direccion;
	private List<Producto> productos = new ArrayList<Producto>();
	
	public Supermercado(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getDireccion() {
		return direccion;
	}

	public Integer getCantidadDeProductos() {
		return productos.size();
	}

	public void agregarProducto(Producto producto) {
		productos.add(producto);		
	}

	public Double getPrecioTotal() {
		return productos.stream().mapToDouble(producto -> producto.getPrecio()).sum();
	}
	
}
