package Aula13;

public class Gerente extends Funcionario implements UsuarioSistema {

	public Gerente(String nome, Double salario) {
		super(nome, salario);
	}

	@Override
	public Boolean login(String user, String password) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Double calcularBonificacao() {
		return this.salario * 0.15;
	}
}
