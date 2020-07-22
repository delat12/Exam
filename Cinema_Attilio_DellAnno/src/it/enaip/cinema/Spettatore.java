package it.enaip.cinema;

public class Spettatore {
// idSpettatore, nome, cognome, data nascita e biglietto 
	private String nome, cognome;
	private int biglietto, anno;
	
	public Spettatore(String nome, String cognome, int biglietto, int anno) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.biglietto = biglietto;
		this.anno = anno;
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
	public int getAnno() {
		return anno;
	}
	public void setAnno(int anno) {
		this.anno = anno;
	}
	@Override
	public String toString() {
		return "Spettatore [nome=" + nome + ", cognome=" + cognome + ", biglietto=" + biglietto + ", anno=" + anno
				+ "]";
	}
	
}
