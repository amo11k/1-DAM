public class Main {
	public static void main(String[] args) {

		LinkedList l = new LinkedList();
		String s = "Ruben Amoros";
		l.insertLast("1");
		l.insertLast(s);
		l.insertLast("2");
		l.insertLast("3");
		l.insertLast("4");
		l.print();
		try {
			l.remove(s);
		} catch (EmptyListException e) {
			System.out.println("The lis were empty");
		} catch (ObjectNotFoundException e) {
			System.out.println("Object not found");			
		}
		l.print();
		System.out.println("Number of elements: "+l.getNumElements());

	}

}
