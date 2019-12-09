package com.kishor.serialization;

public class TwoWheeler extends Vehicle {

	public String twoname="Twowheeler";
	
	TwoWheeler(String name) {
		System.out.println("name");
	}
	
	TwoWheeler() {
		
	}
	
	@Override
	public String toString() {
		
		return super.toString() + twoname + " end " ;
	}
}
