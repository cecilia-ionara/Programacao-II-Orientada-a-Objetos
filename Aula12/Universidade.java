package Aula12;

import java.util.ArrayList;

public class Universidade {
	private String nome;
	private ArrayList<Departamento> departamentos;
	
	public Universidade(String nome) {
		this.nome = nome;
		this.departamentos = new ArrayList<Departamento>();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<Departamento> getDepartamentos() {
		return departamentos;
	}
	public void setDepartamentos(ArrayList<Departamento> departamentos) {
		this.departamentos = departamentos;
	}
	//como é uma composicao o new departamento é criado aqui dentro, sendo assim totalmente dependente da Universidade
	//COMPOSICAO indica onde o new vai ser criado, onde a seta preta aponta
	public void adicionaDepartamento(String nome) {
		this.departamentos.add( new Departamento(nome));
	}
	
	@Override
	public String toString() {
		return "nome=" + nome + ",\ndepartamentos=" + departamentos;
	}
	
	
}
