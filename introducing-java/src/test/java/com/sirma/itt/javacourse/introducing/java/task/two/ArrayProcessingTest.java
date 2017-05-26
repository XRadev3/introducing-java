package com.sirma.itt.javacourse.introducing.java.task.two;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 *  Creating a method Process arrays:
 *  -getMinElementIndex(int[] array) – returns the index of the element with minimum value
 *  -sum(int[] array) – returns the sum of all elements in the array
 *  -print(int [] array) – prints the array's elements to screen
 *  
 *  @date		26.05.2017
 *	@author		Hristo Radev
 *	
 */
public class ArrayProcessingTest {

		int[] array1 = {1,2,3,10,15,20,0};
		int[] array2 = {100,5,30,12,-5,150,0};
		
		/*
		 * Defining method for returning the element with the lowest value 
		 */
/*		public static String getMinElementIndex(int[] array){

		
			String result = ""; 
			
			for(int i = 0; i < array.length; i++){
				
				if(array[i] < array[i-1]){
					result = String.valueOf(i+1);
				
				}
			}
		
			return result;
		}
*/	
		
		/*
		 * Defining method for returning the sum of all elements in the array 
		 */
		public static String sum(int[] array){
			
			String result = "";
			int temp = 0;
			
			for(int i=0; i < array.length; i++){
				
				temp = temp + array[i];
				result = String.valueOf(temp);
			}
			
			return result;
		}
		
		/*
		 * Defining method for printing the array 
		 */
		public static String print(int[] array){
			
			String result = "";
			
			for(int i = 0; i < (array.length); i++){
				
				result = result + String.valueOf(array[i]);
				
			}
			
			return result;
		}
		
		/*		
		String resultmin1 = getMinElementIndex(array1);
		String resultmin2 = getMinElementIndex(array2);
*/		
		
		String resultsum1 = sum(array1);
		String resultsum2 = sum(array2);
		
		String resultprint1 = print(array1);
		String resultprint2 = print(array2);

		private static final Logger LOGGER = LoggerFactory.getLogger(ArrayProcessingTest.class);
		
		@Test
		public void Test(){
			
			LOGGER.info("Result of test");

/*			LOGGER.info(resultmin1);
			LOGGER.info(resultmin2);
*/
			LOGGER.info(resultsum1);
			LOGGER.info(resultsum2);
			
			LOGGER.info(resultprint1);
			LOGGER.info(resultprint2);
			
		}
}
