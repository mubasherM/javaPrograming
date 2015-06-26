package com.oce7.mm;

public class Person {

	int age;
	String name ;
	char gender;
	
	String getName(){
		return name;
		
	}
	void setName( String name){
		this.name = name;
	}
	int getAge(){
		return age;
		
	}
	void setAge( int age){
		this.age= age;
	}
	char getGender(){
		return gender;
		
	}
	void setGender( char gender){
		this.gender = gender;
	}
}
