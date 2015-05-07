/**
 * 
 */
package org.cuatrovientos.cadena.Cadena;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author PC
 *
 */
public class CadenaTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link org.cuatrovientos.cadena.Cadena.Cadena#longitud(java.lang.String)}.
	 */
	@Test
	public void testLongitud() {
		Cadena target = new Cadena();
		int expectedLength = 5;
		int actualLength = target.longitud("hello");
		
		assertEquals("Longitud correcta", expectedLength, actualLength);
	}

	/**
	 * Test method for {@link org.cuatrovientos.cadena.Cadena.Cadena#vocales(java.lang.String)}.
	 */
	@Test
	public void testVocales() {
		Cadena target = new Cadena();
		int actualLength = 0;
		int expectedLength[] = {2,1,3};
		String testingString[] = {"hello","bye","aloha"};
for (int i = 0; i < expectedLength.length; i++){
	actualLength = target.vocales(testingString[i]);			
	assertEquals("Vowel number is correct", expectedLength[i], actualLength);
}
	
}
		
		

	/**
	 * Test method for {@link org.cuatrovientos.cadena.Cadena.Cadena#invertir(java.lang.String)}.
	 */
	@Test
	public void testInvertir() {
		Cadena target = new Cadena();
		String expected = "MURDER";
		String actual = target.invertir("REDRUM");
		
		assertEquals("Testeando invertir", expected, actual);
	}

	/**
	 * Test method for {@link org.cuatrovientos.cadena.Cadena.Cadena#contarLetra(java.lang.String, char)}.
	 */
	@Test
	public void testContarLetra() {
		Cadena target = new Cadena();
		int expected = 2;
		int actual = target.contarLetra("Baloon", 'o');
		
		assertEquals("Testeando contar letra", expected, actual);
	}

}
