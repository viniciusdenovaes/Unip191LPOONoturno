
public class TesteFuncionario {
	public static void main(String[] args) {
		
		Funcionario funcionario01;
		funcionario01 = new Funcionario("123", "Mario Bros");
		funcionario01.salario.salarioBase = 1000.0;
		funcionario01.salario.bonus = 1000.0;
		funcionario01.imprimir();
		
		Funcionario funcionario02;
		funcionario02 = new Funcionario("321", "Luigi Bros");
		funcionario02.salario.salarioBase = 900.0;
		funcionario02.salario.bonus = 100.0;
		funcionario02.imprimir();
	}

}
