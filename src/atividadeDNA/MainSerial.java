package atividadeDNA;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainSerial {

	public static void main(String[] args) throws IOException {
		System.out.println("Gerar DNA complementar SERIAL");
		
		long inicio = System.currentTimeMillis();
		for (int i = 0; i <10; i++) {
			Scanner in = new Scanner(new FileReader("./arquivosDNA/dna-"+i+".txt"));			
			FileWriter arq = new FileWriter("./arquivosDNAComplemetar/dnaComplementar-"+i+".txt");
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
			
		}
		long fim = System.currentTimeMillis();
		
		System.out.println("Tempo decorrido: "+((fim-inicio)));
		
	}

}
