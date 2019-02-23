
public class Teste {
	
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		pessoa.setId("123");
		pessoa.setNome("Fernando");
		Secretaria.imprimeRelatorio(pessoa);
		
		Funcionario funcionario = new Funcionario();
		funcionario.setId("321");
		funcionario.setNome("Chico");
		funcionario.setSalario(2000);
		Secretaria.imprimeRelatorio(funcionario);
		//funcionario.relatorio();
		
		Gerente gerente = new Gerente();
		gerente.setId("456");
		gerente.setNome("Mirana");
		gerente.setSalario(3000);
		gerente.setBonus(700);
		Secretaria.imprimeRelatorio(gerente);
		//gerente.relatorio();
		
	}

}
