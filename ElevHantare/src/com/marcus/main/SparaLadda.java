package com.marcus.main;

import com.marcus.main.Elev;
import java.io.BufferedWriter;
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

		String fil = "C:\\Users\\Marcus\\Desktop\\"+ elev.getElevnr() + ".txt";

		FileWriter fw = new FileWriter(fil);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter utfil = new PrintWriter(bw);

		utfil.println(elev.getElevNamn() + "\t" + elev.getElevnr());

		for (Kurs object : elev.getKursLista()) {

			utfil.println(object.toStringFil());

		}

		utfil.close();

	}
	
	

}
