
public class TesteSomaPositivos {
	
	public static void main(String[] args) {
		
		MaquinaDeSoma m = new MaquinaDeSoma();
		
		
		int r = 0;
		
		try {
			r = m.somaPositivos(2, -3);
		}
		catch (NumerosNegativosException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(
					"some " + e.distancia 
					+ " à uma das variaveis");
		}
		
		System.out.println(r);
		
		
		
	}

}
