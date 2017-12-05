package com.project.maven.GUI03;

import static org.junit.Assert.*;
import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

/**
 * Istället för random kan man hårdkoda men jag vet inte vad 1 kommer ifrån. Kan använda de här testerna för inlämningen.
 * 
 * Log ligger också inne.
 * 
 * @author erica
 *
 */

public class ConversonDegreesRadiansTest {
	ConversonDegreesRadians cdr = new ConversonDegreesRadians();
	Random random = new Random();
	private static final Logger LOG = Logger.getLogger(ConversonDegreesRadians.class.getName());
	
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
		double randomValue = 0.0;
		for (int i = 0; i < 10; i++) {
			randomValue = random.nextDouble()*100;
			LOG.info("Testing the method convertDegreesToRadians with value: " +randomValue);
			assertEquals(degreesToRadians(randomValue), cdr.convertDegreesToRadians(randomValue), 0.1); //skriver jag cdr. så kommer valid förslag fram
		}	
	}
	
	@Test
	public void testRadiansToDegrees() {
		double randomValue = 0.0;
		for (int i = 0; i < 10; i++) {
			randomValue = random.nextDouble()*100;
			LOG.info("Testing the method convertRadiansToDegrees with value: " +randomValue);
			assertEquals(radiansToDegrees(randomValue), cdr.convertRadiansToDegrees(randomValue), 01);
	}

}
}
