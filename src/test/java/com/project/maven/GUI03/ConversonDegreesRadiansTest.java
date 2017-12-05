package com.project.maven.GUI03;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConversonDegreesRadiansTest {
	ConversonDegreesRadians cdr = new ConversonDegreesRadians();
	
	/**
	 * De här två är hjälpmetoder. De skapas för att  göra det enklare? Slippa göra det inom testmetoden?
	 * @param valueInDegrees
	 * @return
	 */
	
	public double degreesToRadians(double valueInDegrees) {
		double radians = valueInDegrees * (Math.PI/180);
		return radians;
	}
	
	public double radiansToDegrees (double valueInRadians) {
		double degrees = valueInRadians * (180/Math.PI);
		return degrees;
	}
	

	@Test
	public void testDegreesToRadians() {
		assertEquals(degreesToRadians(3.8), cdr.convertDegreesToRadians(3.8), 0.1); //skriver jag cdr. så kommer valid förslag fram
		
	}
	
	@Test
	public void testRadiansToDegrees() {
		assertEquals(radiansToDegrees(3.8), cdr.convertRadiansToDegrees(3.8), 01);
	}

}
