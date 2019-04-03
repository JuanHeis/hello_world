package model;

import java.util.ArrayList;
import java.util.List;

public class ListaPuntos {

	public static List<Punto> generarListaPutos(){
		List<Punto> lista = new ArrayList<>();
		for(int i=0; i<300;i++) {
			lista.add(new Punto(
					(Math.random()*10)-5,
					(Math.random()*60)-30));
		}
		return lista;
	}
}
