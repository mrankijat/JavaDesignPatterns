package com.nt.singleton;

import javax.management.RuntimeErrorException;

import com.nt.commons.CloningClassForSingleton;

public class Printer1 extends CloningClassForSingleton {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static boolean isInstiated;

	private Printer1() {
		
		if (isInstiated) {
			throw new RuntimeException("object already created");
		}
		System.out.println("0-param constructor");
		isInstiated=true;
	}

	public static Printer1 INSTANCE;
	
	public static Printer1 getInstance() {
		if (INSTANCE==null) {
			synchronized (Printer1.class) {
				if(INSTANCE==null) {
					    INSTANCE=new Printer1();
			       }
				}
		}
		return INSTANCE;
	}//method
	
	
	//Solution for clonning
	@Override
	public Object clone() {
		throw new RuntimeException("This class is restricted for cloning");
	}
	
	//Solution for Serialization and Deserialization
	
	public Object readResolve() {
		return INSTANCE;
	}
}//class
