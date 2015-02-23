package Ex_febrero3;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		ArrayList<Pair<String>> list=new ArrayList<Pair<String>>();
		
		list.add(new Pair<String>("uno", "dos"));
		list.add(new Pair<String>("tres", "cuatro"));
		list.add(new Pair<String>("cinco", "seis"));
		list.add(new Pair<String>("siete", "ocho"));
		list.add(new Pair<String>("nueve", "diez"));
		
		System.out.println(list);
		
		Pair<String> prueba = new Pair<>("uno","dos");
		
		System.out.println(prueba.toSortedString());
		
		
		Collections.sort(list);
		System.out.println(list);

	}

}
