class CachorroTeste{
  public static void main(String[] args){
      Cachorro cachorro01;
      cachorro01 = new Cachorro();
      cachorro01.nome = "doggy";
      cachorro01.peso = 300;
      cachorro01.latir();
      
      Cachorro cachorro02 = new Cachorro();
      cachorro02.nome = "CÃO";
      cachorro02.peso = 2;
      cachorro02.latir();
      
      Cachorro cachorro03 = cachorro01;
      cachorro03.peso = 3;
      cachorro01.latir();
      
      new Cachorro();
      
      
  }
}