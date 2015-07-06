package com.oce7.mm;

public class Helicopter {

	private String perpuse ;
	private double currentAltitude;
	private int numCrew;
	private double maxAltittude;
	
	private static final double FEET_TO_METER = 3.3;
	
	/**
	 * @deprecated
	 * 
	 * @return
	 */
	public  double getCurrentAltitude(){
		return this.currentAltitude;
	}
	
	public double getCurrentAltitudeInFeet(){
		return this.currentAltitude;
	}
	
	public void setCurrentAltitude(double newCurrentAltitude){
		this.currentAltitude = newCurrentAltitude;
	}
	
	public int getNumCrew(){
		return this.numCrew;
	}
	
	public void setNumCrew(int newNumCrew){
		this.numCrew = newNumCrew;
	}
	
	public double getMaxAltittude(){
		return this.maxAltittude;
	}
	
	public void setMaxAltittude(double maxAltittude){
		if(maxAltittude > 50000){
			System.out.println("you are flying too high");
			return;
		}
		this.maxAltittude = maxAltittude;
	}
	
	public double getCurrentAltitudeInMeters(){
		return (this.getCurrentAltitude()/ FEET_TO_METER);
	}
}
