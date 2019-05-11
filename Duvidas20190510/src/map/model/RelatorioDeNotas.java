package map.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class RelatorioDeNotas {
	
	Collection<Rendimento> relatorio;
	
	public RelatorioDeNotas() {
		relatorio = new ArrayList<>();
	}
	
	public void add(Rendimento rendimento) {
		relatorio.add(rendimento);
	}

	@Override
	public String toString() {
		String res = "";
		for(Rendimento r : relatorio) {
			res += r + "\n";
		}
		return "RelatorioDeNotas: " + res;
	}
	

}
