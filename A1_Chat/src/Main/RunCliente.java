package Main;

import java.io.IOException;
import java.net.UnknownHostException;

public class RunCliente {
	public static void main(String[] args) 
			throws UnknownHostException,	IOException {
		new Cliente("127.0.0.1", 2018).executa();
	}
}
