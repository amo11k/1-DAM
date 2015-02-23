//AMO11k
import java.util.Scanner;
public class BattleShip {
	public static void main(String[] args) {
		String r;
		String s;
		char c;
		int col;
		Board board=new Board();
		//board.printBoard(true);
		
		Scanner input=new Scanner(System.in);
		boolean exit=false;
		boolean hardmode=false;
				
		
		while (!exit){			
			System.out.println("Shoots: "+board.getNumShoots()+","+"Sunk ships: "+board.getNumSunkShips());
			board.printBoard(true);
			System.out.println("Enter letter row");
			s=input.next();
			c=s.charAt(0);
			System.out.println("Enter number columm");
			col=input.nextInt();
			int result=board.shootAt(c, col);
			switch (result){
				case Board.RESULT_ERROR:
					System.out.println("ERROR");
					break;
				case Board.RESULT_SUNK:
					System.out.println("¡¡¡Sunk!!!");
					break;
				case Board.RESULT_RESUNK:
					System.out.println("RE-sunk, OMG");
					break;
				case Board.RESULT_WATER:
					System.out.println("be WATER my friend");
					break;
			}
			if (board.getNumShoots()>=10){
				System.out.println("GAME OVER XIKILLO");
				exit=true;
			}
		}
	}
}
