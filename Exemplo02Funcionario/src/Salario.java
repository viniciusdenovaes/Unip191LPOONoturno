
public class Salario {
	public double salarioBase;
	public double bonus;
	public double getPagamento() {
		double pagamento = this.salarioBase + this.bonus;
		return pagamento;
	}
}
