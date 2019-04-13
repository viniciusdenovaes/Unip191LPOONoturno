
public class Pato {
	
	private String nome;
	private int idade;
	
	public Pato(String aNome, int aIdade) {
		this.nome = aNome;
		this.idade = aIdade;
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
	
	
	
	@Override
	public String toString() {
		String res = "";
		res += "N:"+this.nome + "|I:" + this.idade;
		return res;
	}

}
