
public class Animal implements Comparable<Animal>{
	
	private String nome;
	private int idade;
	
	public Animal(String aNome, int aIdade) {
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
		
		if( outroObjeto==null || !(outroObjeto instanceof Animal))
			return false;
		
		Animal outroAnimal = (Animal) outroObjeto;
		
		return (
				   this.nome .equals(outroAnimal.nome)
				&& this.idade ==     outroAnimal.idade);
	}
	
	
	/*
	 * retorna 0 se os dois objetos são iguais
	 * retorna um número negativo se o this eh menor que o outroObjeto
	 * retorna um número positivo se o this eh maior que o outroObjeto
	 * 
	 * */
	
	@Override
	public int compareTo(Animal outroAnimal) {
		if( ! (this.idade==outroAnimal.idade) )
			return Integer.compare(this.idade, outroAnimal.idade);
		
		return this.nome.compareTo(outroAnimal.nome);
	}

	
	@Override
	public String toString() {
		String res = "";
		res += "N:"+this.nome + "|I:" + this.idade;
		return res;
	}


}
