package calculos;

public class Calculando implements Calculos{

	int num1 = 8;
	int num2 = 7;

	@Override
	public double somar() {
		System.out.println(num1+num2);
		return 0;
	}
	@Override
	public double sub() {
		System.out.println(num1+num2);
		return 0;
	}
	@Override
	public double multi() {
		System.out.println(num1*num2);
		return 0;
	}
	@Override
	public int div() {
		System.out.println(num1/num2);
		return 0;
	}
	@Override
	public int exp() {
		System.out.println(Math.pow(num1, num2));
		return 0;
	}
}
