import java.io.IOException;

public class NumerosNegativosException 
		extends IOException{
	
	public int distancia;
	
	public NumerosNegativosException() {
		super();
	}
	
	public NumerosNegativosException(String message) {
		super(message);
	}

}
