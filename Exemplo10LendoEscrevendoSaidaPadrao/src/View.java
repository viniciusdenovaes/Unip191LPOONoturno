import java.util.Collection;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class View {
	
	public void imprimirPato(Pato pato) {
		System.out.println(pato);
	}
	
	public void imprimirPatos(Collection<Pato> patos) {
		for(Pato pato : patos) {
			System.out.println(pato);
		}
	}
	
	public Pato lerPato() {
		
		System.out.println("Entre com os dados do Pato");
		
		String nome = lerNome();
		int idade = lerIdade();
		double preco = lerPreco();
		
		Pato pato = new Pato(nome, idade, preco);
		
		return pato;
	}
	
	public String lerNome() {
		
		String nome = "";
		
		while(nome.isBlank()) {
			try {
			
				System.out.println("Coloque o nome do Pato");
				Scanner in = new Scanner(System.in);
				nome = in.nextLine();
				if(nome.isBlank()) {
					throw new StringVaziaException();
				}
			}
			catch (StringVaziaException e) {
				System.out.println("Nao pode colocar nome vazio");
				nome = "";
			}
		}
		
		
		return nome;
		
	}
	
	
	public int lerIdade() {
		
		int idade = 0;
		boolean entradaAceita = false;
		
		while(entradaAceita == false) {
			try {
				System.out.println("Entre com a idade do Pato");
				Scanner in  = new Scanner(System.in);
				
				idade = in.nextInt();
				if(idade<0) {
					throw new NumeroNegativoException(String.valueOf(idade));
				}
				entradaAceita = true;
			}
			catch (InputMismatchException e) {
				System.out.println("A idade deve ser um numero inteiro");
				entradaAceita = false;
			}
			catch (NumeroNegativoException e) {
				System.out.println("Numero entrado foi " + e.getMessage());
				System.out.println("Idade nao pode ser negativa");
				entradaAceita = false;
			}
		}
		
		return idade;
	}
	
	
	public double lerPreco() {
		double preco = 0.0;
		boolean entradaAceita = false;
		
		while(entradaAceita == false) {
			try {
				System.out.println("Entre com o preco do Pato");
				Scanner in  = new Scanner(System.in);
				in.useLocale(Locale.ENGLISH);
				
				preco = in.nextDouble();
				if(preco<0.0) {
					throw new NumeroNegativoException(String.valueOf(preco));
				}
				entradaAceita = true;
			}
			catch (InputMismatchException e) {
				System.out.println("O preco deve ser um numero real");
				entradaAceita = false;
			}
			catch (NumeroNegativoException e) {
				System.out.println("Numero entrado foi " + e.getMessage());
				System.out.println("Preco nao pode ser negativa");
				entradaAceita = false;
			}
		}
		
		return preco;
		
	}

}







