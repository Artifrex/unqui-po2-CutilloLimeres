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
	
	///////////////////////////////PUNTO 3//////////////////////////////////////
	
	public int multiploDe(int x, int y) {//no puedo hacer que funcione bien
		
		int multiplo = 1000;
		while (!this.esMultiplo(x, multiplo) || !this.esMultiplo(y, multiplo) ) {
			multiplo--;
		}
		
		return multiplo;
	}
	
	private boolean esMultiplo(int num1, int num2) {
		return (num1 % num2) == 0;
	}
	
}