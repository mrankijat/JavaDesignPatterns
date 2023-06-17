package com.nt.singleton;

import com.nt.commons.CloningClassForSingleton;


public class Printer2 extends CloningClassForSingleton {

	/**
	 * 
	 */
	private static final long serialVersionUID = 0001L;
	private static boolean isInstantiated=false;
	
	public Printer2() {
		// System.out.println("0-param constructor");
		if (isInstantiated) {
			throw new RuntimeException("Object already created");
		}else 
			isInstantiated=true;
	}
	
	private static class Printer2Inner{
		private static Printer2 INSTANCE=new Printer2();
	}
	
	public static Printer2 getInstance() {
		return Printer2Inner.INSTANCE;
	}


	
	//This is the 1st way to save singleton class from Clone 
	@Override
	public Object clone()throws CloneNotSupportedException {
		return Printer2Inner.INSTANCE;
	}
	
	//2nd way of save singleton class from Clone 
	
	//Solution for Cloning
	/*@Override//Best>>>
	public Object clone()throws CloneNotSupportedException {
		throw new CloneNotSupportedException("This singleton class is restricted for clone object");
	}*/
	
	//Solution for Serializaton and Deserialization
	public Object readResolve() {
	 return Printer2Inner.INSTANCE;
	  }
	
  }
