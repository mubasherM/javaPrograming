package com.oce7.mm;

public class HelicopterApp {
	public static void main(String[] args){
		
		Helicopter chopper = new Helicopter();
		
		System.out.println("the Current altitude of the helicopter is: "+ chopper.getCurrentAltitude());
		chopper.setCurrentAltitude(1500.0D);
		System.out.println("the Current altitude of the helicopter is: "+ chopper.getCurrentAltitude());
		
		System.out.println("the number of crew is: "+ chopper.getNumCrew());
		chopper.setNumCrew(4);
		System.out.println("the number of crew is: "+ chopper.getNumCrew());
		
		System.out.println("Maximum Altittude is : "+ chopper.getMaxAltittude());
		//chopper.setMaxAltittude(50000.0D);
		System.out.println("Maximum Altittude is : "+ chopper.getMaxAltittude());
		chopper.setMaxAltittude(70000.0D);
		System.out.println("Maximum Altittude is : "+ chopper.getMaxAltittude());
		
	}

}
