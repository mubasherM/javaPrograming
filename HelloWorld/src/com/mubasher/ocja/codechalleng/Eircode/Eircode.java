package com.mubasher.ocja.codechalleng.Eircode;

import java.util.Scanner;

public class Eircode {

	String [] addressArray = {"5 Merrion Square North, Dublin 2", "10 Burlington Road, Dublin 4", 
			"Dunsink Observatory, Dunsink Lane, Dublin 15", "26 KINCORA ROAD, Clontarf, Dublin 3", 
			"Partas, 4A BROOKFIELD ENTERPRISE CENTRE, Dublin 24", "HODGES FIGGIS, 56-58 DAWSON STREET, Dublin 2", 
			"CENTRAL BANK OF IRELAND, DAME STREET, Dublin 2", "", "", ""};		
	String [] eirCodeArray = {"D02Y006", "D04C932","D15XR2R","D03RR27","D24H510", "D02XE81", "D02P656", "", "", ""};
	int customAddressRemaining = 3;

	Scanner sc = new Scanner(System.in);
	public  boolean isEircode(){
		boolean isValidInput = false;

		do{
			System.out.println("Please enter the Eircode");
			Scanner scan = new Scanner(System.in);
			String userInput = scan.nextLine();
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
		return true;
	}

	public boolean isInArea(){
		System.out.println("Please enter the area code");
		//Scanner sc = new Scanner(System.in);
		String userInput = sc.next();
		for (int i=0; i<eirCodeArray.length; i++){
			if (eirCodeArray[i].startsWith(userInput.toUpperCase())){
				System.out.println(addressArray[i]);
			}
		}
		return true;
	}

	public boolean isPartOfAddress(){
		System.out.println("Please enter part of the address");

		String case3Input = sc.next();
		for (int i=0; i<eirCodeArray.length; i++){
			if (addressArray[i].toLowerCase().contains(case3Input.toLowerCase())){
				System.out.println(eirCodeArray[i]);
				System.out.println(addressArray[i]);
			}
		}

		return true;

	}
	public boolean inPutUserNumber(){
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
		return false;

	}




}
