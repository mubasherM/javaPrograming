/**
 * Code challenge 14/7/2015
 * Prototype Eircode search programme.
 * 
 * @author Seamus O'Toole, Mubasher Mohammed, Marcos Cesar
 * @version 0.4
 */
package com.mubasher.ocja.codechalleng;

import java.util.Scanner;

import javax.swing.SpringLayout.Constraints;
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
		String [] eirCodeArray = {"D02Y006", "D04C932","D15XR2R","D03RR27","D24H510", "D02XE81", "D02P656"};

		boolean programRunning= true;

		do{
			Scanner sc = new Scanner(System.in);
			System.out.println("1) Find an address \n2) Find all adresses in an area \n3) Find an eircode"
					+ "\n4) Input an eircode and address\n5) Quit ");
			int menuChoice = sc.nextInt();
			switch (menuChoice){

			case 1:
				boolean isValidInput = false;
				do{
					System.out.println("Please enter the Eircode");
					Scanner scan = new Scanner(System.in);
					String userInput = scan.nextLine();
					userInput=userInput.replace(" ", "");
//					userInput=(userInput.substring(0, 3) + " " + userInput.substring(3));

					//String userInput = "D15 XR2R";
					//			System.out.println(userInput);

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
				}while (!isValidInput);

				break;
			case 2:
				System.out.println("Please enter the area code");
				String userInput = sc.next();
				for (int i=0; i<eirCodeArray.length; i++){
					if (eirCodeArray[i].startsWith(userInput.toUpperCase())){
						System.out.println(addressArray[i]);
					}
				}
				break;
				// search substring

			case 3:
				System.out.println("Please enter part of the address");
				String case3Input = sc.next();
				for (int i=0; i<eirCodeArray.length; i++){
					if (addressArray[i].toLowerCase().contains(case3Input.toLowerCase())){
						System.out.println(eirCodeArray[i]);
						System.out.println(addressArray[i]);
						
					}
				}
				break;
				// search address

			case 4:
				//input new details

			case 5:
				System.out.println("Thank you, goodbye!");
				programRunning = false; 
			}

		}while(programRunning);

	}

}
