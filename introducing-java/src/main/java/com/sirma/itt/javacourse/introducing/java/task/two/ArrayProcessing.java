package com.sirma.itt.javacourse.introducing.java.task.two;

/*
 *  Creating a method to find the Greater Common Divisor.
 *  
 *  @date		26.05.2017
 *	@author		Hristo Radev
 *	
 */
public class ArrayProcessing {

		int[] array1 = {1,2,3,10,15,20,0};
		int[] array2 = {100,5,30,12,-5,150,0};
		
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
		
		public static String sum(int[] array){
			
			String result = "";
			int temp = 0;
			
			for(int i=0; i < array.length; i++){
				
				temp = temp + array[i];
				result = String.valueOf(temp);
			}
			
			return result;
		}

		public static String print(int[] array){
			
			String result = "";
			int changer = 0;
			
			for(int i = 0; i < (array.length + 1) / 2; i++){
				
				changer = array[i];
				
				for(int j = array.length + 1; j < (array.length + 1) / 2; j--){
					
					array[i] = array[j];
					array[j] = changer;
					
				}
				
			}
			for(int i = 0; i < array.length; i++){
				
				result = String.valueOf(array[i]) + result ;
				
			}
			
			return result;
		}
}