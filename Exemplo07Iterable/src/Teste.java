import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Teste {
	
	public static void main(String[] args) {
		
		DonoDeAnimais donoDeAnimais = new DonoDeAnimais();
		
		donoDeAnimais.add(new Pato("quenn", 5));
		donoDeAnimais.add(new Pato("Donaldo", 15));
		donoDeAnimais.add(new Cachorro("Donaldo", 15));
		donoDeAnimais.add(new Pato("donaldo", 15));
		donoDeAnimais.add(new Cachorro("Quenn", 15));
		donoDeAnimais.add(new Pato("Quenn", 15));
		donoDeAnimais.add(new Cachorro("fuzz", 5));
		
		System.out.println(donoDeAnimais);
		
//		Iterator<Pato> i = donoDePatos.iterator();
//		while(i.hasNext()) {
//			Pato pato = i.next();
//			System.out.println("Pato: " + pato);
//		}
		
		
		for(Animal animal : donoDeAnimais) {
			System.out.println("Pato: " + animal);
		}
		
		
	}

}
