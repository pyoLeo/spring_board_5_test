package edu.bite.ex.calculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import edu.bit.ex.calculator.Calculator;

public class CalculatorTest {
	
	Calculator cal;
	
	@Test
	public void testCalculator() {

		assertNotNull(cal);
		
	}
	
	@Test
	public void testSum() {
		Calculator cal = new Calculator();
		int result = cal.sum(10, 20);
		assertEquals(20, result, 10);
	}
	
	@Test
	public void testSub() {
		Calculator cal = new Calculator();
		int result = cal.sum(10, 20);
		assertEquals(20, result, 10);
	}
}
