/**
 * @author Mubasher Mohammed
 * simple application that will determine if the year is leap year or not 
 * by using logical operators 
 */
import java.util.Scanner;

public class LeapYear {
	public static void main(String args[]){
		int year=100 ;
		Scanner scan = new Scanner(System.in);
		
		//year = scan.nextInt();
		LeapYear myYear = new LeapYear();
		
		for(int i=1850;i<2050; i++){ 
			
			System.out.println(i+" leap year is: "+myYear.isLeapYear(i) );
		}
		
	
		
	}
	
	public boolean isLeapYear(int year){ 
		
		if(((year % 4 ==0) && (year %100 != 0)) ||( year %400 ==0)){
			return true;
		}else{
			return false;
		}
		
	}
}
