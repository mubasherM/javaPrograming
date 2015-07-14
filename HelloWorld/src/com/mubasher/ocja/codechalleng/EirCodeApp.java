/**
 * Code challenge 14/7/2015
 * Prototype Eircode search programme.
 * 
 * @author Seamus O'Toole, Mubasher Mohammed, Marcos Cesar
 * @version 0.5
 */
package com.mubasher.ocja.codechalleng;

import java.util.Scanner;

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
		"CENTRAL BANK OF IRELAND, DAME STREET, Dublin 2", "", "", ""};		
		//		String [] eirCodeArray = new String[numAddres];
		String [] eirCodeArray = {"D02Y006", "D04C932","D15XR2R","D03RR27","D24H510", "D02XE81", "D02P656", "", "", ""};
		int customAddressRemaining = 3;
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
				/*5) Provide a facility for a user to enter up to 3 customs Eircode & Address combinations
				 * 0) tell the user how many more times they can enter data (0-3). if 0, return to main menu
				 * a) prompt user to enter code
				 * b) change code to correct format (remove spaces and toUpper)
				 * c) save this to array
				 * d) prompt user to enter the address (single line with commas separating)
				 * e) save this to array
				 * f) increase the array index by 1 for the next time they are using this feature
				 */ 
				if (customAddressRemaining>0){
					System.out.println("You may enter up to " + customAddressRemaining + " addresses and Eircodes");
					System.out.println("Please enter the eircode: ");
					Scanner scan = new Scanner(System.in);
					String case4Input = scan.nextLine();
					case4Input=case4Input.replace(" ", "");
					case4Input=case4Input.toUpperCase();
					eirCodeArray[eirCodeArray.length - customAddressRemaining] = case4Input;
					System.out.println("Please enter the address ");
					case4Input = scan.nextLine();
					addressArray[addressArray.length - customAddressRemaining ] = case4Input;
					
					System.out.println("the address you entered is : "+addressArray[addressArray.length - customAddressRemaining ] );
					System.out.println("and the Eircode you entered is : " + eirCodeArray[eirCodeArray.length - customAddressRemaining]);
					customAddressRemaining--;
				}else{
					System.out.println("You have no custom addresses remaining");
				}
				break;
				
				
			case 5:
				System.out.println("Thank you, goodbye!");
				programRunning = false; 
			}

		}while(programRunning);

	}

}
