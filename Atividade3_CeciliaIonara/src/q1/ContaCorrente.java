package q1;

import exercicio_20250115.Conta;

public class ContaCorrente extends Conta {
	protected Double limite;
	private static Double limiteMaximo = 200.00;

	public ContaCorrente(String t, Double s) {
		super(t, s);
		this.limite = ContaCorrente.limiteMaximo;
	}

	public Double getLimite() {
		return limite;
	}

	public void setLimite(Double limite) {
		this.limite = limite;
	}

	@Override
	public void sacar(Double valor) {
		if (valor <= this.saldo + this.limite) {
			// dá pra sacar e ai faz condições pra tirar do saldo e do limite ou so do saldo
			// mesma logica do deposito so que ao inves de adicionar vai sacar
			if (valor <= this.saldo) {
				this.saldo -= valor;
			} else {
				Double diferenca = this.saldo - valor;
				// consertar para que o saldo perca uma parte e o limite perca outro
				this.saldo -= diferenca;
				this.limite -= diferenca;
			}
		} else
			throw new RuntimeException("Saldo Insuficiente");
	}

	@Override
	public void depositar(Double valor) {
		if (this.limite < ContaCorrente.limiteMaximo) {
			this.limite += valor;
			if (this.limite > ContaCorrente.limiteMaximo) {
				Double diferenca = this.limite - ContaCorrente.limiteMaximo;
				this.saldo += diferenca; // limite volta a ser 200 e o saldo ganha a "sobra"
				this.limite -= diferenca;
			}
		} else if (this.limite < ) {
			
		} else {
			//limite esta cheio 
			this.saldo += valor;
		}
	}

	@Override
	public String toString() {
		return "ContaCorrente [limite=" + limite + ", titular=" + titular + ", saldo=" + saldo + "]";
	}

}
