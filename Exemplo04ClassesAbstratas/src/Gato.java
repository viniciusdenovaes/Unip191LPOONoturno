
public class Gato extends Animal{
	
	public void miar() {
		System.out.println("miau");
	}

	@Override
	public void procuraComida() {
		System.out.println("Caçar rato");
		
	}

	@Override
	public void fazBarulho() {
		this.miar();
		
	}

}
