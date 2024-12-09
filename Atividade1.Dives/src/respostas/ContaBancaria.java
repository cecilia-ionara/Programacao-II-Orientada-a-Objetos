package respostas;

public class ContaBancaria {
	private Integer numeroConta;
	public static Integer proximoNumeroConta = 1;
	private Double saldo;
	private String titular;

	public ContaBancaria(Double saldo, String titular) {
		this.numeroConta = proximoNumeroConta;
		this.saldo = saldo;
		this.titular = titular;
		ContaBancaria.proximoNumeroConta += 1;
	}
	
	public Double getSaldo() {
	    return this.saldo;
	}
	
	public String getTitular() {
		return "Titular: " + this.titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public void depositar(Double valor) {
	    if (valor <= 0) {
	        System.out.println("O valor do depósito deve ser positivo.");
	    } else {
	        this.saldo += valor;
	    }
	}

	public void sacar(Double valor) {
	    if (valor <= 0) {
	        System.out.println("O valor do saque deve ser positivo.");
	    } else if (saldo < valor) {
	       System.out.println("Saldo insuficiente.");
	    } else {
	        this.saldo -= valor;
	        System.out.println("Saque realizado!");
	    }
	}
	
	public String exibirDados() {
		return "Número da Conta: " + this.numeroConta +
				"\nTitular: " + this.titular +
				"\nSaldo: " + this.saldo;
	}
}
