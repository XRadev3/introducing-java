package com.sirma.itt.javacourse.introducing.java.task.one;

/*
 *  Creating a method to find the Greater Common Divisor.
 *  
 *  @date		26.05.2017
 *	@author		Hristo Radev
 *	
 */
public class GreaterCommonDivisor {

	public static String calculate(int digit1, int digit2){
		
		int sum = 0;
		String outcome = "";
		
		if (digit1 != digit2){
			
			if(digit1 > digit2){
				
				for (int i = 1; i <= digit2; i ++){
					
					sum = digit2%i;
					
					if (sum == 0){
						
						sum = digit1%i;
						
						if(sum == 0){
							
							outcome = String.valueOf(i);
						}
					}
				}
			}
			else {
				
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
			
			return outcome = String.valueOf(digit1);
		}
		return outcome;
	}
	
}

