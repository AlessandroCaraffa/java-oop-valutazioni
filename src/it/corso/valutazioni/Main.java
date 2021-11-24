package it.corso.valutazioni;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
//		CalcolaValutazione calc = new CalcolaValutazione(1,35,3);
//		calc.calcolo();

		
		
		CalcolaValutazione[] calc = new CalcolaValutazione[20];
		Random random = new Random();
		
		for (int i = 0 ; i < calc.length ; i++) {
			int percentualeAssenze = random.nextInt(101);
			double mediaVoti = random.nextDouble()*5;
//			System.out.println(mediaVoti);
//			System.out.println(percentualeAssenze);
			
			
			calc[i] = new CalcolaValutazione(i+1,percentualeAssenze,mediaVoti);
			
			System.out.print("Id studente : "+ calc[i].idStudente + " Risultato :" );
			calc[i].calcolo();
		}
		

	}

}
