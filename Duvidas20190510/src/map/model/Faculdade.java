package map.model;

public class Faculdade {
	
	GradeDeCursos grade;
	
	public Faculdade() {
		grade = new GradeDeCursos();
	}
	
	public void add(Curso curso) {
		grade.add(curso);
	}
	
	public void add(Rendimento rendimento) {
		grade.add(rendimento);
	}

	@Override
	public String toString() {
		return "Faculdade [grade=" + grade + "]";
	}

}
