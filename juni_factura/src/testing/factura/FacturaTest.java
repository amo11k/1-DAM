package testing.factura;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import factura.Factura;
import factura.LineaFactura;


public class FacturaTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetTotal() {
		LineaFactura[] lineas = new LineaFactura[]{
				new LineaFactura("P100", "Leche",	0.85f, 	6, 	0 ),
				new LineaFactura("P200", "Pan",		0.60f, 	1, 	0 ),
				new LineaFactura("P150", "Tomate",	0.85f, 	2, 	0 ),
				new LineaFactura("P600", "Cafe",		1.2f, 	1, 	0 )
			};														
		Factura factura1 = new Factura( "C100",  "Antonio Garcia", lineas);
		
		assertEquals((double)factura1.getTotal(), (double)8.6f, (double)0.01f);
	}
	
	@Test
	public void testGetTotalProductoMultiples(){
		LineaFactura[] lineas = new LineaFactura[]{
				new LineaFactura("P138", "Azucar",	1f, 	0.6f, 	0 ),
				new LineaFactura("P060", "Manzana",		2f, 	1f, 	0 ),
			};														
		Factura factura2 = new Factura( "C101",  "Maria Fernandez", lineas);
		
		assertEquals((double)factura2.getTotal(), (double)2.6f, (double)0.01f);
		
		lineas = new LineaFactura[]{
				new LineaFactura("P138", "Azucar",	1f, 	0.6f, 	0 ),
				new LineaFactura("P060", "Manzana",		2f, 	1f, 	0 ),
			};														
		Factura factura3 = new Factura( "C101",  "Maria Fernandez", lineas);
		//He probado, sin variar el delta, cambiar el 2 parametro entre 
		//2.58-2.62 Todas las pruebas han dado el resultado esperado
		//Secuencia Fail-Success-Success-Success-Fail
		assertEquals((double)factura3.getTotal(), (double)2.61f, (double)0.01f);
	}
}
