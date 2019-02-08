class Cachorro{
  int peso;
  int idade;
  String nome;
  
  void latir(){
		if(peso>20) {
			System.out.println("AUAU ola AUAU");
		}
		if(peso<=20) {
			System.out.println("auau ola auau");
		}
		System.out.println("meu nome é " + nome);
		System.out.println();
  }
}
