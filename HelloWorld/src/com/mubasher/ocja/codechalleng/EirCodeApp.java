/**
 * Code challenge 14/7/2015
 * Prototype Eircode search programme.
 * 
 * @author Seamus O'Toole, Mubasher Mohammed, Marcos Cesar
 * @version 1.0
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
		int addressArraySize = 10;

		StringBuilder [] addressArray = new StringBuilder [addressArraySize];
		StringBuilder [] eirCodeArray = new StringBuilder [addressArraySize];
		addressArray[0].append("5 Merrion Square North, Dublin 2");
		addressArray[1].append("10 Burlington Road, Dublin 4");
		addressArray[2].append("Dunsink Observatory, Dunsink Lane, Dublin 15");
		addressArray[3].append("26 KINCORA ROAD, Clontarf, Dublin 3");
		addressArray[4].append("Partas, 4A BROOKFIELD ENTERPRISE CENTRE, Dublin 24");
		addressArray[5].append("HODGES FIGGIS, 56-58 DAWSON STREET, Dublin 2");
		addressArray[6].append("CENTRAL BANK OF IRELAND, DAME STREET, Dublin 2");
		eirCodeArray[0].append("D02Y006");
		eirCodeArray[1].append("D04C932");
		eirCodeArray[2].append("D15XR2R");
		eirCodeArray[3].append("D03RR27");
		eirCodeArray[4].append("D24H510");
		eirCodeArray[5].append("D02XE81");
		eirCodeArray[6].append("D02P656");
		
//			{"5 Merrion Square North, Dublin 2", "10 Burlington Road, Dublin 4", 
//								"Dunsink Observatory, Dunsink Lane, Dublin 15", "26 KINCORA ROAD, Clontarf, Dublin 3", 
//				"Partas, 4A BROOKFIELD ENTERPRISE CENTRE, Dublin 24", "HODGES FIGGIS, 56-58 DAWSON STREET, Dublin 2", 
//				"CENTRAL BANK OF IRELAND, DAME STREET, Dublin 2", "", "", ""};		
//		{"D02Y006", "D04C932","D15XR2R","D03RR27","D24H510", "D02XE81", "D02P656", "", "", ""};
		int customAddressRemaining = 3;
		boolean programRunning= true;

		do{
			Scanner sc = new Scanner(System.in);
			System.out.println("1) Find an address \n2) Find all addresses in an area \n3) Find an eircode"
					+ "\n4) Input an eircode and address\n5) Quit ");
			int menuChoice = sc.nextInt();
			switch (menuChoice){

			case 1:
				boolean isValidInput = false;
				do{
					System.out.println("Please enter the Eircode");
					Scanner scan = new Scanner(System.in);
					StringBuilder userInput = scan.nextLine();
					userInput=userInput.replace(" ", "");

					for(int i=0; i<eirCodeArray.length; i++){
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
				StringBuilder userInput = sc.next();
				for (int i=0; i<eirCodeArray.length; i++){
					if (eirCodeArray[i].startsWith(userInput.toUpperCase())){
						System.out.println(addressArray[i]);
					}
				}
				break;
				// search substring

			case 3:
				System.out.println("Please enter part of the address");
				StringBuilder case3Input = sc.next();
				for (int i=0; i<eirCodeArray.length; i++){
					if (addressArray[i].toLowerCase().contains(case3Input.toLowerCase())){
						System.out.println(eirCodeArray[i]);
						System.out.println(addressArray[i]);

					}
				}
				break;
				// search address

			case 4:

				if (customAddressRemaining>0){
					System.out.println("You may enter up to " + customAddressRemaining + " addresses and Eircodes");
					System.out.println("Please enter the eircode: ");
					Scanner scan = new Scanner(System.in);
					StringBuilder case4Input = scan.nextLine();
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
