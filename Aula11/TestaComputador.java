package Aula11;

public class TestaComputador {

	public static void main(String[] args) {

		Computador c1 = new Notebook();
		Desktop c2 = new Desktop();
			
		Monitor m1 = new Monitor();
		Monitor m2 = new Monitor();
		Monitor m3 = new Monitor();

		c2.getMonitores().add(m1); //adiciona na lista usando get para acessar pois é privado
		c2.getMonitores().add(m2);

		//falta criar a lista de monitor, estudar listas new arraylist list etc
	}

}
