package it.enaip.cinema;

import java.util.ArrayList;

public class SalaCinematografica {
	ArrayList<Spettatore> spettatore, spettLista;
	Film fm;
	private ArrayList<SalaCinematografica> saleC ;
	
	
	public static SalaCinematografica instance;

	private SalaCinematografica() {
	}
	
	private void saleC() {

		saleC.add(new SalaCinematografica());
		saleC.add(new SalaCinematografica());
		saleC.add(new SalaCinematografica());
		}



	public static SalaCinematografica getInstance() {

		if (instance == null) {

			instance = new SalaCinematografica();

		}

		return instance;
	}

}


