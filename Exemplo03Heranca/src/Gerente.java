
public class Gerente extends Funcionario{
	
	private double bonus;

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	@Override
	public double getPagamento() {
		double salarioBase = super.getSalario();
		double pagamento = salarioBase + this.bonus;
		return pagamento;
	}
	
	@Override
	public void relatorio() {
		System.out.println("Sou da classe gerente");
		System.out.println("id: " + super.getId());
		System.out.println("nome: " + super.getNome());
		System.out.println("Pagamento: " + this.getPagamento());
		System.out.println();
	}
	

}
