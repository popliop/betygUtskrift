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

		laddaElev("22");
		nyElev("Marcus", 1337);

		geElevKurs("Matte", 300, 'A');
		geElevKurs("Kemi", 300, 'A');
		sparaElev();

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

	public static void laddaElev(String fil) throws IOException {

		String tempFil;
		tempFil = "C:\\Users\\Marcus\\Desktop\\" + fil + ".txt";

		FileReader fr = new FileReader(tempFil);
		BufferedReader br = new BufferedReader(fr);

		String line = br.readLine();

		String[] parts = line.split("\t");
		elev = new Elev(parts[0], Integer.valueOf(parts[1]));
		elevMap.put(Integer.valueOf(parts[1]), elev);

		String[] kurser = null;

		while ((line = br.readLine()) != null) {

			kurser = line.split("\t");
			elevMap.get(Integer.valueOf(parts[1])).addKurs(kurser[0], Integer.valueOf(kurser[1]), kurser[2].charAt(0));
		}

		br.close();

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

}
