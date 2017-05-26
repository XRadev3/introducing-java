package com.sirma.itt.javacourse.introducing.java.task.one;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.Test;


public class LeastCommonMultipleTest {
	
		/*
		 * Defining method "calculate" to solve the problem.
		 */
		public static String calculate(int digit1, int digit2){
			
			String result = "";
			int sum = 0;
		
			if (digit1 != digit2){
			
				if(digit1 > digit2){
				
					for(int multiple = (digit1*digit2); multiple >= digit1; multiple --){
					
						sum = multiple%digit1;
					
						if(sum == 0){
						
							sum = multiple%digit2;
						
							if(sum == 0){
								
								result = String.valueOf(multiple);
							}
						}
					}
				}
			
				else {
				
					for(int multiple = (digit1*digit2); multiple >= digit2; multiple --){
					
						sum = multiple%digit1;
					
						if(sum == 0){
						
							sum = multiple%digit2;
						
							if(sum == 0){
								
								result = String.valueOf(multiple);
							}
						}
					}
				}
			}
		
			else{
			
				result = String.valueOf(digit1);
			}
		
			return result;
		}
	
		String lcm1 = calculate(5, 4);
		String lcm2 = calculate(4, 6);
		String lcm3 = calculate(10, 10);

		private static final Logger LOGGER = LoggerFactory.getLogger(LeastCommonMultipleTest.class);
		
			@Test
			public void Test(){
				
					LOGGER.info(lcm1);
					LOGGER.info(lcm2);
					LOGGER.info(lcm3);
			
			}
		
}
