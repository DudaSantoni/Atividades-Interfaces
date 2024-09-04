package funcionarioContas;

public class Horista implements Funcionario{

	double valorHora = 40.00;
	int quantidadeHoras = 4;
	double total = valorHora * quantidadeHoras;

	@Override
	public long id() {
		System.out.println(123789l);
		return 0;
	}
	public void nome() {
		System.out.println("Gabriella Vieira");
	}
	public void telefone() {
		System.out.println("32712919");
	}
	public int matricula() {
		System.out.println(0022);
		return 0;
	}
	public void endereco() {
		System.out.println("Rua 2");
	}
	public double calculaSalário() {
		System.out.println(total);
		return 0;
	}
}
