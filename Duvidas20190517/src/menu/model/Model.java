package menu.model;

public class Model {
	
	Faculdade faculdade = new Faculdade();
	
	public void carrega() {
		
		Alunos alunos = faculdade.getAlunos();
		alunos.add(new Aluno("121", "aluno01"));
		alunos.add(new Aluno("122", "aluno02"));
		alunos.add(new Aluno("123", "aluno03"));
		
		Cursos cursos = faculdade.getCursos();
		cursos.add(new Curso("curso01", 101));
		cursos.add(new Curso("curso02", 102));
		cursos.add(new Curso("curso03", 103));
		
		
	}
	
	public Alunos getAlunos() {
		return faculdade.getAlunos();
	}

	public Cursos getCursos() {
		return faculdade.getCursos();
	}
	
	public void addCurso(Curso curso) {
		faculdade.addCurso(curso);
	}
	
	public void save() {
		System.out.println("salvando arquivos");
	}

}
