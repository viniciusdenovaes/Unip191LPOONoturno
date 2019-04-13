import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TesteComparator {
	
	public void sortIdadeReversa(ArrayList<Pato> patos) {
		Collections.sort(patos, 
				new Comparator<Pato>() {
			@Override
			public int compare(Pato o1, Pato o2) {
				return -Integer.compare(o1.getIdade(), o2.getIdade());
			}
		});
	}

}
