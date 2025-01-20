package Aula11;

import java.util.List;

public class Desktop extends Computador {
	private Integer tamanhoGabinete;
	private List<Monitor> monitores;

	public Integer getTamanhoGabinete() {
		return tamanhoGabinete;
	}

	public void setTamanhoGabinete(Integer tamanhoGabinete) {
		this.tamanhoGabinete = tamanhoGabinete;
	}
	
}
