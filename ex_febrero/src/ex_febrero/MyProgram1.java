package ex_febrero;

import java.io.*;
import java.util.ArrayList;

public class MyProgram1 {

	public static void main(String[] args) throws IOException {

		File original = new File(args[0]);
		File tempFile = new File("temporal");
		tempFile.createNewFile();

		BufferedReader reader = new BufferedReader(new FileReader(args[0]));
		PrintWriter writer = new PrintWriter(new FileWriter("temporal"));

		ArrayList<String> list = new ArrayList<>();

		try {
			String line;
			while ((line = reader.readLine()) != null) {
				list.add(line);
			}

			for (int i = 0; i < list.size(); i++) {
				writer.println(list.get((list.size() - 1) - i));
			}
		} finally {
			reader.close();
			writer.close();
			original.delete();
			tempFile.renameTo(original);
		}

	}

}
