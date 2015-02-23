package net.rubenamoros.primitiva;

public class Block {
	private final int MAGIC_NUM=6;
	private int[] myBlock=new int[MAGIC_NUM];
	
	public Block(){
		for (int i=0; i<myBlock.length;i++){
			myBlock[i]=Drum.extractBall();	
		}
		for (int i=0;i<myBlock.length-1;i++){
			for (int j=i+1;j<myBlock.length;j++){
				if (myBlock[i]>myBlock[j]){
					int temp=myBlock[j];
					myBlock[j]=myBlock[i];
					myBlock[i]=temp;
				}
			}	
		}
	}
	public String toString(){
		String s="";
		for (int i=0;i<myBlock.length;i++){
			s+=myBlock[i]+", ";
		}
		return "Block's numbers: "+s;
	}
	public int[] getNumbers(){
		return myBlock;
	}
}
