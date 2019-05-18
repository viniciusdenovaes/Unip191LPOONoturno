package array_dentro_de_um_map;

import java.util.ArrayList;
import java.util.Collection;

public class Alunos {
	
	Collection<Aluno> alunos = new ArrayList<>();
	
	public void add(Aluno aluno) {
		alunos.add(aluno);
	}

	@Override
	public String toString() {
		String res = "";
		for(Aluno aluno : alunos) {
			res += aluno + "\n";
		}
		return res;
	}
	
	

}
