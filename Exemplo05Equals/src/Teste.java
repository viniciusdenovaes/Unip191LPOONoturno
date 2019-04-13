
public class Teste {
	
	public static void main(String[] args) {
		
		Pato p1 = new Pato("quenn", 5);
		Pato p2 = new Pato("Donaldo", 15);
		Pato p3 = new Pato("quenn", 5);
		
		
		System.out.println("\nUSANDO ==\n");
		
		System.out.println("comparando p1 e p2");
		System.out.println("p1: " + p1);
		System.out.println("p2: " + p2);
		System.out.println("usando == ");
		System.out.println("comparação: " + (p1==p2));
		System.out.println();
		
		System.out.println("comparando p1 e p3");
		System.out.println("p1: " + p1);
		System.out.println("p3: " + p3);
		System.out.println("usando == ");
		System.out.println("comparação: " + (p1==p3));
		System.out.println();
		
		System.out.println("\nUSANDO EQUALS\n");
		
		System.out.println("comparando p1 e p2");
		System.out.println("p1: " + p1);
		System.out.println("p2: " + p2);
		System.out.println("usando equals ");
		System.out.println("comparação: " + ( p1.equals(p2) ));
		System.out.println();
		
		System.out.println("comparando p1 e p3");
		System.out.println("p1: " + p1);
		System.out.println("p3: " + p3);
		System.out.println("usando equals ");
		System.out.println("comparação: " + ( p1.equals(p3) ));
		System.out.println();
		
		
		
		
		String s = "";
		System.out.println(p1.equals(s));
		
	}

}
