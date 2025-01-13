package Aula09;

public class Teste {	
	public static void main(String[] args) {
		Desenvolvedor f1 = new Desenvolvedor("Maria", 1000.00);
		
		Analista f2 = new Analista("Joao", 1000.00);
				
		System.out.println(f1.calcularBonificacao());
		System.out.println(f2.calcularBonificacao());
		
		Diretor f3 = new Diretor("Moana", 1000.00);
		
		System.out.println(f3.calcularBonificacao());
		
		Sistema s = new Sistema();
		s.adicionarFuncionarios(f1);
		s.adicionarFuncionarios(f2);
		s.adicionarFuncionarios(f3);
		
		s.calculaSomaBonificacoes();
		
		System.out.println(s.getSomaBonificacoes());
		System.out.println(s.getFuncionarios());
	}
}
