package atividadesNomesThread;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class MinhaThread implements Runnable{
	
	String nome;
	int i;
	
	public MinhaThread(String nome, int i) {
		this.nome = nome;
		this.i = i;
	}
	
	@Override
	public void run() {
		Scanner in;
		try {
			in = new Scanner(new FileReader("./arquivosNomes/nomescompletos-0"+this.i+".txt"));
			int linha = 0;
			while (in.hasNextLine()) {
			    linha++;
				String line = in.nextLine();
			    if (line.toLowerCase().contains(this.nome)) {
			    	System.out.println("Arquivo: nomescompletos-0"+this.i+".txt | Linha: "+linha+" | Nome: "+line);
			    }
			}
			Thread.currentThread();
			Thread.yield();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	

	
}
