package net.rubenamoros.primitiva;

public class Drum {
	private static final int NUM_BALLS=48;
	private static boolean[] avaiableBalls=new boolean[NUM_BALLS];
	private static int[] balls=new int[NUM_BALLS];
	
	
	public Drum(){
		for (int i=0;i<balls.length;i++){
			balls[i]=i+1;
			avaiableBalls[i]=true;
		}
		int temp;
		for (int i=0;i<balls.length;i++){
			int rIndex=(int) (Math.random()*balls.length-1);
			temp=balls[rIndex];
			balls[rIndex]=balls[i];
			balls[i]=temp;
		}
	}
	public String toString(){
		String s="";
		for (int i=0;i<balls.length;i++){
			s+=""+balls[i]+", ";
		}
		return s;
	}
	public int getBall(int x){
		return balls[x];
	}
	public static int extractBall(){
		int ball=0;
		do {
			ball=(int) (Math.random()*NUM_BALLS);
		}while (avaiableBalls[ball]!=true);
			
		avaiableBalls[ball]=false;
		ball=balls[ball];
		return ball;
	}
	
}
