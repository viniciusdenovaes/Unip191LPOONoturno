import java.util.ArrayList;

public class TesteArrayList {
	
	public static void main(String[] args) {
		
		int tamanho = 5;
		
		ArrayList<Gato> gatos;
		gatos = new ArrayList<Gato>();
		
		for(int i=0; i<tamanho; i++) {
			Gato novoGato = new Gato("Rick"+i, i);
			gatos.add(novoGato);
		}
		
		for(int i=0; i<gatos.size(); i++) {
			gatos.get(i).relatorio();
		}
		
		Gato gatoDoMeio = new Gato("Gato do Meio", 15);
		int posicao = gatos.size()/2;
		gatos.set(posicao, gatoDoMeio);
		
		for(int i=0; i<gatos.size(); i++) {
			gatos.get(i).relatorio();
		}
		
		System.out.println("Novo for");
		for(Gato gato : gatos) {
			gato.relatorio();
		}
		
		System.out.println("Novo toString");
		for(Gato gato : gatos) {
			System.out.println(gato);
		}
		
		
		
		
		
		//Exercicio da lista: imprima o gato mais velho
		//escreve aqui
		int maiorIdade = -1;
		Gato gatoMaisVelho = new Gato("", -2);
		
		for(Gato gato : gatos) {
			//escrever coisa aqui
			if(maiorIdade < gato.idade) {
				maiorIdade = gato.idade;
				gatoMaisVelho = gato;
			}
		}
		//escrever coisa aqui
		System.out.println("Gato mais velho:");
		System.out.println(gatoMaisVelho);
		
		
		
		
		
		
	}

}
