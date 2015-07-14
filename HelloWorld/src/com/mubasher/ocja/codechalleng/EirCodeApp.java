/**
 * Code challenge 14/7/2015
 * Prototype Eircode search programme.
 * 
 * @author Seamus O'Toole, Mubasher Mohammed, Marcos Cesar
 * @version 0.3 
 */
package com.mubasher.ocja.codechalleng;

import java.util.Scanner;

import javax.swing.text.AbstractDocument.LeafElement;

/**
 * You are required to write a prototype program for the purposes of determining a street address from an Eircode
 *
 *
 */
public class EirCodeApp {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numAddres =7 ;

		//		String [] addressArray = new String[numAddres];
		String [] addressArray = {"5 Merrion Square North, Dublin 2", "10 Burlington Road, Dublin 4", 
				"Dunsink Observatory, Dunsink Lane, Dublin 15", "26 KINCORA ROAD, Clontarf, Dublin 3", 
		"Partas, 4A BROOKFIELD ENTERPRISE CENTRE, Dublin 24", "HODGES FIGGIS, 56-58 DAWSON STREET, Dublin 2", 
		"CENTRAL BANK OF IRELAND, DAME STREET, Dublin 2"};		
		//		String [] eirCodeArray = new String[numAddres];
		String [] eirCodeArray = {"D02 Y006", "D04 C932","D15 XR2R","D03 RR27","D24 H510", "D02 XE81", "D02 P656"};

		boolean programRunning= true;
		
		do{
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter your eircode: ");

			String userInput = scan.nextLine();
			userInput=userInput.replace(" ", "");
			userInput=(userInput.substring(0, 3) + " " + userInput.substring(3));

			//String userInput = "D15 XR2R";
//			System.out.println(userInput);
			boolean isValidInput = false;
			for(int i=0; i<eirCodeArray.length; i++){
				//	if(userInput==eirCodeArray[i]){
				if(userInput.equalsIgnoreCase(eirCodeArray[i])){
					System.out.println("the address for the "+userInput +" is: "+addressArray[i]);
					isValidInput = true;
				}

			}
			if(!isValidInput){
				System.out.println("Please enter a valid Eircode");
			}
			System.out.println("Do you want search for new eircode Y/N? ");
			String userChoice = scan.next();
			//			System.out.println(userChoice);
			if (userChoice.equalsIgnoreCase("n")) {
				programRunning = false; 
				scan.close();
				System.out.println("Thank you, goodbye!");
			}


		}while(programRunning);
	  	
	}

}
