package br.edu.utfpr.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.edu.utfpr.trabalho.CalculadoraCorredores;

public class CalculadoraCorredoresTeste {
	CalculadoraCorredores calc = new CalculadoraCorredores();
	
	@Test
	public void testeLimiteMaffetoneCasoA() {
		assertEquals(140, calc.calcularFrequenciaLimiteMaffetone(30, "A"));
	}
	
	@Test
	public void testeLimiteMaffetoneCasoB() {
		assertEquals(145, calc.calcularFrequenciaLimiteMaffetone(30, "B"));
	}
	
	@Test
	public void testeLimiteMaffetoneCasoC() {
		assertEquals(150, calc.calcularFrequenciaLimiteMaffetone(30, "C"));
	}
	
	@Test
	public void testeLimiteMaffetoneCasoD() {
		assertEquals(155, calc.calcularFrequenciaLimiteMaffetone(30, "D"));
	}
	
	@Test
	public void testFrequenciaInicialMaffetoneCasoA() {
		assertEquals(130, calc.calcularFrequenciaInicialMaffetone(30, "A"));
	}
	
	@Test
	public void testFrequenciaInicialMaffetoneCasoB() {
		assertEquals(135, calc.calcularFrequenciaInicialMaffetone(30, "B"));
	}
	
	@Test
	public void testFrequenciaInicialMaffetoneCasoC() {
		assertEquals(140, calc.calcularFrequenciaInicialMaffetone(30, "C"));
	}
	
	@Test
	public void testFrequenciaInicialMaffetoneCasoD() {
		assertEquals(145, calc.calcularFrequenciaInicialMaffetone(30, "D"));
	}

}
