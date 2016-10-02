package com.marcus.main;

public class Kurs {

	private String kurs;
	private int omfattning;
	private char betyg;
	private int totalt;

	public Kurs(String kurs, int omfattning, char betyg) {
		this.kurs = kurs;
		this.omfattning = omfattning;
		this.betyg = betyg;

	}

	public void totalCounter() {

		switch (betyg)

		{

		case 'A':
			totalt += 20;
			break;
		case 'B':
			totalt += 15;
			break;
		case 'C':
			totalt += 10;
		default:
			break;
		}

	}

	public int getTotal() {
		return totalt;
	}

	@Override
	public String toString() {
		return "Ämne: " + kurs + ". Poäng: " + omfattning + ". Betyg: " + betyg;

	}

	public String toStringFil() {

		return kurs + "\t" + omfattning + "\t" + betyg;
	}

}
