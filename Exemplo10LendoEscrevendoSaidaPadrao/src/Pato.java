
public class Pato {
	
	String nome;
	int idade;
	double preco;
	
	public Pato (String aNome, int aIdade, double aPreco) {
		this.nome = aNome;
		this.idade = aIdade;
		this.preco = aPreco;
	}
	
	@Override
	public String toString() {
		return 
				"Nome: " + this.nome +
				"\nIdade: " + this.idade +
				"\nPreco: " + this.preco;
	}

}
