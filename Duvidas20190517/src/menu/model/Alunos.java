package menu.model;

import java.util.ArrayList;
import java.util.Iterator;

public class Alunos{
	
	ArrayList<Aluno> alunos = new ArrayList<>();
	
	public void add(Aluno aluno) {
		alunos.add(aluno);
	}
	
	public Aluno get(int i) {
		return alunos.get(i);
	}
	
	public int size() {
		return alunos.size();
	}
	
}
