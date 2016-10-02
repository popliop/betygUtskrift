package com.marcus.main;

public class Kurs {

	private String kurs;
	private int omfattning;
	private char betyg;

	public Kurs(String kurs, int omfattning, char betyg) {
		this.kurs = kurs;
		this.omfattning = omfattning;
		this.betyg = betyg;

	}

	@Override
	public String toString() {
		return "Ämne: " + kurs + ". Poäng: " + omfattning + ". Betyg: " + betyg;

	}

}
