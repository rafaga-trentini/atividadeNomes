package atividadesNomesThread;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, InterruptedException {
		Scanner lerNome = new Scanner(System.in);
		System.out.print("Informe um nome: ");
		String nome = lerNome.next();
		nome.toLowerCase();
		long inicio = System.currentTimeMillis();
		Thread minhaThread = new Thread();
		for (int i = 0; i <10; i++) {
			minhaThread = new Thread(new MinhaThread(nome, i));
			minhaThread.start();
			
		}
		minhaThread.join();
		long fim = System.currentTimeMillis();
		System.out.println("Tempo decorrido: "+((fim-inicio)));
	}

}
