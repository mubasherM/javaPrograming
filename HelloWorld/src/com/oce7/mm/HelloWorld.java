package com.oce7.mm;

import java.util.Scanner;

public class HelloWorld {
	
	public static void main(String args[]){
		
		//System.out.println("Hellow World");
		
		Person p = new Person();
		Person p1 = new Person();
	//	p.setName("John");
		p.setAge(18);
		p.setocupation("Programer");
		p.setGender('M');
		p1.setName("Monika");
		p1.setAge(30);
		p1.setGender('F');
		p1.setocupation("Manager");
		Scanner sName = new Scanner(System.in);
		p.setName(sName.nextLine());
		System.out.println(p.getName()+" is "+p.getAge()+" and "+p.getGender()+" work as a  "+p.getOcutpation());
		System.out.println(p1.getName()+" is "+p1.getAge()+" and "+p1.getGender()+" work as a  "+p1.getOcutpation());
	}

	
}
