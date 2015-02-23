package testing.matematicas;

import static org.junit.Assert.*;

import matematicas.Calculador;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCalculadorDetalle {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSumaPositivos() {						
		Calculador c = new Calculador();
		assertEquals( c.suma( 1,  2,   3), 6);
		assertEquals( c.suma( 5, 10,  15), 30);
		assertEquals( c.suma( 1, 10, 100), 111);
	}

	@Test
	public void testSumaNegativos() {						
		Calculador c = new Calculador();
		assertEquals( c.suma( -1,  -2,   -3), -6);
		assertEquals( c.suma( -5, -10,  -15), -30);
		assertEquals( c.suma( -1, -10, -100), -111);
	}
	

}
