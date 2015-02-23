package matematicas;

public class Calculador {

	public Calculador(){
	}


	public int suma(int x, int y, int z) {

		return x + y + z;		
	}


	public int producto(int x, int y, int z) {
		int result = 0;
		// suma z tantas veces como 'x' e 'y' 
		for (int i = 0; i < x; i++ ){
			for (int j = 0; j < y; j++ ){
				result += z;
			}
		}

		return result;			
		//return x * y * z; //<< codigo alternativo		
	}

	public static void main (String args[]){

		Calculador c = new Calculador();
		System.out.print( "c1.suma( 1,  2,   3) =");
		System.out.println( c.suma( 1,  2,   3) );
		System.out.print( "c.suma( 5, 10,  15) =");
		System.out.println( c.suma( 5, 10,  15) );
		System.out.print( "c.suma( 1, 10, 100) =");
		System.out.println( c.suma( 1, 10, 100) );

		System.out.print( "c.producto( 1,  2,   3) =");
		System.out.println( c.producto( 1,  2,   3) );
		System.out.print( "c.producto( 5, 10,  15) =");
		System.out.println( c.producto( 5, 10,  15) );
		System.out.print( "c.producto( 1, 10, 100) =");
		System.out.println( c.producto( 1, 10, 100) );
		System.out.print( "c.producto( 1,  1,   1) =");
		System.out.println( c.producto( 1,  1,   1) );
		System.out.print( "c.producto( 0,  1,   1) =");
		System.out.println( c.producto( 0,  1,   1) );
		System.out.print( "c.producto( -1, 1,   1) =");
		System.out.println( c.producto( -1, 1,   1) );

	}


}
