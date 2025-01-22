package q1;

import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe o numero de portas do carro: ");
		Integer numeroDePortas = leitor.nextInt();
		
		System.out.println("Informe a capacidade do carro: ");
		Integer capacidade = leitor.nextInt();
		
		System.out.println("Informe o numero de rodas do carro: ");
		Integer numeroDeRodas = leitor.nextInt();
		
		System.out.println("Informe a placa do carro: ");
		String placa = leitor.next();
		
		System.out.println("Informe a cor do carro: ");
		String cor = leitor.next();
		
		leitor.close();
		
		Automovel t1 = new Automovel(numeroDePortas, numeroDeRodas, 
				cor, placa, capacidade);
		
		System.out.println(t1);
	}
}
