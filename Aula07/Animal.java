package Aula07;

public class Animal {
//superclassse
//subclasse aponta pra super classe
	
	//protected deixa quem herdar usar as classes
	protected Double peso;
	protected Double idade;
	
	public Animal(Double p, Double i) {
		this.peso = p;
		this.idade = i;
	}
	
	public void corre() {
		System.out.println("Animal correndo");
	}
	
	public Double getPeso() {
		return this.peso;
	}
	
	public Double getIdade() {
		return this.idade;
	}
}
