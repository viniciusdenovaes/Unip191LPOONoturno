
public class Veterinario {
	
	public static void cuidarDoAnimal(Animal animal) {
		if(animal.isDoente() == false) {
			System.out.println("O animal não está doente");
			return;
		}
		
		animal.procuraComida();
		curarAnimal(animal);
		animal.fazBarulho();
		animal.dormir();
		
	}
	
	private static void curarAnimal(Animal animal) {
		animal.setDoente(false);
		System.out.println("Veterinario: Animal curado");
	}
	
	

}
