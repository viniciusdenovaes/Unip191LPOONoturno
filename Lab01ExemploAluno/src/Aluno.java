
public class Aluno {
	
	public static int quantidadeDeAlunos = 0;
	
	private String id;
	private String nome;
	private Boletim boletim;
	
	public Aluno(String aId, String aNome) {
		
		Aluno.quantidadeDeAlunos++;
		
		this.id = aId;
		this.nome = aNome;
		this.boletim = new Boletim();
	}
	
	public void defineNotaNP1(double aNota) {
		boletim.defineNotaNP1(aNota);
	}
	public double pegaNotaNP1() {
		return boletim.pegaNotaNP1();
	}
	
	public void defineNotaNP2(double aNota) {
		boletim.defineNotaNP2(aNota);
	}
	public double pegaNotaNP2() {
		return boletim.pegaNotaNP2();
	}
	
	public void relatorio() {
		System.out.println("Id: " + id);
		System.out.println("Nome: " + nome);
		System.out.println(
				"nota NP1: " + boletim.pegaNotaNP1());
		System.out.println(
				"nota NP2: " + boletim.pegaNotaNP2());
		
		double media = (boletim.pegaNotaNP1() 
				      + boletim.pegaNotaNP2()) / 2;
		System.out.println("media: " + media);
		if(media >= 7.0) {
			System.out.println("O Aluno Passou");
		}
		else {
			System.out.println("O Aluno Não Passou");
		}
		System.out.println();
		
	}
	
	public static void relatorioDaClasse() {
		// NÃO POSSO FAZER
		// this.nome = "coisa";
		System.out.println("quantidade de alunos criada: " 
	                      + Aluno.quantidadeDeAlunos);
	}

}
