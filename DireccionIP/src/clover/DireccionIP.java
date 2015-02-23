package clover;

public class DireccionIP {
	int a,b,c,d;
	
	public DireccionIP(int a, int b, int c, int d){
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
	}
	
	public String clase(){
		String s = null;
		if (a<0||a>=224){
			s= "IP invalida";
		}else if((a>=0)&&(a<128)){
			s="La IP es clase A";
		}else if((a>=128)&&(a<192)){
			s="La IP es clase B";
		}else if((a>=192)&&(a<224)){
			s="La IP es clase C";
						}
		return s;
	}
}
