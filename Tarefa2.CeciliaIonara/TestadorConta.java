//questao 4
package atividades;

public class TestadorConta {
	public static void main(String[] args) {
	      
        Conta c1 = new Conta();
        c1.titular = "Cecilia";
        c1.numero = 1126288;
        c1.saldo = 1560.00;
        c1.agencia = "05657";
        c1.dataAbertura = new Data(8, 11, 2024);
        
        c1.sacar(50.0);
        System.out.println("Saldo apos saque: R$" + c1.saldo);
        
        c1.depositar(500.0);
        System.out.println("Saldo apos deposito: R$" + c1.saldo);

        double rendimento = c1.calculaRendimento();
        System.out.println("Rendimento calculado: R$" + rendimento);
               
        System.out.println(c1.recuperaDadosParaImpressao());
        
        Conta c2 = new Conta();
        c2.titular = "Maria Alice";
        c2.saldo = 1500.88;
        
     	c1 = c2;
        
        if (c1 == c2) {
        	System.out.println("Iguais");
        	
        } else {
        	System.out.println("Diferentes");
        }
    }

}
