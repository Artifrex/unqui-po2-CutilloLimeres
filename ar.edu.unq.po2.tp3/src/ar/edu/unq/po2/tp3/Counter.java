package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Counter {
	
	private List<Integer> listaNumeros =  new ArrayList<Integer>();
	
	public int cantNumerosPares() {
		return (int)listaNumeros.stream().filter(n -> n % 2 == 0).count();
	}
	
	public int cantNumerosImpares() {
		return (int)listaNumeros.stream().filter(n -> n % 2 != 0).count();
	}
	
	public int cantMultiplosDe(int numero) {
		return (int)listaNumeros.stream().filter(n -> n % numero == 0).count();
	}

	public void addNumber(int numero) {
		listaNumeros.add(numero);
		
	}
	

}