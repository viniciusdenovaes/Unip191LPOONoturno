
public class TesteAluno {
	
	public static void main(String[] args) {
		Aluno aluno01 = new Aluno("123", "Copernico");
		aluno01.defineNotaNP1(2.5);
		aluno01.defineNotaNP2(-5.5);
		aluno01.relatorio();
//		System.out.println("q1 = " + Aluno.quantidadeDeAlunos);
//		Aluno.quantidadeDeAlunos = 2;
//		System.out.println("q1 = " + Aluno.quantidadeDeAlunos);
		Aluno.relatorioDaClasse();
		
		Aluno aluno02 = new Aluno("321", "Einstein");
		aluno02.defineNotaNP1(12.5);
		aluno02.defineNotaNP2(8.5);
		aluno02.relatorio();
//		System.out.println("q2 = " + Aluno.quantidadeDeAlunos);
		Aluno.relatorioDaClasse();
		
	}

}
