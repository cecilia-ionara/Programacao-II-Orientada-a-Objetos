package Aula04;

public class TestaConta {
	public static void main(String[] args) {
		Cliente cl1 = new Cliente("Cecilia", "04334987");
		Conta c1 = new Conta(11, cl1, 1000.0);

		c1.sacar(100.0);
		
		System.out.println("Titular: "+c1.getTitular().getNome());
		System.out.println("Saldo atual: "+c1.getSaldo());
	}
}
