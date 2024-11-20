//A. Construtor que inicialize o código, o nome e a dimensão do país;
//B. Um método que permita verificar se dois objetos representam o 
//mesmo país (igualdade semântica). Dois países são iguais se tiverem 
//o mesmo código;
//C. Um método que informe se outro país é limítrofe de outro país;
//D. Um método que retorne a densidade populacional do país;
//E. Um método que receba um país como parâmetro e retorne a lista 
//de vizinhos comuns aos dois países.
package Tarefa3;

import java.util.ArrayList;
import java.util.List;

public class Pais {
	public String codigo;
	public String nome;
	public Double populacao;
	public Double dimensao;
	public List<Pais> fronteiras;

	public Pais(String codigo, String nome, Double populacao, Double dimensao) {
		this.codigo = codigo;
		this.nome = nome;
		this.populacao = populacao;
		this.dimensao = dimensao;
		this.fronteiras = new ArrayList<>();
	}

	// igualdade semântica
	public boolean eMesmoPais(Pais outro) {
		return this.codigo.equals(outro.codigo);
	}

	public boolean eLimitrofe(Pais outro) {
		return this.fronteiras.contains(outro);
		// vê se o país está na lista de fronteiras
	}

	public double densidadePopulacional() {
		if (dimensao > 0) {
			return this.populacao / this.dimensao;
			// Densidade = população / dimensão
		}
		return 0;
	}

	public List<Pais> vizinhosComuns(Pais outro) {
		List<Pais> comuns = new ArrayList<>();
		for (Pais pais : this.fronteiras) {
			if (outro.fronteiras.contains(pais)) {
				comuns.add(pais);
				// add o país à lista se estiver nas duas fronteiras
			}
		}
		return comuns;
	}

	public void adicionarFronteira(Pais pais) {
		if (!this.fronteiras.contains(pais) && !pais.equals(this)) {
			this.fronteiras.add(pais); 
			// Adiciona o país se ainda não estiver na lista
		}
	}

	public String toString() {
		return "Pais{" + "codigo='" + codigo + '\'' + ", nome='" + nome + '\'' + ", dimensao=" + dimensao
				+ ", populacao=" + populacao + '}';
	}

}
