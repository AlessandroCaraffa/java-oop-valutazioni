package it.corso.valutazioni;

public class CalcolaValutazione {
	int idStudente;
	int percentualeAssenze;
	double mediaVoti;
	
	
	CalcolaValutazione(int idStudente ,int percentualeAssenze, double mediaVoti) {
		
		this.idStudente = idStudente;
		this.percentualeAssenze = percentualeAssenze;
		this.mediaVoti = mediaVoti;
		}
	
	void calcolo () {
		if (percentualeAssenze > 50) {
			System.out.println("Bocciato");
			
			
		}else if(percentualeAssenze > 25  && mediaVoti <= 2) {
			System.out.println("Bocciato");
		}else if (mediaVoti <2) {
			System.out.println("Bocciato");
			
		}else {
			System.out.println("Promosso");
		}
	}
	

}
