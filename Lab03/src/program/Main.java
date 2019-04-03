package program;

import java.util.List;
import java.util.stream.Collectors;

import model.ListaPuntos;
import model.Punto;

public class Main {

	public static void main(String[] args) {
		List<Punto> lista = ListaPuntos.generarListaPutos();
		//lista.forEach(System.out::println);
		
		Main.puntoA(lista);
		
	}

	
	
	
	
	
	private static void puntoA(List<Punto> lista)
	{
		List<Punto> listaFiltrada = lista.stream()
				.filter(p -> p.getY() >= -20 && p.getY() <= 15)
				.sorted()
				.map(p -> new Punto(p.getX(),Main.f(p.getX())))
				.collect(Collectors.toList());
		
		listaFiltrada.forEach(System.out::println);
	}
	
	private static double f(Double x) {
		return x*x*x + 2*x*x - 2*x + 2;
	}
}
