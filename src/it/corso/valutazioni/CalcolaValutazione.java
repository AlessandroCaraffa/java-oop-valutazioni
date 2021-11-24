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
	
	boolean promosso () {
		if (percentualeAssenze > 50) {
			return  false;
			
			
		}else if(percentualeAssenze > 25  && mediaVoti <= 2) {
			return  false;
		}else if (mediaVoti <2) {
			return  false;
			
		}else {
			return  true;
		}
	}
	

}
