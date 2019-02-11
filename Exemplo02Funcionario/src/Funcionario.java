
public class Funcionario {
	private String id;
	private String nome;
	Salario salario;
	
	public Funcionario(String aId, String aNome) {
		this.id = aId;
		this.nome = aNome;
		salario = new Salario();
	}
	
	public double getPagamento() {
		return this.salario.getPagamento();
	}
	
	public void imprimir() {
		System.out.println("Id: " + this.id);
		System.out.println("Nome: " + this.nome);
		System.out.println("Pagamento: " + this.getPagamento());
		System.out.println();
	}

}
