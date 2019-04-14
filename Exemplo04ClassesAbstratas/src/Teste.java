import java.util.ArrayList;

public class Teste {
	
	public static void main(String[] args) {
		
		ArrayList<Animal> animais = new ArrayList<Animal>();
		
		Gato gato = new Gato();
		gato.setNome("Rick");
		gato.setIdade(15);
		gato.setDoente(true);
		animais.add(gato);
		
		Cachorro cachorro = new Cachorro();
		cachorro.setNome("cao");
		cachorro.setIdade(5);
		cachorro.setDoente(true);
		animais.add(cachorro);
		
		Cachorro cachorro2 = new Cachorro();
		cachorro2.setNome("cao2");
		cachorro2.setIdade(10);
		cachorro2.setDoente(false);
		animais.add(cachorro2);
		
		
//		Veterinario.cuidarDoAnimal(gato);
//		Veterinario.cuidarDoAnimal(cachorro);
//		Veterinario.cuidarDoAnimal(cachorro2);
		
		/*OU*/
		
		for(Animal animal : animais) {
			Veterinario.cuidarDoAnimal(animal);
		}
		
		
	}

}
