package atividadesNomesThread;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner lerNome = new Scanner(System.in);
		System.out.print("Informe um nome: ");
		String nome = lerNome.next();
		nome.toLowerCase();
		for (int i = 0; i <10; i++) {
			new Thread(new MinhaThread(nome, i)).start();
		}
		
	}

}
