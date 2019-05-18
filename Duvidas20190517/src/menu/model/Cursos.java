package menu.model;

import java.util.ArrayList;
import java.util.Collection;

public class Cursos {
	
	ArrayList<Curso> cursos = new ArrayList<Curso>();
	
	public void add(Curso curso) {
		cursos.add(curso);
	}
	
	public Curso get(int i) {
		return cursos.get(i);
	}
	
	public int size() {
		return cursos.size();
	}
	

}
