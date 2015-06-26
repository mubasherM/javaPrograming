package com.oce7.mm;

public class ArrayDemo {
	public static void main(String args[]){
		
		
		int [] anArray;
		anArray = new int [100];
		int evenNum =0 ;
		int oddNum = 0;
		
		
		for(int i = 0; i < anArray.length; i++){
			
			
			
			if((i % 2) == 0){
		 evenNum+=i;
			
			//System.out.println("this is an even number: "+ i);
			
		}else if(i % 2 !=0){
			 oddNum+=i;
			
		//	System.out.println("this is odd number: "+ (i));
		}
			System.out.println("total:  "+ (evenNum+ oddNum));
		}
		
		
	}
}
