package aula02;

public class TestadorDeContas {
	public static void main(String[] args) {
		
		Cliente cl1 = new Cliente("Cecília", "Ionara", "042.701.612-64");
		
		Conta c1 = new Conta(12, 2000.2, cl1);
		
		
		c1.sacar(150.00);
		System.out.println(c1.saldo);
		
		c1.depositar(200.00);
		System.out.println(c1.saldo);
		
		}
}
