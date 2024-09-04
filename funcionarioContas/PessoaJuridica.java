package funcionarioContas;

public class PessoaJuridica implements Funcionario{

	double valorBruto = 5000.00;
	int imposto = 200;
	double total = valorBruto - imposto;

	@Override
	public long id() {
		System.out.println(123123l);
		return 0;
	}
	public void nome() {
		System.out.println("João Hélio Queiroz");
	}
	public void telefone() {
		System.out.println("32712945");
	}
	public int matricula() {
		System.out.println(0033);
		return 0;
	}
	public void endereco() {
		System.out.println("Rua 3");
	}
	public double calculaSalário() {
		System.out.println(total);
		return 0;
	}
}
