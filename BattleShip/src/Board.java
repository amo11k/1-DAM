//AMO11k
public class Board {
		private static final char EMPTY= '·';
		private static final char SHIP= '+';
		private static final char WATER='0';
		private static final char SUNK='X';
		private int numShoots;
		private int numSunkShips;
		
		private static final int NUM_ROWS=8;
		private static final int NUM_COLS=8;
		
		private static final int NUM_SHIPS=10;
		
		public static final int RESULT_WATER=0;
		public static final int RESULT_SUNK=1;
		public static final int RESULT_RESUNK=2;
		public static final int RESULT_ERROR=3;

		
		private char[][] board=new char[NUM_ROWS][NUM_COLS];
		
		public Board(){
			resetBoard();
			putShipsRandomly();
		}
		public void resetBoard(){
			numShoots=0;
			numSunkShips=0;
			for (int i=0;i<NUM_ROWS;i++){
				for(int j=0;j<NUM_COLS;j++){
					board[i][j]=EMPTY;
				}	
			}
		}
		private void putShipsRandomly(){
			int count=0;
			int randomRow;
			int randomCol;
			while (count<NUM_SHIPS){
				randomRow=(int)(Math.random()*NUM_ROWS);
				randomCol=(int)(Math.random()*NUM_COLS);
				if (board[randomRow][randomCol]!=SHIP){
					board[randomRow][randomCol]=SHIP;
					count++;
				}	
			}
		}
		public void printBoard(boolean showShips){
			//Numbers header
			char letter='A';
			System.out.print("  ");
			for (int i=1;i<=NUM_COLS;i++){
				System.out.print(i+" ");
			}
			System.out.println();
			//Each row
			for (int i=0;i<NUM_ROWS;i++){
				System.out.print(letter+" ");
				for (int j=0;j<NUM_COLS;j++){
					if (!showShips){
						if (board[i][j]==SHIP){
							System.out.print(EMPTY+" ");
						}else{
							System.out.print(board[i][j]+" ");
						}
					}else{
					System.out.print(board[i][j]+" ");
					}
				}
				System.out.println();
				letter++;
			}
			
		}
		public int shootAt(char row, int col){
			int rowNum= Character.getNumericValue(Character.toUpperCase(row))-Character.getNumericValue('A');
			if ((rowNum<0)||(rowNum>NUM_ROWS-1)){
				return RESULT_ERROR;
			}
			
			col--;
			if ((col<0) || (col>NUM_COLS)){
				return RESULT_ERROR;
				
			}
			if (board[rowNum][col]==SHIP){
				board[rowNum][col]=SUNK;
				numShoots++;
				numSunkShips++;
				return RESULT_SUNK;								
			}			
			if (board[rowNum][col]==SUNK){
				numShoots++;
				return RESULT_RESUNK;
			}
			if (board[rowNum][col]==EMPTY){
				board[rowNum][col]=WATER;
				numShoots++;
				return RESULT_WATER;
			}
			if (board[rowNum][col]==WATER){
				numShoots++;
				return RESULT_WATER;
			}
			return RESULT_ERROR;
		}
		public int getNumShoots(){
			return numShoots;
		}
		public int getNumSunkShips(){
			return numSunkShips;
		}
}
