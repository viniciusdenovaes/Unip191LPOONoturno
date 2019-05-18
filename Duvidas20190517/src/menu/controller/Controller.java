package menu.controller;

import menu.model.Alunos;
import menu.model.Curso;
import menu.model.Cursos;
import menu.model.Model;
import menu.view.View;

public class Controller {
	
	Model model = new Model();
	View view = new View();
	
	public void inicia() {
		model.carrega();
		
		boolean terminar = false;
		while(terminar==false) {
			
			
			int opcao = view.menu();
			
			switch(opcao) {
			case 1: 
				Alunos alunos = model.getAlunos();
				view.mostrarAlunos(alunos);
				break;
			case 2: 
				Cursos cursos = model.getCursos();
				view.mostrarCursos(cursos);
				break;
			case 3: 
				Curso curso = view.leCurso();
				model.addCurso(curso);
				break;
			case 4:
				model.save();
				System.exit(0);
			default:
				System.out.println("entrada invalida");
			}
		}
	}
	
	

}
