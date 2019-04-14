
public class TesteArrays {
	
	public static void main(String[] args) {
		
		int tamanho = 5;
		
		Gato[] gatos;
		gatos = new Gato[tamanho];
		
		for(int i=0; i<gatos.length; i++) {
			Gato novoGato = new Gato("Rick"+i, i);
			gatos[i] = novoGato;
		}
		
		for(int i=0; i<gatos.length; i++) {
			System.out.println("gatos["+i+"]: ");
			gatos[i].relatorio();
		}
		
		System.out.println("Novo for");
		for(Gato gato : gatos) {
			gato.relatorio();
		}
		
		System.out.println("Novo toString");
		for(Gato gato : gatos) {
			System.out.println(gato);
		}
		
		
	}

}
