package net.rubenamoros.primitiva;

public class Ticket {
	private final int NUM_OF_BLOCKS=8;
	private Block[] myTicket=new Block[NUM_OF_BLOCKS];
	
	public Ticket(){
		for (int i=0;i<myTicket.length;i++){
			myTicket[i]=new Block();
			//System.out.println(myTicket[i].toString());
		}
	}
	public String toString(){
		String s="";
		for (int i=0;i<myTicket.length;i++){
			s+=myTicket[i].toString()+"\n";
		}
		return "Your ticket contains the following blocks: "+"\n"+s;
	}
	public int[] getArrayBlock(int x){
		return myTicket[x].getNumbers();
	}
}
