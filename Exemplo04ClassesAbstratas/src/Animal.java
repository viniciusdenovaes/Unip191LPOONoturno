
abstract public class Animal {
	
	private String nome;
	private int idade;
	private boolean doente;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public boolean isDoente() {
		return doente;
	}
	public void setDoente(boolean isDoente) {
		this.doente = isDoente;
	}
	
	public void dormir() {
		System.out.println("ZZZZZZ");
	}
	
	abstract public void procuraComida();
	
	abstract public void fazBarulho();
	

}
