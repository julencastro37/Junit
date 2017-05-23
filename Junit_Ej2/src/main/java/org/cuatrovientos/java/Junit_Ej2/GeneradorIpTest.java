package org.cuatrovientos.java.Junit_Ej2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class GeneradorIpTest extends TestCase {

	GeneradorIp ip = new GeneradorIp();
	@Before
	protected void setUp() throws Exception {
		super.setUp();
	}
	
	@Test
	public void testGenerarNumero(){
		int max = 254;
		int min = 0;
		ip.generarNumero(min, max);
		/*assert.
		 
		 */
	}
	public void testGenerarIp(){
		int max = 254;
		int min = 0;
		ip.generarNumero(min, max);
		/*assert.
		 
		 */
	}
	

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
	}

}
