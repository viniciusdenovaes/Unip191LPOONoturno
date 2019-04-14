
public class Pessoa {
	
	private String id;
	private String nome;
	
	public String getId() {
		return id;
	}
	public void setId(String aId) {
		this.id = aId;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String aNome) {
		this.nome = aNome;
	}
	
	public void relatorio() {
		System.out.println("Sou da classe pessoa");
		System.out.println("id: " + id);
		System.out.println("nome: " + nome);
		System.out.println();
	}

}





