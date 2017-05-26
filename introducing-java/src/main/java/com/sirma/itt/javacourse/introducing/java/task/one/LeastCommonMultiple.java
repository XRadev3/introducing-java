package com.sirma.itt.javacourse.introducing.java.task.one;

/*
 *  Creating a method to find the Least Common Multiple.
 *  
 *  @date		26.05.2017
 *	@author		Hristo Radev
 *	
 */
public class LeastCommonMultiple {
	
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
}