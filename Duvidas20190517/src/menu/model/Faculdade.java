package menu.model;

public class Faculdade {
	
	Cursos cursos = new Cursos();
	Alunos alunos = new Alunos();
	
	public Cursos getCursos() {
		return cursos;
	}
	
	public Alunos getAlunos() {
		return alunos;
	}
	
	public void addCurso(Curso curso) {
		cursos.add(curso);
	}

}
