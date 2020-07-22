package it.enaip.cinema;

public class Film extends SalaCinematografica {
// titolo del film, autore, produttore, genere e durata
	private String titolo, autore, genere, duata;

	public Film(String titolo, String autore, String genere, String duata) {
		super();
		this.titolo = titolo;
		this.autore = autore;
		this.genere = genere;
		this.duata = duata;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	public String getDuata() {
		return duata;
	}

	public void setDuata(String duata) {
		this.duata = duata;
	}

	@Override
	public String toString() {
		return "Film [titolo=" + titolo + ", autore=" + autore + ", genere=" + genere + ", duata=" + duata + "]";
	}
	
}
