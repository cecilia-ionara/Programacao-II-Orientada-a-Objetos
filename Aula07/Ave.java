package Aula07;

public class Ave extends Animal{
	//subclass de Animal
	//o construtor precisa estar aqui tb
	
	public Ave(Double peso) {
		super(peso); //chama o construtor da superclasse
	}
	
	public void imprimirDadosAve(){
		System.out.println("Peso: " + this.peso+
							"Idade: "+ this.idade);
	}
	
	public void voa() {
		System.out.println("Voando uaaa");
	}
}
	