package Aula12;

public class Teste {

	public static void main(String[] args) {
		Universidade u1 = new Universidade("Unifesspa");

		u1.adicionaDepartamento("Administração");
		u1.adicionaDepartamento("Financeiro");
		u1.adicionaDepartamento("Informática");
		
		System.out.println(u1.toString());
	}

}
