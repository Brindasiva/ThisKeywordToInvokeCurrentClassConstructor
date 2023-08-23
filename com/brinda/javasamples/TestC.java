package com.brinda.javasamples;

public class TestC {

		int a; int b;

TestC(){
	
	this(30,40);
	System.out.println("default constructor");
	
}


 TestC(int a, int b)
 {
	this.a = a;
	this.b = b;
	
	System.out.println("parameterized constructor");
 }

}


