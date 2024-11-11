//questao 2
package atividades;

public class Conta {
	
	    public String titular;    
	    public Integer numero;
	    public String agencia;
	    public Double saldo;
	    public Data dataAbertura;
	    
		public void sacar(Double valor) {
	        if (valor > 0 && valor <= saldo) {
	            saldo -= valor;
	            System.out.println("Saque de R$" + valor + " realizado.");
	        } else {
	            System.out.println("Saque nao foi possivel. Confirme o valor inserido.");
	        }
	    }

	    public void depositar(Double valor) {
	        if (valor > 0) {
	            saldo += valor;
	            System.out.println("O deposito de R$" + valor + " foi confirmado.");
	        } else {
	            System.out.println("Deposito nao foi possivel. O valor deve ser positivo.");
	        }
	    }

	    public double calculaRendimento() {
	        return saldo * 0.1;
	    }
	    
	    public String recuperaDadosParaImpressao() {
	        return "Nome do titular: " + titular + "\n" +
	               "Numero da conta: " + numero + "\n" +
	               "Agencia: " + agencia + "\n" +
	               "Saldo: R$" + saldo + "\n" +
	               "Data de abertura: " + dataAbertura.formatarData() + "\n" +
	               "Rendimento esperado: R$" + calculaRendimento();
	    }
}
