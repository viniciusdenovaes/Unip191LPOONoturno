import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class TesteLerEscreverSaidaPadra {
	
	public static void main(String[] args) {
		
		View v = new View();
		
//		System.out.println("teste nome");
//		String nome = v.lerNome();
//		System.out.println("nome: " + nome);
		
//		System.out.println("teste idade");
//		int idade = v.lerIdade();
//		System.out.println("idade: " + idade);
		
//		System.out.println("teste preco");
//		double preco = v.lerPreco();
//		System.out.println("preco: " + preco);

		System.out.println("teste pato");
		Pato pato = v.lerPato();
		System.out.println("pato: " + pato);

		
		
		
		
	}

}
