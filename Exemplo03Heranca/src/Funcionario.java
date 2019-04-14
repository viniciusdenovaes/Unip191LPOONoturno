
public class Funcionario extends Pessoa {
	
	private double salario;

	public double getSalario() {
		return salario;
	}

	public void setSalario(double aSalario) {
		this.salario = aSalario;
	}
	
	public double getPagamento() {
		return this.getSalario();
	}
	
	@Override
	public void relatorio() {
		System.out.println("Sou da classe funcionario");
		System.out.println("id: " + super.getId());
		System.out.println("nome: " + super.getNome());
		System.out.println("Pagamento: " + this.getPagamento());
		System.out.println();
	}
	
	
	

}
