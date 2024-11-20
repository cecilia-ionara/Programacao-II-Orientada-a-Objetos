package aula02;

public class TestaReferencias {
	public static void main(String[] args) {
		Cliente cl1 = new Cliente("Maria", "Ana", "cpf");
		Cliente cl2 = new Cliente("Gabriel", "Silva", "cpf");
		
		Conta c1 = new Conta(31, 1330.0, cl1);
		Conta c2 = new Conta(41, 330.0, cl2);
		
		c1.depositar(100.0);
		
		c2.depositar(200.0);
		
		System.out.println(c1.saldo);
		System.out.println(c2.saldo);
	}
}
