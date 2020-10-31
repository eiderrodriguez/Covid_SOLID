package isp;

public class Aplikazioa {

	public static void main(String[] args) {
		Pertsona p = new  Pertsona("Fernando", 66);
		Pertsona p1 = new  Pertsona("Fernandito", 22);
		CalcIncrement c = new CalcIncrement();
		System.out.println(c.calculateIncrementPerYear(p, 40));
		System.out.println(c.calculateIncrementPerYear(p1, 40));
	}
}