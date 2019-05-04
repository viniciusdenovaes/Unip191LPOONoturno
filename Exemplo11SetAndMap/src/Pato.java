
public class Pato implements Comparable<Pato>{
	
	String nome;
	int idade;
	
	public Pato(String aNome, int aIdade) {
		this.nome = aNome;
		this.idade = aIdade;
	}
	
	@Override
	public boolean equals(Object outroObjeto) {
		
		// 1 - verifica se os dois enderecos sao iguais
		if(this == outroObjeto)
			return true;
		
		// 2 - verificar se o outro objeto eh nulo ou nao eh um pato
		if( outroObjeto == null || !(outroObjeto instanceof Pato))
			return false;
		
		// 3 - fazer uma variavel do tipo Pato
		Pato outroPato = (Pato) outroObjeto;
		
		// 4 - verifico os campos
		return     this.nome.equals(outroPato.nome)
				&& this.idade == outroPato.idade;
	}
	
	@Override
	public int compareTo(Pato outroPato) {
		if(this.nome.equals(outroPato.nome) == false)
			return this.nome.compareTo(outroPato.nome);
		return Integer.compare(this.idade, outroPato.idade);
	}

	@Override
	public String toString() {
		String res = "";
		res += "Nome: " + nome + 
				"\nIdade: " + idade;
		return res;
	}

}
