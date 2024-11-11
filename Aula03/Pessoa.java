package Aula03;

public class Pessoa {
		public String nome;
		public Integer idade;
		
		public Pessoa(String nome, Integer idade) {
			this.nome = nome;
			this.idade = idade;
		}
		
		public void fazAniversario() {
			this.idade++;
		}
		
		public String toString() {
			return "O seu nome é "+this.nome+" e sua idade é "+this.idade;
		}
}

