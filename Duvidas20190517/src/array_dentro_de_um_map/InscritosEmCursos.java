package array_dentro_de_um_map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class InscritosEmCursos {
	
	private Map<Curso, Alunos> cursos;
	
	public InscritosEmCursos() {
		cursos = new TreeMap<>();
	}
	
	public void addCurso(Curso curso) {
		cursos.put(curso, new Alunos());
	}
	
	public void put(Curso curso, Aluno aluno) {
		Alunos alunoDesteCurso = 
				cursos.get(curso);
		alunoDesteCurso.add(aluno);
	}
	
	public Alunos getALunos(Curso curso){
		return cursos.get(curso);
	}
	
	public Set<Curso> getCursos(){
		return cursos.keySet();
	}

	@Override
	public String toString() {
		String res = "";
		for(Curso curso : cursos.keySet()) {
			res += curso + ": " + cursos.get(curso);
			res += "\n-----------------------------\n";
		}
		return res;
	}
	
	
	
	
	
	
	
	
	
	
	

}
