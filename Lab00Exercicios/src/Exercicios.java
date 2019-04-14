
public class Exercicios {
	
	public static void main(String[] args) {
		int limite = 100;
		for(int i=1; i<=limite; i++) {
			//se é multiplo de 3 fizz
			//se é multiplo de 5 buzz
			//se é multiplo de 5 e 3 fizzbuzz
			//fora isso, imprime o numero
			if( (i%3 == 0) && (i%5 == 0)) {
				System.out.println("FizzBuzz");
			}
			else if( i%3 == 0) {
				System.out.println("Fizz");
			}
			else if( i%5 == 0) {
				System.out.println("Buzz");
			}
			else {
				System.out.println(i);
			}
			
		}
	}
	

}
