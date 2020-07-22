package it.enaip.cinema;

public class Biglietto {
 private int prezzo, posizione;
 public static Biglietto instance;
 
 
private  Biglietto(int prezzo, int posizione) {
	
	this.prezzo = prezzo;
	this.posizione = posizione;
}

private Biglietto() {
	
}
public int getPrezzo() {
	return prezzo;
}

public void setPrezzo(int prezzo) {
	this.prezzo = prezzo;
}

public int getPosizione() {
	return posizione;
}

public void setPosizione(int posizione) {
	this.posizione = posizione;
}

public static Biglietto getInstance() {

	if(instance==null) {
	instance = new Biglietto();
	}

	return instance;
	}

@Override
public String toString() {
	return "Biglietto [prezzo=" + prezzo + ", posizione=" + posizione + "]";
}

}
