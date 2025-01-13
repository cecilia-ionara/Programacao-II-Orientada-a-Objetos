package Aula05;


public class Quadrado {
	private Double lado;
	
	public Quadrado() {
		this.lado = 10.0;
	}
	
	public Quadrado(Double area) {
		if (area>=0)
			this.lado = Math.sqrt(area);
		else throw new RuntimeException("Valor invalido");
	}
	
	public Double getPerimetro() {
		return this.lado * 4;
	}
	
	public Double getArea() {
		return this.lado * this.lado;
	}
	
	public Double getApotema() {
		return this.lado/2;
	}
	
	public Double getLado() {
		return this.lado;
	}
}
