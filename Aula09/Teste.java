package Aula09;

public class Teste {	
	public static void main(String[] args) {
		Desenvolvedor f1 = new Desenvolvedor("Maria", 1000.00);
		
		Analista f2 = new Analista("Joao", 1000.00);
		
		Gerente f3 = new Gerente("Kaleb", 1000.00);
		
		System.out.println(f1.calcularBonificacao());
		System.out.println(f2.calcularBonificacao());
		System.out.println(f3.calcularBonificacao());
	}
}
