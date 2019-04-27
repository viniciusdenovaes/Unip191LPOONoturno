
public class MaquinaDeSoma {
	
	public int somaPositivos(int a, int b)
			throws NumerosNegativosException {
		
		// exemplos de verificação de objetos
		Object o = null;
		if(o==null);
		if(o instanceof Object);
		
	if(a<=0) {
		NumerosNegativosException e = 
				new NumerosNegativosException(
						"o a eh negativo");
		e.distancia = -a;
		throw e;
	}
	
	if(b<=0) {
		NumerosNegativosException e = 
				new NumerosNegativosException(
						"o b eh negativo");
		e.distancia = -b;
		throw e;
	}
			
		return a+b;
	}
	

}
