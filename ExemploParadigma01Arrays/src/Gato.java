
public class Gato {
	
	String nome;
	int idade;
	
	public Gato(String aNome, int aIdade) {
		this.nome = aNome;
		this.idade = aIdade;
	}
	
	public void relatorio() {
		System.out.println("nome: " + this.nome);
		System.out.println("idade: " + this.idade);
		System.out.println();
	}
	
	@Override
	public String toString() {
		String resultado = "";
		
		resultado += "Nome: "  + this.nome  + "\n";
		resultado += "Idade: " + this.idade + "\n";
		
		return resultado;
	}
	

}
