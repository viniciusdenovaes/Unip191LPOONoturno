
public class Gato {
	
	String nome;
	int idade;
	double peso;
	
	public void miar() {
		if(this.idade < 3) {
			System.out.print("miau miau miau");
		}
		else if( (this.idade>=3) && (this.idade<=8) ) {
			System.out.print("miaaau");
		}
		else if(this.idade > 8) {
			System.out.print("Grrr");
		}
		System.out.println(" meu nome eh " + this.nome 
				+ " eu peso " + this.peso);
	}

}
