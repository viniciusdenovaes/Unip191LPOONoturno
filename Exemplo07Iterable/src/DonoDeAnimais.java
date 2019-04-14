import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class DonoDeAnimais implements Iterable<Animal> {
	
	Collection<Animal> animais;
	
	public DonoDeAnimais() {
		animais = new TreeSet<>();
	}
	
	public void add(Animal animal) {
		animais.add(animal);
	}

	@Override
	public Iterator<Animal> iterator() {
		return animais.iterator();
	}

	
	@Override
	public String toString() {
		return this.animais.toString();
	}

}
