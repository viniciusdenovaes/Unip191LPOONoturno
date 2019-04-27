import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class TesteLerEscreverCSV {
	
	public static void main(String[] args) {
		
		ArrayList<Pato> patos = new ArrayList<>();
		patos.add(new Pato("donal", 15, 5.5));
		patos.add(new Pato("marg", 14, 4.5));
		patos.add(new Pato("quen", 11, 1.5));
		
		//caminho do projeto
		System.out.println(System.getProperty("user.dir"));
		System.out.println(System.getProperty("user.home"));
		String caminho = System.getProperty("user.dir");
		caminho += File.separator + "files";
		caminho += File.separator + "patos.csv";
		System.out.println("Caminho: ");
		System.out.println(caminho);
				
		
		try {
			PrintWriter out = 
					new PrintWriter(
							caminho, StandardCharsets.UTF_8);
			
			for(Pato pato : patos) {
				out.println(pato.nome + "|" 
						+ pato.idade + "|"
						+ (pato.preco+1));
			}
			
			out.close();
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		//try-with-resources
//		try (PrintWriter out = 
//				new PrintWriter(
//						caminho, StandardCharsets.UTF_8);) {
//			for(Pato pato : patos) {
//				out.println(pato.nome + "|" 
//						+ pato.idade + "|"
//						+ (pato.preco+1));
//			}
//			
//		}catch (IOException e) {
//			e.printStackTrace();
//		}
		
		
		ArrayList<Pato> novosPatos = new ArrayList<>();
		
		
		try {
		
			FileInputStream fis = new FileInputStream(caminho);
			Scanner in = new Scanner(fis, "UTF-8");
			
			while(in.hasNextLine()) {
				String linha = in.nextLine();
				String[] palavra = linha.split("\\|");
				
				String novoNome = palavra[0];
				int novaIdade = Integer.parseInt(palavra[1]);
				double novoPreco = Double.parseDouble(palavra[2]);
				
				Pato novoPato = new Pato(novoNome, novaIdade, novoPreco);
				
				novosPatos.add(novoPato);
			}
			
			fis.close();
			
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IllegalArgumentException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		for(Pato pato : novosPatos)
			System.out.println(pato);
		
		
		
		
		
		
		
		
		
		
		
	}

}
