
public class Pato implements Comparable<Pato>{
	
	private String nome;
	private int idade;
	
	public Pato(String aNome, int aIdade) {
		this.nome = aNome;
		this.idade = aIdade;
	}
	
	public String getNome() {
		return this.nome;
	}
	public int getIdade() {
		return this.idade;
	}
	
	
	@Override
	public boolean equals(Object outroObjeto) {
		
		if(this==outroObjeto)
			return true;
		
		if( outroObjeto==null || !(outroObjeto instanceof Pato))
			return false;
		
		Pato outroPato = (Pato) outroObjeto;
		
		return (
				   this.nome .equals(outroPato.nome)
				&& this.idade ==     outroPato.idade);
	}
	
	
	/*
	 * retorna 0 se os dois objetos são iguais
	 * retorna um número negativo se o this eh menor que o outroObjeto
	 * retorna um número positivo se o this eh maior que o outroObjeto
	 * 
	 * */
	
	@Override
	public int compareTo(Pato outroPato) {
		if( ! (this.idade==outroPato.idade) )
			return Integer.compare(this.idade, outroPato.idade);
		
		return this.nome.compareTo(outroPato.nome);
	}

	
	@Override
	public String toString() {
		String res = "";
		res += "N:"+this.nome + "|I:" + this.idade;
		return res;
	}


}
