package ar.edu.unlam.tp1;

import static org.junit.Assert.*;
import org.junit.Test;

public class CirculoTest {

	
	
	@Test
	public void crearUnCirculoConRadio2() {
		Circulo circuloRadio2 = new Circulo(2.0);
		assertEquals(2, circuloRadio2.getRadio(),1);
	}
	
	@Test
	public void crearUnCirculoConRadio3Punto7() {
		Circulo circuloRadio3punto7 = new Circulo(3.7);
		assertEquals(3.7, circuloRadio3punto7.getRadio(),1.1);
	}
	
	@Test
	public void crearUnCirculoConRadio5() {
		Circulo circuloRadio5 = new Circulo(5.0);
		assertEquals(5, circuloRadio5.getRadio(),1);
	}
	
	@Test
	public void crearUnCirculoConRadio10Punto9() {
		Circulo circuloRadio10punto9 = new Circulo(10.9);
		assertEquals(10.9, circuloRadio10punto9.getRadio(),1.1);
	}
	
	@Test
	public void queElPerimetroDeUnCirculoConRadio9Punto8Es615Punto73() {
		Circulo circuloRadio9punto8 = new Circulo(9.8);
		assertEquals(61.57, circuloRadio9punto8.getPerimetro(),1.10);
	}
	
	@Test
	public void crearUnCirculoConRadio16Punto6Es865Punto67() {
		Circulo circuloRadio16punto6 = new Circulo(16.6);
		assertEquals(104.30, circuloRadio16punto6.getPerimetro(),1.10);
	}
	
	@Test
	public void queElTipDeAyudaDeVerde(){ // :)
		
		Double esperado = 1.10;
		Double actual = 1.10;
		
		/**
		 *  Recordar que el siguiente método se puede usar por que al inicio del archivo
		 *  se importaron todos los assert con la siguiente linea 
		 *  import static org.junit.Assert.*; 
		 */
		 
		assertEquals(esperado.doubleValue(), actual.doubleValue(),0.01);
	}
	
}
