package it.enaip.cinema;

import java.util.ArrayList;

public class Film {
// titolo del film, autore, produttore, genere e durata
	private String titolo, autore, produttore, genere;
	private int durata;
	private ArrayList<Film> film ;
	public static Film instance;


	private Film() {

	film = new ArrayList<Film>();

	}

	public Film (String titolo, String autore, String produttore, int durata, String genere) {

	this.titolo = titolo;
	this.autore = autore;
	this.produttore = produttore;
	this.durata = durata;
	this.genere = genere;
	}


	private void filmS() {

	film.add(new Film("Film1", "Frank", "TaoDue", 150, "HORROR"));
	film.add(new Film("Film2", "Joe", "Cecchi Gori", 120, "AZIONE"));
	film.add(new Film("Film3", "Loren", "Columbia Pictures", 180, "AVVENTURA"));
	}

	public void SalaCinematografica() {

	filmS();
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

	public String getProduttore() {
	return produttore;
	}

	public void setProduttore(String produttore) {
	this.produttore = produttore;
	}

	public int getDurata() {
	return durata;
	}

	public void setDurata(int durata) {
	this.durata = durata;
	}

	public String getGenere() {
	return genere;
	}

	public void setGenere(String genere) {
	this.genere = genere;
	}

	public static Film getInstance() {

	if(instance==null) {
	instance = new Film();
	}

	return instance;
	}

	@Override
	public String toString() {
		return "Film [titolo=" + titolo + ", autore=" + autore + ", produttore=" + produttore + ", genere=" + genere
				+ ", durata=" + durata + ", film=" + film + "]";
	}


	}