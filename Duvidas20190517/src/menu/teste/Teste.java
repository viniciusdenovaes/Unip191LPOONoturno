package menu.teste;

import menu.controller.Controller;
import menu.model.Alunos;
import menu.model.Model;
import menu.view.View;

public class Teste {
	
	public static void main(String[] args) {
//		Model model = new Model();
//		View view = new View();
//		
//		model.carrega();
//		Alunos alunos = model.getAlunos();
//		view.mostrarAlunos(alunos);
		
		Controller controller = new Controller();
		
		controller.inicia();
	}

}
