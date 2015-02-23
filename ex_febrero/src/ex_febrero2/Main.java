package ex_febrero2;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Dni dnis= new Dni();
		
		try {
			Dni.appendsDNI("fichero_dni.dat", new Dni("53381650"), new Dni("52451670"));
			Dni.printDnis("fichero_dni.dat");
		} catch (FileNotFoundException e) {
			System.err.println("File wasn't found");
			System.exit(1);
		} catch (IOException e) {
			System.err.println("IO Error");
			System.exit(1);
		}
	}

}
