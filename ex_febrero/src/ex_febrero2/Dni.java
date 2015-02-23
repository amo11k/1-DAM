package ex_febrero2;

import java.io.*;

public class Dni implements Serializable {
	
	private static final long serialVersionUID = 416590215438383514L;
	private int number;
	private char letter;
	private static final char[] letters = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y',
			'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L',
			'C', 'K', 'E' };

	public Dni() {
		number = 0;
		letter = letters[0];
	}

	public Dni(int newNumber) {
		number = Math.abs(newNumber);
		letter = letters[number % 23];
	}

	public Dni(int newNumber, char newLetter) {
		number = Math.abs(newNumber);
		letter = letters[number % 23];
		System.out.println("Letra mayuscula: "
				+ Character.toUpperCase(newLetter));
		if (Character.toUpperCase(newLetter) != letter) {
			number = -number;
		}
	}

	public Dni(String s) {
		char c = s.charAt(s.length() - 1);
		String newS = s.replaceAll("[^0-9]", "");
		number = Integer.parseInt(newS);
		letter = letters[number % 23];
		if (Character.toUpperCase(c) != letter) {
			number = -number;
		}
	}

	public boolean isDniCorrect() {
		if (number < 0)
			return false;
		else
			return true;
	}

	public int getNumber() {
		return number;
	}

	public char getLetter() {
		return letter;
	}

	public void setNumber(int newNumber) {
		number = newNumber;
		letter = letters[number % 23];
	}

	public String toString() {
		return number + Character.toString(letter);
	}

	public String toFormattedString() {
		StringBuilder s = new StringBuilder(String.valueOf(number));
		if (number > 999) {
			s.insert(s.length() - 3, '.');
		}
		if (number > 999999) {
			s.insert(s.length() - 7, '.');
		}
		if (number > 999999999) {
			s.insert(s.length() - 11, '.');
		}
		return s.toString() + "-" + letter;
	}

	public static void appendsDNI(String fileName, Dni... dnis)
			throws IOException {

		File fileDNI = new File(fileName);
		fileDNI.createNewFile();
		ObjectOutputStream writer = new ObjectOutputStream(
				new BufferedOutputStream(new FileOutputStream(fileName)));
		try {
			for (int i = 0; i < dnis.length; i++) {
				writer.writeObject(dnis[i]);
			}
		} finally {
			if (writer != null)
				writer.close();
		}
	}

	public static void printDnis(String fileName) throws IOException,
			ClassNotFoundException {
		ObjectInputStream reader = new ObjectInputStream(
				new BufferedInputStream(new FileInputStream(fileName)));
		try {
			while (true) {
				Dni dni = (Dni) reader.readObject();
				System.out.println(dni.toFormattedString());
			}

		} catch (ClassNotFoundException e) {
			throw new IOException();
		} catch (EOFException e) {
			throw new IOException();
		} finally {
			if (reader != null)
				reader.close();
		}
	}
}
