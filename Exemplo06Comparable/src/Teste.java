import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Teste {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> inteiros = new ArrayList<>();
		inteiros.add(7);
		inteiros.add(5);
		inteiros.add(3);
		inteiros.add(10);
		inteiros.add(5);
		
		System.out.println(inteiros);
		Collections.sort(inteiros);
		System.out.println(inteiros);
		
		ArrayList<Pato> patos = new ArrayList<>();
		
		patos.add(new Pato("quenn", 5));
		patos.add(new Pato("Donaldo", 15));
		patos.add(new Pato("Donaldo", 13));
		patos.add(new Pato("donaldo", 15));
		patos.add(new Pato("Quenn", 15));
		patos.add(new Pato("quenn", 15));
		patos.add(new Pato("fuzz", 5));
		
		System.out.println(patos);
		
		Collections.sort(patos);
		System.out.println(patos);
		
		TesteComparator testeComparator = new TesteComparator();
		testeComparator.sortIdadeReversa(patos);
		System.out.println(patos);
		
	}

}
