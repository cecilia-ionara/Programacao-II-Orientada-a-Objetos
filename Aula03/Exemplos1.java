//usando input
package Aula03;

import java.util.Scanner;

public class Exemplos1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o nome da pessoa: ");
		String nome = sc.next();
		
		System.out.println("Informe a idade da pessoa: ");
		Integer idade = sc.nextInt();
		
		Pessoa p = new Pessoa(nome, idade);
		
		Porta p1 = new Porta(2.3,4.3,3.4);
		p1.abrir();
		p1.fechar();
		p1.pintar(Cor.AZUL);
		System.out.println(p1);
		
		Casa c1 = new Casa(p);
		System.out.println(c1);

		
		sc.close();
	}
}
