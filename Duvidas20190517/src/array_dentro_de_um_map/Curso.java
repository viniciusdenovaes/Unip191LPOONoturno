package array_dentro_de_um_map;

public class Curso implements Comparable<Curso>{
	
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
	
	@Override
	public boolean equals(Object otherObject) {
		// 1
		if(this==otherObject)
			return true;
		
		//2
		if( (otherObject == null) || !(otherObject instanceof Curso))
			return false;
		
		Curso otherCurso = (Curso) otherObject;
		
		return 
				   this.nome.equals(otherCurso.nome)
				&& this.ano == otherCurso.ano;
	}
	
	
	@Override
	public int compareTo(Curso o) {
		
		if(!(this.ano == o.ano))
			return Integer.compare(this.ano, o.ano);
		
		return this.nome.compareTo(o.nome);
	}
	
	
	
	
	

}
