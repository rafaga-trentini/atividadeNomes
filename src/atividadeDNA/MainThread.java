package atividadeDNA;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class MainThread {

	public static void main(String[] args) throws FileNotFoundException, InterruptedException {
		System.out.println("Gerar DNA complementar THREAD");
		long inicio = System.currentTimeMillis();
		Thread minhaThread = new Thread();
		
		for (int i = 0; i <10; i++) {
			minhaThread = new Thread(new atividadeDNAThread(i));
			minhaThread.start();
			
		}
		minhaThread.join();
		long fim = System.currentTimeMillis();
		System.out.println("Tempo decorrido: "+((fim-inicio)));
	}

}
