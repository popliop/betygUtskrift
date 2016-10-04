package com.marcus.main;

import com.marcus.main.SparaLadda;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	// Fields
	private static Elev elev;

	static HashMap<Integer, Elev> elevMap = new HashMap<Integer, Elev>();
	static Scanner input = new Scanner(System.in);
	

	public static void main(String[] args) throws IOException {
		// init();
		System.out.println("test2");
		laddaElev("11");
		nyElev("Marcus", 22);

		geElevKurs("Matte", 300, 'A');
		geElevKurs("Kemi", 300, 'A');
		sparaElev();

	}

	// Starta fönster
	public static void init() {
		MainFrame frame = new MainFrame();
		frame.setVisible(true);
		frame.setTitle("Elev Hantantare");
		frame.setLocationRelativeTo(null);
	}

	public static void nyElev(String namn, int elevNr) {
		elev = new Elev(namn, elevNr);

		Integer newAccountNumber;
		newAccountNumber = (Integer) elevNr;

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

	}

	public static void sparaElev() {
		Integer val;
		System.out.println("Skriv in vilket elevnr du vill spara: ");
		val = input.nextInt();
		SparaLadda knull = new SparaLadda(elevMap.get(val));

		try {
			knull.sparaElev();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void laddaElev(String fil) {
		try {
			elevMap.put(Integer.valueOf(fil), SparaLadda.laddaElev(fil));

		} catch (IOException e) {
			System.err.println("Cant find file");
			e.printStackTrace();
		}
	}

}
