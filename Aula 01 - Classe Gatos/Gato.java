package exemplos;

public class Gato {

	public String nome;
	public Integer qtdComidaDisponivel; //usar int(primitivo) ou Integer(complexo), melhor Integer
	public Boolean sono;
	
	//COSNTRUTOR = usando um metodo para criar gatos de acordo com seus atributos
	//public <class>(tipos e atributos)
	public Gato(String nome, Integer comida, Boolean sono) {
		//this.nome = "Sushi"; //esse se refere a classe dentro dessas chaves SEMPRE USAR THIS
		this.nome = nome;
		this.qtdComidaDisponivel = comida;
		this.sono = sono;
	}
	
	//MÉTODOS, FUNÇÕES,AÇÕES
	//void pq nao retorna nada
	public void miar() {
		System.out.println("Miau!!");
	}
	
	public void comer() {
		this.qtdComidaDisponivel -= this.qtdComidaDisponivel; //tira um quando ele comer
	}
	
	public void dormir() {
		this.sono = false;
	}
}