package matematicas;

public class Contador {
	
	private int _contador;
	
	public Contador(){
		this._contador = 0;
	}
	
	public int incrementar(){
		return ++this._contador;
	}
	
	public int decrementar(){
		return --this._contador;
	}
	
	public int reset(){
		return this._contador = 0;
	}
	
	public int getContador(){
		return this._contador;
	}
	
	public static void main(String[] args) {
		Contador c = new Contador();
		System.out.println( "Valor inicial del contador: " + c.getContador() );
		c.incrementar();
		System.out.println( "Incrementamos 1 vez:     " + c.getContador() );
		c.incrementar();
		System.out.println( "Incrementamos 2 veces:   " + c.getContador() );
		c.incrementar();
		System.out.println( "Incrementamos 3 veces:   " + c.getContador() );
		c.incrementar();
		System.out.println( "Incrementamos 4 veces:   " + c.getContador() );
		
		
		c.decrementar();
		System.out.println( "Decrementamos 1 vez:     " + c.getContador() );
		c.decrementar();
		System.out.println( "Decrementamos 2 veces:   " + c.getContador() );
		System.out.println( "Valor final del contador: " + c.getContador() );

	}

}
