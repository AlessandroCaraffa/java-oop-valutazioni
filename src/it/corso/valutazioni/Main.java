package it.corso.valutazioni;

public class Main {

	public static void main(String[] args) {
		CalcolaValutazione calc = new CalcolaValutazione(1,35,3);
		calc.Calcolo();
		System.out.println(calc.bocciato);

	}

}
