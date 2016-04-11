package ar.edu.unlam.tp1;

import static org.junit.Assert.*;

import org.junit.Test;

public class CirculoTest {

	@Test
	public void crearUnCirculoConRadio2() {
		
		Circulo circuloRadio2 = new Circulo();
		circuloRadio2.setRadio(2);
		assertEquals(12.56, circuloRadio2.calcularPerimetro(), 0.01);
		
	}
	@Test
	public void crearUnCirculoConRadio3Punto7() {
		Circulo circuloRadio3Punto7 = new Circulo();
		circuloRadio3Punto7.setRadio(3.7);
		assertEquals(23.23, circuloRadio3Punto7.calcularPerimetro(), 0.01);
	}
	
	@Test
	public void crearUnCirculoConRadio5() {
		Circulo circuloRadio5 = new Circulo();
		circuloRadio5.setRadio(5);
		assertEquals(31.4, circuloRadio5.calcularPerimetro(), 0.01);
	}
	
	@Test
	public void crearUnCirculoConRadio10Punto9() {
		Circulo circuloRadio10Punto9 = new Circulo();
		circuloRadio10Punto9.setRadio(10.9);
		assertEquals(68.45, circuloRadio10Punto9.calcularPerimetro(), 0.01);
	}
	
   @Test
	public void queElAreaDeUnCirculoConRadio9Punto8Es615Punto73() {
		Circulo circuloRadio9Punto8 = new Circulo();
		circuloRadio9Punto8.setRadio(9.8);
		assertNotEquals(615.73, circuloRadio9Punto8.calcularPerimetro(), 0.01);
	}
	
	@Test
	public void crearUnCirculoConRadio16Punto6Es865Punto67() {
		Circulo circuloRadio16Punto6 = new Circulo();
		circuloRadio16Punto6.setRadio(16.6);
		assertNotEquals(865.67, circuloRadio16Punto6.calcularPerimetro(), 0.01);
	}
	
	@Test
	public void queElTipDeAyudaDeVerde(){ // :)
		
		Double esperado = 1.10;
		Double actual = 1.10;
		
		/*
		 *  Recordar que el siguiente método se puede usar por que al inicio del archivo
		 *  se importaron todos los assert con la siguiente linea 
		 *  import static org.junit.Assert.*; 
		 */
		 
		assertEquals(esperado.doubleValue(), actual.doubleValue(),0.01);
	}
	
}
