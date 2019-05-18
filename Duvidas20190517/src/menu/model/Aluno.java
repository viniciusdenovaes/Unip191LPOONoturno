package menu.model;

public class Aluno {
	
	String id;
	String nome;
	
	public Aluno(String id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "id=" + id + ",\nnome=" + nome + "\n";
	}
	
			

}
