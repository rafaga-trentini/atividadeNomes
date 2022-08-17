package atividadeNomes;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner lerNome = new Scanner(System.in);
		System.out.print("Informe um nome: ");
		String nome = lerNome.next();
		nome.toLowerCase();
		long inicio = System.currentTimeMillis();
		for (int i = 0; i <10; i++) {
			Scanner in = new Scanner(new FileReader("./arquivosNomes/nomescompletos-0"+i+".txt"));
			int linha = 0;
			while (in.hasNextLine()) {
			    linha++;
				String line = in.nextLine();
			    if (line.toLowerCase().contains(nome)) {
			    	System.out.println("Arquivo: nomescompletos-0"+i+".txt | Linha: "+linha+" | Nome: "+line);
			    }
			}
		}
		long fim = System.currentTimeMillis();
		
		System.out.println("Tempo decorrido: "+((fim-inicio)));
		
	}

}
