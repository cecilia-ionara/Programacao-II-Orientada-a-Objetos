package exemplos;

public class TestadorDeGatos {
	public static void main(String[] args) {
		Gato g1 = new Gato("Sushi", 3, true); //usando construtor metodos
		//SE USAR METODO = nao precisa fazer um por um
		//g1.nome = "Sushi";
		//g1.qtdComidaDisponivel = 3;
		//g1.sono = true;
		
		System.out.println("Nome: " + g1.nome);
		System.out.println("Comida: " + g1.qtdComidaDisponivel);
		System.out.println("Sono: " + g1.sono);
		
		Gato g2 = new Gato("Drácula", 2, true);
		
		System.out.println("Nome: " + g2.nome);
		System.out.println("Comida: " + g2.qtdComidaDisponivel);
		System.out.println("Sono: " + g2.sono);
	}
}
