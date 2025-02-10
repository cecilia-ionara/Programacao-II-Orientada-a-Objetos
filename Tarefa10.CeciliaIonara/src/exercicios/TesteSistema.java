package exercicios;

public class TesteSistema {
    public static void main(String[] args) {
        // Criando Universidade
        Universidade universidade = new Universidade("Universidade Federal do Sul e Sudeste do Pará", "UNIFESSPA");
        
        //Criando a faculdade
        universidade.adicionarFaculdade("Faculdade de Computação", "FACOMP");

        // Criando Técnico Administrativo
        Tecnico tecnico = new Tecnico("Carlos Silva", "carlos.silva@email.com", 4000.0, Titulacao.ESPECIALIZACAO);

        // Criando Curso 
        //A FACULDADE FOI CRIADA DENTRO DA UNIVERSIDADE
        //CURSO É CRIADO DENTRO DA FACULDADE, COMO FAÇO ISSO SE ELA NÃO TEM UM NOME DE VARIAVEL
        universidade.adicionarCurso("Sistemas de Informação", 4.0, tecnico);
       
        // Criando Docente
        Docente docente = new Docente("Ana Souza", "ana.souza@email.com", 7000.0, Titulacao.DOUTORADO, "Banco de Dados");

        // Criando Disciplina
        Disciplina disciplina = new Disciplina("Banco de Dados", 60.0);
        
        // Criando Oferta de Disciplina
        OfertaDisciplina ofertaDisciplina = new OfertaDisciplina("Banco de Dados - 2025/1", "2025/1", disciplina, docente);
 
        // Criando Discente (Aluno)
        //CURSO SOFRE A MESMA DUVIDA DE ANTES
        //COMO VOU CHAMAR ELE (VARIAVEL) SE ELE FOI CRIADO DENTRO DE OUTRA CLASSE, É UMA LISTA?
        Matricula matricula = new Matricula(123456, StatusMatricula.ATIVA, curso);
        Discente aluno = new Discente("Maria Oliveira", "maria.oliveira@email.com", matricula, 8.5);
        
        // Adicionando aluno à oferta da disciplina
        ofertaDisciplina.adicionarDiscente(aluno);

        // Impressão para testar os resultados
        System.out.println("===== TESTE DO SISTEMA =====");
        System.out.println("Universidade: " + universidade.getNome() + " (" + universidade.getSigla() + ")");
        System.out.println("Faculdade: " + faculdade.getNome() + " (" + faculdade.getSigla() + ")");
        System.out.println("Curso: " + curso.getNome() + " - Duração: " + curso.getDuracaoTotal() + " anos");
        System.out.println("Secretário Técnico: " + tecnico.getNome() + " - Titulação: " + tecnico.getTitulacao());
        System.out.println("Docente: " + docente.getNome() + " - Área de Atuação: " + docente.getAreaAtuacao());
        System.out.println("Disciplina: " + disciplina.getNome() + " - Carga Horária: " + disciplina.getCargaHoraria() + "h");
        System.out.println("Oferta de Disciplina: " + ofertaDisciplina.getNome() + " - Período: " + ofertaDisciplina.getPeriodo());
        System.out.println("Aluno: " + aluno.getNome() + " - CRG: " + aluno.getCrg());
        System.out.println("Matrícula do aluno: " + aluno.getMatricula().getNumero() + " - Status: " + aluno.getMatricula().getStatus());
    }
}
