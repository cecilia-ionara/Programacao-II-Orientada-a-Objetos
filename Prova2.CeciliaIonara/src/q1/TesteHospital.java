package q1;

import java.time.LocalDate;

public class TesteHospital {
	public static void main(String[] args) {

		Setores s1 = new Setores("Cirúrgico", "CIR001");
		Setores s2 = new Setores("Neonatal", "NEO001");
		Setores s3 = new Setores("Eletrica", "ELE001");

		Medico f1 = new Medico("Carlos Machado", "Rua Maria das Graças", Sexo.MASCULINO, LocalDate.of(2000, 03, 12),
				5689.44, s1, 1232, "Obstetra");

		Funcionario f2 = new Enfermeiro("Luan Leite", "Rua Floriano Peixoto", Sexo.MASCULINO,
				LocalDate.of(1999, 02, 21), 1518.00, s2, 12323424, "Sênior");

		Funcionario f3 = new EquipeManutencao("Mariana Chagas", "Morada Nova", Sexo.FEMININO,
				LocalDate.of(2002, 12, 20), 2400.00, s3, 9349075, 44.00);

		f1.adicionarDependente("Joao", Sexo.FEMININO, LocalDate.of(2020, 8, 30), GrauParentesco.FILHOA);
		f1.adicionarDependente("Maria", Sexo.FEMININO, LocalDate.of(2021, 1, 20), GrauParentesco.FILHOA);
		f1.adicionarDependente("Kaleb", Sexo.FEMININO, LocalDate.of(2022, 3, 12), GrauParentesco.FILHOA);
		f1.adicionarDependente("Cecília", Sexo.FEMININO, LocalDate.of(2005, 12, 24), GrauParentesco.ESPOSOA);

		f2.adicionarDependente("Josue", Sexo.FEMININO, LocalDate.of(2003, 11, 25), GrauParentesco.IRMÃOA);

		f3.adicionarDependente("Vitoria", Sexo.FEMININO, LocalDate.of(1980, 12, 10), GrauParentesco.MÃE);
		f3.adicionarDependente("Juliano", Sexo.FEMININO, LocalDate.of(1974, 5, 2), GrauParentesco.PAI);

		ProcedimentoMedico p1 = new ProcedimentoMedico(s1, "Parto Normal", LocalDate.now(),
				LocalDate.now().plusDays(2));
		ProcedimentoMedico p2 = new ProcedimentoMedico(s2, "Verificar estado do bebê", LocalDate.now(),
				LocalDate.now().plusDays(1));
		ProcedimentoMedico p3 = new ProcedimentoMedico(s1, "Parto Cesária", LocalDate.now(),
				LocalDate.now().plusDays(3));
		ProcedimentoMedico p4 = new ProcedimentoMedico(s2, "Avaliação pós-parto", LocalDate.now(),
				LocalDate.now().plusDays(4));

		System.out.println(f1.realizarProcedimento(p1));
		f1.armazenarCargaHoraria(p1, 12.00);

		System.out.println(f1.realizarProcedimento(p2));
		f1.armazenarCargaHoraria(p2, 1.0);

		System.out.println(f1.realizarProcedimento(p3));
		f1.armazenarCargaHoraria(p3, 10.00);

		System.out.println(f1.realizarProcedimento(p4));
		f1.armazenarCargaHoraria(p4, 2.2);

		System.out.println();
		System.out.println();
		
		System.out.println(f1.toString());
		f1.verCHSemanal();
		System.out.println("Dependentes:" + f1.verDependente(f1));

		System.out.println();

		System.out.println(f2.toString());
		System.out.println("Dependentes:" + f2.verDependente(f2));

		System.out.println();

		System.out.println(f3.toString());
		System.out.println("Dependentes:" + f3.verDependente(f3));

	}
}
