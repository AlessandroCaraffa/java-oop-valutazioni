package it.corso.valutazioni;

public class CalcolaValutazione {
	int idStudente;
	int percentualeAssenze;
	double mediaVoti;
	boolean bocciato;
	
	CalcolaValutazione(int idStudente ,int percentualeAssenze, double mediaVoti) {
		bocciato = false;
		this.idStudente = idStudente;
		this.percentualeAssenze = percentualeAssenze;
		this.mediaVoti = mediaVoti;
		}
	
	void Calcolo () {
		if (percentualeAssenze > 50) {
			bocciato = true;
		}else if(percentualeAssenze > 25  && mediaVoti < 2) {
			bocciato = true;
		}else {
			bocciato = false;
		}
	}
	

}
