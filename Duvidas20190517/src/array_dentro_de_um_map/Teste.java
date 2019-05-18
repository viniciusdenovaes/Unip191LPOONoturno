package array_dentro_de_um_map;

public class Teste {
	
	public static void main(String[] args) {
		
		InscritosEmCursos inscritas = new InscritosEmCursos();
		
		Curso curso01 = new Curso("curso01", 101);
		Curso curso02 = new Curso("curso02", 102);
		Curso curso03 = new Curso("curso03", 103);
		
		Aluno aluno01 = new Aluno("1", "aluno01");
		Aluno aluno02 = new Aluno("2", "aluno02");
		Aluno aluno03 = new Aluno("3", "aluno03");
		
		inscritas.addCurso(curso01);
		inscritas.addCurso(curso02);
		inscritas.addCurso(curso03);
		
		System.out.println(inscritas);
		
		inscritas.put(curso01, aluno01);
		inscritas.put(curso02, aluno01);
		inscritas.put(curso02, aluno02);
		
		System.out.println(inscritas);
		
	}

}
