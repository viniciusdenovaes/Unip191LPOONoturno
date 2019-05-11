package map.model;

public class Nota {
	
	private double valor;
	
	public Nota(double aValor) {
		this.valor = aValor;
		this.valor = Math.min(valor, 10.0);
		this.valor = Math.max(valor, 0.0);
	}

	@Override
	public String toString() {
		return "Nota [valor=" + valor + "]";
	}

}
