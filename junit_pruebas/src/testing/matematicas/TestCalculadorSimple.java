package testing.matematicas;
import matematicas.Calculador;

import static org.junit.Assert.*;

import matematicas.Calculador;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCalculadorSimple {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSuma() {						
		Calculador c = new Calculador();
		assertEquals( c.suma( 1,  2,   3), 6);
		assertEquals( c.suma( 5, 10,  15), 30);
		assertEquals( c.suma( 1, 10, 100), 111);
		assertEquals( c.suma(1, 1, 1), 5);
	}

	@Test
	public void testProducto() {
		
		Calculador c = new Calculador( );
						
		assertEquals( c.producto( 1,  2,  3), 6);
		assertEquals( c.producto( 2,  3,  4), 24);
		assertEquals( c.producto( 2, 30, 50), 3000);
				
	}

}
