package com.marcus.main;

import com.marcus.main.SparaLadda;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	// Fields
	private static Elev elev;

	static HashMap<Integer, Elev> elevMap = new HashMap<Integer, Elev>();
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		nyElev("Marcus", 1337);
		nyElev("Emil", 22);

		geElevKurs("Matte", 300, 'A');
		geElevKurs("Kemi", 300, 'A');
		sparaElev();

	}

	public static void nyElev(String namn, int elevNr) {
		elev = new Elev(namn, elevNr);

		Integer newAccountNumber;
		newAccountNumber = (Integer) elevNr;
		System.out.println(newAccountNumber);
		elevMap.put(newAccountNumber, elev);
		System.out.println(elevMap);

	}

	public static void geElevKurs(String kurs, int omfattning, char betyg) {
		Integer val;
		System.out.println("Skriv in elevnr: ");
		val = input.nextInt();

		System.out.println("Valt konto: " + val);
		System.out.println(elevMap.get(val).getElevNamn());
		elevMap.get(val).addKurs(kurs, omfattning, betyg);
		elevMap.get(val).visaKurser();

	}

	public static void sparaElev() {
		Integer val;
		System.out.println("Skriv in vilken elevnr du vill spara: ");
		val = input.nextInt();
		SparaLadda knull = new SparaLadda(elevMap.get(val));

		try {
			knull.sparaElev();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
