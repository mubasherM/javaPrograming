/**
 * 
 */
package com.mubasher.ocja.codechalleng.Eircode;

import java.util.Scanner;

/**
 * Code challenge 14/7/2015
 * Prototype Eircode search programme.
 * 
 * @author Seamus O'Toole, Mubasher Mohammed, Marcos Cesar
 * @version 0.v6
 */
public class EircodeAppV2 {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("1) Find an address \n2) Find all addresses in an area \n3) Find an eircode"
				+ "\n4) Input an eircode and address\n5) Quit ");

		int menuChoice = sc.nextInt();
		Eircode myEircode = new Eircode();

		switch (menuChoice){

		case 1:

			myEircode.isEircode();
			break;

		case 2:
			myEircode.isInArea();
			break;
		case 3:
			myEircode.isPartOfAddress();
			break;
		case 4:
			myEircode.inPutUserNumber();
			break;
		case 5:
			System.out.println("good bye you choose to quite");
			break;
		}

	}

}
