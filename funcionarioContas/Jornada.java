package funcionarioContas;

public class Jornada implements Funcionario{

	double salarioHora = 50.00;
	int horasTrabalhadas = 5;
	double total = salarioHora * horasTrabalhadas;

	@Override
	public long id() {
		System.out.println(123456l);
		return 0;
	}
	public void nome() {
		System.out.println("Maria Eduarda Santoni");
	}
	public void telefone() {
		System.out.println("32712902");
	}
	public int matricula() {
		System.out.println(0011);
		return 0;
	}
	public void endereco() {
		System.out.println("Rua 1");
	}
	public double calculaSalário() {
		System.out.println(total);
		return 0;
	}
}
