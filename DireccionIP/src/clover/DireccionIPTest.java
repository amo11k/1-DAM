package clover;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DireccionIPTest {

	@Test
	public void testA() {
		DireccionIP maxA= new DireccionIP(1,0,0,0);
		DireccionIP minA= new DireccionIP(127,0,0,0);
		
		assertEquals(maxA.clase(), "La IP es clase A");
		assertEquals(minA.clase(), "La IP es clase A");
	}
	
	@Test
	public void testB() {
		DireccionIP maxB= new DireccionIP(191,0,0,0);
		DireccionIP minB= new DireccionIP(128,0,0,0);
		
		assertEquals(maxB.clase(), "La IP es clase B");
		assertEquals(minB.clase(), "La IP es clase B");
	}
	
	@Test
	public void testC() {
		DireccionIP maxC= new DireccionIP(223,0,0,0);
		DireccionIP minC= new DireccionIP(192,0,0,0);
		
		assertEquals(maxC.clase(), "La IP es clase C");
		assertEquals(minC.clase(), "La IP es clase C");
	}
	
	@Test
	public void testFail() {
		DireccionIP minFail= new DireccionIP(-1,0,0,0);
		DireccionIP maxFail= new DireccionIP(244,0,0,0);
		
		assertEquals(minFail.clase(), "IP invalida");
		assertEquals(maxFail.clase(), "IP invalida");
	}
	

}
