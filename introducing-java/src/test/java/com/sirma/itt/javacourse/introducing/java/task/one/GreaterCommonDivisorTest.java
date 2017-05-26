package com.sirma.itt.javacourse.introducing.java.task.one;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.Test;

/*
 *  Creating a method to find the Greater Common Divisor.
 *  
 *  @date		26.05.2017
 *	@author		Hristo Radev
 *	
 */
public class GreaterCommonDivisorTest {
		
		/*
		 * Defining method "calculate" to solve the problem.
		 */
		public static String calculate(int digit1, int digit2){
			
			int sum = 0;
			String outcome = "";
			
			if (digit1 != digit2){
				
				if(digit1 > digit2){
					
					/*Defining a for cycle, with i equal to the smaller number, because GCD can't be  bigger that the smaller number*/
					for (int i = 1; i <= digit2; i ++){
						
						sum = digit2%i;
						
						if (sum == 0){
							
							sum = digit1%i;
							
							if(sum == 0){
								
							/*When we have the value of GCD we add it to the String "outcome", so that  we can return it. */	
								outcome = String.valueOf(i);
							}
						}
					}
				}
				else {
					
					/*With the ELSE statement we do the same operations as in the IF but with the other number.*/
					if(digit1 < digit2){
					
						for (int divisor = 1; divisor <= digit1; divisor ++){
						
							sum = digit2%divisor;
						
							if (sum == 0){
							
								sum = digit1%divisor;
							
								if(sum == 0){
								
									outcome = String.valueOf(divisor);
								}
							}
						}
					}
				}
			}
			
			else{
				
				/* If the two numbers are equal, then we return the value of either one, because that is the GCD.*/
				return outcome = String.valueOf(digit1); 
			}
			return outcome;
		}
		
		/*We directly create a String and give it a value equal to the result of our method(calculate)*/
		String outcome1 = calculate(5, 10);
		String outcome2 = calculate(2, 2);
		String outcome3 = calculate(8, 12);
		String outcome4 = calculate(49, 21);
		
		private static final Logger LOGGER = LoggerFactory.getLogger(GreaterCommonDivisorTest.class);
		
			@Test
			public void Test() {
				
				LOGGER.info("Results of testing:");
				LOGGER.info(outcome1);
				LOGGER.info(outcome2);
				LOGGER.info(outcome3);
				LOGGER.info(outcome4);
			}
	}
	
