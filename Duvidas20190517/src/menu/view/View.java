package menu.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import menu.model.Alunos;
import menu.model.Curso;
import menu.model.Cursos;

public class View {
	
	public void mostrarAlunos(Alunos alunos) {
		System.out.println("\n-----------------");
		System.out.println("Imprimindo alunos: ");
		System.out.println("-----------------");
		
		for(int i=0; i<alunos.size(); i++) {
			System.out.println(alunos.get(i));
		}
		
	}
	
	public void mostrarCursos(Cursos cursos) {
		System.out.println("\n-----------------");
		System.out.println("Imprimindo cursos: ");
		System.out.println("-----------------");
		
		for(int i=0; i<cursos.size(); i++) {
			System.out.println(cursos.get(i));
		}
		
	}
	
	public Curso leCurso() {
		boolean entradaValida = false;
		while(entradaValida==false) {
			System.out.println("entre com os dados do curso");
			
			String nome = leNome();
			int ano = leAno();
			Curso curso = new Curso(nome, ano);
			return curso;
			
		}
		return null;
	}
	
	public String leNome() {
		
		boolean entradaValida = false;
		while(entradaValida==false) {
			System.out.println("Entre com um nome");
			Scanner in = new Scanner(System.in);
			String nome = in.nextLine();
			
			if(nome.isBlank()) {
				System.out.println("nome em branco");
				continue;
			}
			
			return nome;
		}
		
		return null;

	}
	
	public int leAno() {
		
		boolean entradaValida = false;
		while(entradaValida==false) {
			try {
				System.out.println("Entre com um ano");
				Scanner in = new Scanner(System.in);
				int ano = in.nextInt();
				
				entradaValida = true;
				
				return ano;
			}catch(InputMismatchException e) {
				System.out.println("o numero deve ser um inteiro");
			}
		}
		
		return -1;

	}
	
	public int menu() {
		
		boolean entradaValida = false;
		
		while(entradaValida==false) {
			System.out.println("selecione uma da opcoes");
			System.out.println("1 - para mostrar alunos");
			System.out.println("2 - para mostrar cursos");
			System.out.println("3 - para inserir curso");
			System.out.println("4 - para sair");
			
			Scanner in = new Scanner(System.in);
			int opcao = in.nextInt();
			return opcao;
		}
		
		return -1;
		
		
		
		
		
		
		
	}

}
