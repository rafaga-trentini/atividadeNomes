package atividadeDNA;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atividadeDNAThread implements Runnable{
	
	int i;
	
	public atividadeDNAThread(int i) {
		this.i = i;
	}
	
	@Override
	public void run() {
		Scanner in;
		FileWriter arq;
		try {
			in = new Scanner(new FileReader("./arquivosDNA/dna-"+i+".txt"));			
			arq = new FileWriter("./arquivosDNAComplemetar/dnaComplementar-"+i+".txt");
			PrintWriter gravarArq = new PrintWriter(arq);
			while (in.hasNextLine()) {
			   
			   List<String> dnaComplementar = new ArrayList<String>();
			   
			   String line = in.nextLine();
			   line.toCharArray();
			   for (int j=0; j<= line.length()-1; j++) {
				   String dna = String.valueOf(line.charAt(j));
				   if ( dna.equalsIgnoreCase("A")) {
					   dnaComplementar.add("T");
				   } else if (dna.equalsIgnoreCase("T")) {
					   dnaComplementar.add("A");
				   } else if (dna.equalsIgnoreCase("C")) {
					   dnaComplementar.add("G");
				   } else if (dna.equalsIgnoreCase("G")) {
					   dnaComplementar.add("C");
				   }
			   }
			   String resultadoDnaComplementar = "";
			   resultadoDnaComplementar = String.join(resultadoDnaComplementar, dnaComplementar);
			   gravarArq.print(resultadoDnaComplementar+"\n");
			}
			arq.close();
			
			Thread.currentThread();
			Thread.yield();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	

	
}
