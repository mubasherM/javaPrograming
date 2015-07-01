/*
 * simple application that generate random arrays of numbers 
 * sort them
 * print maximum num, minum and average
 * 
 */
import java.util.Arrays;
import java.util.Random;

public class SortingArray {

	public static void main(String[] args){
		
		int [] numArray = new int [10]; //create an array of 10 elements 
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
	}
}
