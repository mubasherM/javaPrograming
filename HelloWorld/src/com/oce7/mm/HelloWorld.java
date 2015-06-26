package com.oce7.mm;

public class HelloWorld {
	
	public static void main(String args[]){
		
		//System.out.println("Hellow World");
		
		Person p = new Person();
		Person p1 = new Person();
		p.setName("John");
		p.setAge(18);
		p.setGender('M');
		p1.setName("Monika");
		p1.setAge(30);
		p1.setGender('F');
		
		System.out.println(p.getName()+" is "+p.getAge()+" and "+p.getGender());
		System.out.println(p1.getName()+" is "+p1.getAge()+" and "+p1.getGender());
	}

	
}
