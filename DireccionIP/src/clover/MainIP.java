package clover;

public class MainIP {

	public static void main(String[] args) {
		
		DireccionIP ip=new DireccionIP(192,168,1,10);
		System.out.println(ip.clase());
		DireccionIP ip2=new DireccionIP(127,168,1,10);
		System.out.println(ip2.clase());
		DireccionIP ip3=new DireccionIP(128,168,1,10);
		System.out.println(ip3.clase());
		DireccionIP ip4=new DireccionIP(129,168,1,10);
		System.out.println(ip4.clase());
		DireccionIP ip5=new DireccionIP(256,168,1,10);
		System.out.println(ip5.clase());

  	}

}
