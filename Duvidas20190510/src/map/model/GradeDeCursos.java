package map.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class GradeDeCursos {
	
	Map<Curso, RelatorioDeNotas> relatorios;
	
	public GradeDeCursos() {
		relatorios = new TreeMap<>();
	}
	
	public void add(Curso curso) {
		relatorios.put(curso, new RelatorioDeNotas());
	}
	
	public Set<Curso> getCursos(){
		return relatorios.keySet();
	}
	
	public RelatorioDeNotas getRelatorio(Curso curso) {
		return relatorios.get(curso);
	}
	
	public void add(Rendimento rendimento) {
		RelatorioDeNotas relatorio = relatorios.get(rendimento.getCurso());
		relatorio.add(rendimento);
	}

	@Override
	public String toString() {
		return "GradeDeCursos [relatorios=" + relatorios + "]";
	}
	

}
