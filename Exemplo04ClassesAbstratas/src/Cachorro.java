
public class Cachorro extends Animal{
	
	public void latir() {
		System.out.println("auauau");
	}
	
	@Override
	public void procuraComida() {
		System.out.println("Fica pedindo comida");
	}
	
	@Override
	public void fazBarulho() {
		this.latir();
	}
	
	

}
