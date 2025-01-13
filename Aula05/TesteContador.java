package Aula05;

public class TesteContador {
	public static void main(String[] args) {
		Contador c1 = new Contador();
		c1.incrementar();
		c1.incrementar();
		c1.incrementar();
		c1.incrementar();
		c1.incrementar();
		System.out.println("c1: Após as operações o valor final é " + c1.getContador());
		
		Contador c2 = new Contador();
		c2.incrementar(); //1
		c2.incrementar(); //2
		c2.decrementar(); //1
		c2.zerar(); //0
		c2.incrementar(); //1
		System.out.println("c2: Após as operações o valor final é " + c2.getContador());
	}
}
