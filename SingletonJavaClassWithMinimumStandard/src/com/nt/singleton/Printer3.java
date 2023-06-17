package com.nt.singleton;

public enum Printer3 {
	
	INSTANCE;
	
	public static Printer3 getInstance() {
		return INSTANCE;
	}
	
	//b. method
	 
	public void printMessage(String msg) {
		System.out.println("Your message is here :"+msg);
	}

}
