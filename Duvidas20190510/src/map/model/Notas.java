package map.model;

import java.util.Map;
import java.util.TreeMap;

public class Notas {
	
	Map<Prova, Double> notas;
	
	public Notas() {
		notas = new TreeMap<>();
		
		for(Prova prova : Prova.values())
			notas.put(prova, 0.0);
		
//		notas.put(Prova.NP1, 0.0);
//		notas.put(Prova.NP2, 0.0);
//		notas.put(Prova.SUB, 0.0);
//		notas.put(Prova.EXAME, 0.0);
		
	}
	
	
	public void setNota(Prova prova, double valor) {
		notas.put(prova, valor);
	}
	
	public double getNota(Prova prova) {
		return notas.get(prova);
	}


	@Override
	public String toString() {
		String res = "\n";
		for(Prova prova : notas.keySet())
			res += prova + ": " + notas.get(prova) + "\n";
		
		return "Notas:" + res;
	}
	
	

}
