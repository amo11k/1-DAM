package Ex_febrero3;

import java.lang.Comparable;

public class Pair<T extends Comparable<T>> implements Comparable<Pair<T>> {
	private T element1, element2;

	public Pair(T element1, T element2) {
		this.element1 = element1;
		this.element2 = element2;
	}

	public String toString() {
		return formatPair(element1, element2);
	}
	
	public String formatPair(T e1, T e2){
		return "( " + element1 + " , " + element2 + " )";
	}

	public String toSortedString() {
		int comparation = (this.element1).compareTo(this.element2);

		if (comparation > 0)
			return formatPair(element2, element1);
		else
			return formatPair(element1, element2);
	}

	
	public int compareTo(Pair<T> o) {
		if (((element1.compareTo(o.element1) < 0) && (element1
				.compareTo(o.element2) < 0))
				|| ((element2.compareTo(o.element1) < 0 && element2
						.compareTo(o.element2) < 0))) {
			return -1;
		} else {
			if (((element1.compareTo(o.element1) > 0 && element1
					.compareTo(o.element2) > 0))
					|| ((element2.compareTo(o.element1) > 0 && element2
							.compareTo(o.element2) > 0))) {
				return 1;
			}
		}
		return 0;
	}

}
