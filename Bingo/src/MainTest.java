import java.util.Scanner;
public class MainTest {

	public static void main(String[] args) {
		int[] winNum={4,15,17,23,30,45};
		Drum d1=new Drum();
		
		Ticket t1=new Ticket();
		MainTest.checkWin(t1, winNum);
	}
	public static void checkWin(Ticket t1, int[] winNum){
		int count=0;
		for (int i=0;i<8;i++){
			if (t1.getArrayBlock(i)==winNum){
				count++;
				System.out.println("You WIN "+count);
			}else{
				System.out.println("You have no prize "+count);
			}
		}	
	}
}
