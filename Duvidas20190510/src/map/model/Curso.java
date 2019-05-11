package map.model;

public class Curso implements Comparable<Curso>{
	
	private String nome;
	public enum Nivel{GRADUACAO, POS_GRADUACAO}
	Nivel nivel;
	
	public Curso(String aNome, Nivel aNivel) {
		this.nome = aNome;
		this.nivel = aNivel;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	@Override
	public boolean equals(Object otherObject) {
		
		if(this==otherObject)
			return true;
		
		if(otherObject==null || ! (otherObject instanceof Curso) )
			return false;
		
		Curso outroCurso = (Curso) otherObject;
		
		return 
				   this.getNome().equals(outroCurso.getNome())
				&& this.nivel == outroCurso.nivel;
	}
	
	@Override 
	public int compareTo(Curso outroCurso) {
		if(!this.getNome().equals(outroCurso.getNome())){
			return this.getNome().compareTo(outroCurso.getNome());
		}
		return this.nivel.compareTo(outroCurso.nivel);
	}

	@Override
	public String toString() {
		return "Curso [nome=" + nome + ", nivel=" + nivel + "]";
	}
	
	
	
	
	
}
