package questao4;

public class TestaData {
	public static void main(String[] args) {
		Data d1 = new Data(22, 4, 2025);
		Data d2 = new Data(40, 5, 2022);
		Data d3 = new Data(28, 5, 2029);

		System.out.println(d1.validaData());
		System.out.println(d1.toString());
		
		System.out.println("");
		
		System.out.println(d2.validaData());
		System.out.println(d2.toString());
		
		System.out.println("");
		
		System.out.println(d3.validaData());
		System.out.println(d3.toString());

	}
}
