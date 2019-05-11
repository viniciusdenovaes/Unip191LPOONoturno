package map.teste;

import map.model.Curso;
import map.model.Faculdade;
import map.model.GradeDeCursos;
import map.model.Prova;
import map.model.Rendimento;

public class Teste {
	
	public static void main(String[] args) {
		
		Faculdade faculdade = new Faculdade();
		
		String textoNivel = "GRADUACAO";
		Curso.Nivel nivel = Curso.Nivel.valueOf(textoNivel);
		Curso curso = new Curso("LPOO", nivel);
		faculdade.add(new Curso("LPOO", nivel));
		Rendimento r = new Rendimento(curso);
		r.setNota(Prova.NP1, 5.5);
		r.setNota(Prova.NP2, 5.5);
		r.setNota(Prova.SUB, 5.5);
		faculdade.add(r);
		
		System.out.println(faculdade);
		
		
		
		
	}

}
