package com.marcus.main;

import java.util.ArrayList;

public class Elev {

	// Fields
	private int elevnr;
	private String namn;

	public ArrayList<Kurs> kurslista = new ArrayList<Kurs>();

	public Elev(String namn, int elevnr) {
		this.namn = namn;
		this.elevnr = elevnr;

	}

	public void addKurs(String kurs, int omfattning, char betyg) {

		Kurs nyKurs = new Kurs(kurs, omfattning, betyg);
		kurslista.add(nyKurs);
	}

	public void visaKurser() {

		for (int i = 0; i < kurslista.size(); i++) {
			System.out.println(kurslista.get(i));
		}
	}

	// Getters setters

	public int getElevnr() {
		return elevnr;
	}

	public ArrayList<Kurs> getKursLista() {
		return kurslista;
	}

	public String getElevNamn() {
		return namn;
	}
	
	@Override
	public String toString(){
		return namn + " " + elevnr;
	}

}
