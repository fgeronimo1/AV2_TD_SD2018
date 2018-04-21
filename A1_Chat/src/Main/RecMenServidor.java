package Main;

import java.io.InputStream;
import java.util.Scanner;

class RecMenServidor implements Runnable {

	private InputStream servidor;

	public RecMenServidor(InputStream servidor) {
		this.servidor = servidor;
	}

	public void run() {
		try(Scanner s = new Scanner(this.servidor)){
			while (s.hasNextLine()) {
				System.out.println(s.nextLine());
			}
		}
	}
}