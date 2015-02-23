package testing.matematicas;

import static org.junit.Assert.assertEquals;
import matematicas.Contador;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestContador {

	private static Contador _c;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		// Este metodo se ejecuta antes de iniciar los tests de toda esta clase
		_c = new Contador();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		// Este metodo se ejecuta antes de cada metodo de test 
		_c.reset();
	}

	@After
	public void tearDown() throws Exception {
	}
		
	@Test
	public void testIncrementar() {		
		assertEquals( _c.incrementar(), 1 );
		assertEquals( _c.incrementar(), 2 );
		assertEquals( _c.incrementar(), 3 );
		assertEquals( _c.incrementar(), 4 );
		assertEquals( _c.incrementar(), 5 );		
	}
	
	@Test
	public void testDecrementar() {		
		assertEquals( _c.decrementar(), -1 );
		assertEquals( _c.decrementar(), -2 );
		assertEquals( _c.decrementar(), -3 );
		assertEquals( _c.decrementar(), -4 );
		assertEquals( _c.decrementar(), -5 );		
	}	
	
}
