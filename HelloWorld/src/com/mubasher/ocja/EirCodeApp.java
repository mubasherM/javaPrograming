/**
 * 
 */
package com.mubasher.ocja;

import java.util.Scanner;

import javax.swing.text.AbstractDocument.LeafElement;

/**
 * You are required to write a prototype program for the purposes of determining a street address from an Eircode
   The 5 Eircodes are as follows:
  D02 Y006	5 Merrion Square North, Dublin 2
  D04 C932	10 Burlington Road, Dublin 4
  D15 XR2R	Dunsink Observatory, Dunsink Lane, Dublin 15
  D03 RR27	26 KINCORA ROAD, Clontarf, Dublin 3.
  D24 H510	Partas, 4A BROOKFIELD ENTERPRISE CENTRE, Dublin 24
 * @author Mubasher , Marcos, Seamus
 *
 */
public class EirCodeApp {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numAddres =5 ;
		
//		String [] addressArray = new String[numAddres];
		String [] addressArray = {"5 Merrion Square North, Dublin 2", "10 Burlington Road, Dublin 4", 
				"Dunsink Observatory, Dunsink Lane, Dublin 15", "26 KINCORA ROAD, Clontarf, Dublin 3", 
				"Partas, 4A BROOKFIELD ENTERPRISE CENTRE, Dublin 24"};		
//		String [] eirCodeArray = new String[numAddres];
		String [] eirCodeArray = {"D02 Y006", "D04 C932","D15 XR2R","D03 RR27","D24 H510"};
		System.out.println("Please enter your eircode: ");
		Scanner scan = new Scanner(System.in);
		String userInput = scan.nextLine();
		scan.close();
		System.out.println(userInput);
//		String userInput = "D15 XR2R";
		for(int i=0; i<eirCodeArray.length; i++){
//			if(userInput==eirCodeArray[i]){
			if(userInput.equalsIgnoreCase(eirCodeArray[i])){
				System.out.println("the address for the "+userInput +" is: "+addressArray[i]);
			}else if(userInput !=eirCodeArray[i]){
				System.out.println("please enter a valid eircode");
			}
			
		}
		
	}

}
