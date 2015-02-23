
public class Queue {
	private LinkedList list;
	
	public Queue(){
		list=new LinkedList();
	}
	
	public void push(Object obj){
		list.insertLast(obj);
	}
	
	public Object pop() throws EmptyListException{
		Object obj=list.getFirstObject();
		try {
			list.remove(obj);
		} catch (ObjectNotFoundException e) {
			e.printStackTrace();
		}
		return obj;
	}
	
	public void empty(){
		list=new LinkedList();
	}
	public boolean isEmpty(){
		return list.isEmpty();
	}
	
	public void print(){
		list.print();
	}
}
