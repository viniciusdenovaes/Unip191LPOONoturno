
public class Boletim {
	
	private Nota notaNP1;
	private Nota notaNP2;
	
	public void defineNotaNP1(double aNota) {
		this.notaNP1 = new Nota(aNota);
	}
	public double pegaNotaNP1() {
		return this.notaNP1.pegaValor();
	}
	
	public void defineNotaNP2(double aNota) {
		this.notaNP2 = new Nota(aNota);
	}
	public double pegaNotaNP2() {
		return this.notaNP2.pegaValor();
	}

}
