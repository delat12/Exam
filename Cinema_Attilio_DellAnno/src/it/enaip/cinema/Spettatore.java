package it.enaip.cinema;

public class Spettatore {
// idSpettatore, nome, cognome, data nascita e biglietto 
	private String nome, cognome;
	private int biglietto, età;
	public static Spettatore instance;
	
	private Spettatore(String nome, String cognome, int biglietto, int età) {
		
		this.nome = nome;
		this.cognome = cognome;
		this.biglietto = biglietto;
		this.età = età;
	}
	private Spettatore() {
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public int getBiglietto() {
		return biglietto;
	}
	public void setBiglietto(int biglietto) {
		this.biglietto = biglietto;
	}
	public int getEtà() {
		return età;
	}
	public void setEtà(int età) {
		this.età = età;
	}
	
	public static Spettatore getInstance() {
		if(instance==null) {
		instance = new Spettatore();
	}
	return instance;
	}
	@Override
	public String toString() {
		return "Spettatore [nome=" + nome + ", cognome=" + cognome + ", biglietto=" + biglietto + ", età=" + età + "]";
	}
	
}
