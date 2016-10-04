package com.marcus.main;

import com.marcus.main.Elev;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SparaLadda {
	private Elev elev;

	public SparaLadda(Elev elev) {
		this.elev = elev;
	}

	// Fields

	public void sparaElev() throws IOException {

		String fil = ".\\src\\com\\marcus\\saves\\" + elev.getElevnr() + ".txt";

		FileWriter fw = new FileWriter(fil);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter utfil = new PrintWriter(bw);

		utfil.println(elev.getElevNamn() + "\t" + elev.getElevnr());

		for (Kurs object : elev.getKursLista()) {

			utfil.println(object.toStringFil());

		}

		utfil.close();

	}

	public static Elev laddaElev(String fil) throws IOException {

		String tempFil;
		tempFil = ".\\src\\com\\marcus\\saves\\" + fil + ".txt";

		FileReader fr = new FileReader(tempFil);
		BufferedReader br = new BufferedReader(fr);

		String line = br.readLine();

		String[] parts = line.split("\t");
		Elev elev = new Elev(parts[0], Integer.valueOf(parts[1]));

		String[] kurser = null;

		while ((line = br.readLine()) != null) {

			kurser = line.split("\t");
			// elevMap.get(Integer.valueOf(parts[1])).addKurs(kurser[0],
			// Integer.valueOf(kurser[1]), kurser[2].charAt(0));
			elev.addKurs(kurser[0], Integer.valueOf(kurser[1]), kurser[2].charAt(0));
		}

		br.close();
		return elev;
	}

}
