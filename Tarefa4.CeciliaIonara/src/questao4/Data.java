package questao4;

public class Data {
	private Integer dia;
	private Integer mes;
	private Integer ano;

	public Data(Integer dia, Integer mes, Integer ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public Boolean validaData() {
		if (ano > 2023) {
			// fevereiro
			if (mes == 2 && dia >= 1 && dia <= 29) {
				return true;
			}

			// meses com 30 dias
			if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia >= 1 && dia <= 30) {
				return true;
			}

			// meses com 31 dias
			if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) 
				&& dia >= 1 && dia <= 31) {
				return true;
			} 
			else {
				return false;
			}
		}
		return false;
	}

	public String toString() {
		return "Data escolhida: " + this.dia + "/" + this.mes + "/" + this.ano;
	}
}
