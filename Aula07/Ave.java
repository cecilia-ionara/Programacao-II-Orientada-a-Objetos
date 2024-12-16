package Aula07;

public class Ave extends Animal{
	//subclass de Animal
	//o construtor precisa estar aqui tb
	
	public Ave(Double peso, Double idade) {
		super(peso, idade); //chama o construtor da superclasse
	}
	
	public void imprimirDadosAve(){
		System.out.println("Peso: " + this.peso+
							"\nIdade: "+ this.idade);
	}
	
	public void voa() {
		System.out.println("Voando uaaa");
	}
}
	