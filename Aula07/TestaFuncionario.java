package Aula07;

public class TestaFuncionario {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Gabriel Carlos", "43874983496", 1850.00);
		Funcionario g1 = new Gerente("Josue", "342322332", 100.00);
		Funcionario s1 = new Secretario("Mariana", "293839", 2222202.0);
		Funcionario d1 = new Diretor("Aluisio", "223232323", 439843.0);

		System.out.println(f1.calculaBonificacao());
		System.out.println(g1.calculaBonificacao());
		System.out.println(s1.calculaBonificacao());
		System.out.println(d1.calculaBonificacao());
	}	
	
	
}
