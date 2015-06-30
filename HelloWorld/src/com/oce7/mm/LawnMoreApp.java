package com.oce7.mm;

public class LawnMoreApp {
	
	public static void main(String[] args){
		  
		LawnMore lawnMore = new LawnMore();
		System.out.println("LwanMore Engine on is : "+lawnMore.isEngineOn());
		
		lawnMore.trunEngineOn();
		System.out.println("LwanMore Engine on is : "+ lawnMore.isEngineOn());
		
		lawnMore.trunEngineOff();
		System.out.println("LwanMore Engine on is : "+lawnMore.isEngineOn());
	}

}
