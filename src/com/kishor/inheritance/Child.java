package com.kishor.inheritance;

import java.io.IOException;


public class Child extends Parent {
	
	Child() 
	{
		System.out.println("Child");
	}
	
	void override1() throws IOException {
		System.out.println("parent - override");
	}
	
	

}
