package Aula11;

import java.util.List;
import java.util.ArrayList;

public class Desktop extends Computador {
	private Integer tamanhoGabinete;
	private List<Monitor> monitores = new ArrayList<Monitor>();

	public Integer getTamanhoGabinete() {
		return tamanhoGabinete;
	}

	public void setTamanhoGabinete(Integer tamanhoGabinete) {
		this.tamanhoGabinete = tamanhoGabinete;
	}
	
	public List<Monitor> getMonitores() {
		return this.monitores;
	}

	@Override
	public String toString() {
		return "Desktop [tamanhoGabinete=" + tamanhoGabinete + ", monitores=" + monitores + ", toString()="
				+ super.toString() + "]";
	}
	
	
}
