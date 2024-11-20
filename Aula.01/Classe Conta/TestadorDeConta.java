package exemplos;

public class TestadorDeConta {
	public static void main(String[] args) {
		
		Conta c1 = new Conta(1234, 1000.50, 2000.2, "Cecília"); //usando construtor metodos
		
		c1.sacar(150.00);
		System.out.println(c1.saldo);
		
		c1.depositar(200.00);
		System.out.println(c1.saldo);
		}
}
