/*
 * simple application that generate random arrays of numbers 
 * sort them
 * print maximum num, minum and average
 * 
 */
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SortingArray {

	public static void main(String[] args){
		int number =0;
		Scanner numScan = new Scanner(System.in);
		System.out.println("please enter a number:");
		number = numScan.nextInt();
		
		int [] numArray = new int [number]; //create an array of 10 elements 
		Random random = new Random();
		int randomNum =random.nextInt();
		float numTotal=0;
		
		System.out.print("\nRandom Numbers");
		for(int i=0; i< numArray.length; i++ ){
			numArray[i]= random.nextInt(20+1); // assign random values to the array
			
			System.out.print(" "+numArray[i]);
			
		}
		float maxNum =numArray[0];
		float minNum= numArray[0];
		System.out.print("\nsorted Numbers");
		
		for(int i=0; i< numArray.length; i++ ){
		Arrays.sort(numArray); // this will sort the array 
		
		System.out.print(" "+numArray[i]);
		numTotal+= numArray[i];
		if(maxNum < numArray[i]){
			maxNum= numArray[i];
		}
		
		if(minNum > numArray[i]){
			minNum= numArray[i];
		}
		
		
		}
		float verageNum= numTotal/numArray.length;
		System.out.println("\nTotal is: "+ numTotal);
		System.out.println("Maximum  is: "+ maxNum);
		System.out.println("Minimum  is: "+ minNum);
		System.out.println("Average  is: "+ verageNum);
		
		 numArray=Arrays.copyOf(numArray, 40);
		 System.out.print("\nRandom Numbers");
		 	for(int i=10; i<numArray.length;i++){
		 		numArray[i]=random.nextInt(20+3);
		 	}
			for(int i=0; i< numArray.length; i++ ){
				
				//numArray[i]= random.nextInt(20+1); // assign random values to the array
				
				System.out.print(" "+numArray[i]);
			}
			int index=0;
			Scanner indexScan = new Scanner(System.in);
			System.out.print("\nplease enter the number to search "+index);
			index = indexScan.nextInt();
			
			 index = Arrays.binarySearch(numArray,11 ); // will search the number  in the array
			if(index <0){
				System.out.println("\nsorry the number is not listed");
				
			}else {
				System.out.println("\nnumber @ "+index);
			}
			
	}
}
