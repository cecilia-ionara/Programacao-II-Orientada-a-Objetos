package Aula11;

public class Teste {

	public static void main(String[] args) {
		Contribuinte c1 = new PessoaFisica("Maria", 10000.00, 0.00);
		Contribuinte c2 = new PessoaJuridica("Gabriel", 10000.00, 8);
		
		System.out.println(c1.calculaImposto());
		System.out.println(c2.calculaImposto());
	}

}
