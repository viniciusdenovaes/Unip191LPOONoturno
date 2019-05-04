import java.util.Set;
import java.util.TreeSet;

public class TesteSet {
	
	public static void main(String[] args) {
		Set<Pato> patos = new TreeSet<>();
		
		patos.add(new Pato("Rick", 8));
		patos.add(new Pato("Rick", 18));
		patos.add(new Pato("Morty", 7));
		patos.add(new Pato("Morty", 7));
		patos.add(new Pato("Morty", 6));
		
		for(Pato pato : patos) {
			System.out.println(pato);
		}
	}

}
