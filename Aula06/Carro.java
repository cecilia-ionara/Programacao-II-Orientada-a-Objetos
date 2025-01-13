package Aula06;

public class Carro {
	private String modelo;
	private static Integer contador = 0;
	
	public Carro(String m) {
		this.modelo = m;
		Carro.contador += 1;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public void setModelo(String m) {
		this.modelo = m;
	}
	
	public static Integer getContador() {
		return Carro.contador;
	}
	
	
}
