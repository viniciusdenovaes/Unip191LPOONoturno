package menu.model;

public class Curso{
	
	String nome;
	int ano;
	
	public Curso(String nome, int ano) {
		this.nome = nome;
		this.ano = ano;
	}
	@Override
	public String toString() {
		return "nome=" + nome + ", \nano=" + ano + "\n";
	}
	
	
	
	

}
