/*
 * this simple application demonstrate the status of LawnMore and use of object and object reference 
 */
package com.oce7.mm;

public class LawnMore {

	private boolean engineOn;
	private enum engineType {ELECTRIC, OIL,HIBRID ,NONE} ;
	private String colour;
	
	public void trunEngineOn(){
		this.engineOn= true;
	}
	
	public void trunEngineOff(){
		this.engineOn= false;
	}
	public  boolean isEngineOn(){
		return engineOn;
	}
	
}
