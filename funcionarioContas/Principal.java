package funcionarioContas;

public class Principal {
	public static void main(String[] args) {

		Jornada jor = new Jornada();
		System.out.println("Dados do Fun Jornada");
		jor.id();
		jor.nome();
		jor.telefone();
		jor.matricula();
		jor.endereco();

		Horista hor = new Horista();
		System.out.println("Dados do Fun Horista");
		hor.id();
		hor.nome();
		hor.telefone();
		hor.matricula();
		hor.endereco();

		PessoaJuridica pes = new PessoaJuridica();
		System.out.println("Dados Fun Pessoa Juridica");
		pes.id();
		pes.nome();
		pes.telefone();
		pes.matricula();
		pes.endereco();
	}
}