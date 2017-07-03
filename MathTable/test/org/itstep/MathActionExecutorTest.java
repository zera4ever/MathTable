package org.itstep;

import static org.junit.Assert.*;

import org.junit.Test;

public class MathActionExecutorTest {

	@Test
	public void testGetSum() {
		int result = MathActionExecutor.getSum(25,26);
		assertEquals(51, result);
		
	}

	@Test
	public void testGetMultiply() {
		int result = MathActionExecutor.getMultiply(15,11);
		assertEquals(165, result);
		
	}

	@Test
	public void testGetDivision() {
		double result = MathActionExecutor.getDivision(9, 4);
		String resultAsText = String.valueOf(result);
		String expectedText = resultAsText.substring(0, 4);
		assertEquals("2.25", expectedText);
		
	}
	
	@Test
	public void testGetDivisionForZero(){
		boolean thrown = false;
		try{
		double result = MathActionExecutor.getDivision(123, 0);
			
		}catch (ArithmeticException e){
		thrown = true;
		}
		assertFalse(thrown);
		
		
//	boolean thrown = false;
//		try{
//		double result = MathActionExecutor.getDivision(123, 0);
//			
//		}catch (IllegalArgumentException e){
//		thrown = true;
//		}
//		assertTrue(thrown);
		
	}
	
	@Test
	public void testGetDivisionForOne() {
				
		double result = MathActionExecutor.getDivision(45, 1);
		String resultAsText = String.valueOf(result);
		String expectedText = resultAsText.substring(0);
		assertEquals("45.0", expectedText);
		
		
//		String resultAsText = String.valueOf(result);
//		String expectedText = resultAsText.substring(number1, 1);
//		assertEquals("45", expectedText);
		
	}

	@Test
	public void testGetMinus() {
		int result = MathActionExecutor.getMinus(385,128);
		assertEquals(257, result);
		
	}

}
