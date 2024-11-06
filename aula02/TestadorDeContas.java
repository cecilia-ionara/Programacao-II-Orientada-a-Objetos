package aula02;

public class TestadorDeContas {
	public static void main(String[] args) {
		
		Cliente cl1 = new Cliente("Cecília", "Ionara", "042.701.612-64");
		
		Conta c1 = new Conta(1200, 2000.2, cl1);
		
		Cliente cl2 = new Cliente("Maria", "Alice", "042.701.612-64");
		
		Conta c2 = new Conta(1000, 2000.2, cl2);
		
		
		c2.transfere(100.0, c1);
		
		System.out.print("Saldo C1: " + c1.saldo);
		System.out.print("Limite C1: " + c1.limite);
		
		System.out.print("Saldo C2: " + c2.saldo);
		System.out.print("Limite C2: " + c2.limite);
		}
}
