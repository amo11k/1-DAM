
public class Element {
	private Object object;
	private Element next;
	
	public Element(Object newObject) {
		object=newObject;
		next=null;
	}
	public void setNext(Element newNext){
		next=newNext;
	}
	public Element getNext(){
		return next;
	}
	public Object getObject(){
		return object;
	}
	public void setObject(Object newObject){
		object=newObject;
	}
	public void delete(){
		object=null;
		next=null;
	}
	public String toString(){
		return object.toString();
	}

}
