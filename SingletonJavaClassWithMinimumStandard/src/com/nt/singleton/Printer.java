package com.nt.singleton;

import com.nt.commons.CloningClassForSingleton;


public class Printer extends CloningClassForSingleton {

	/**
	 * 
	 */
	private static final long serialVersionUID = 0001L;
	private static Printer INSTANCE;
	private static boolean isInstanciated=false; 

	private Printer() {
		// System.out.println("0-param constructor");
	if (isInstanciated) {
		throw new RuntimeException("Object is already created");
		
	}
	else {
		isInstanciated=true;
	}
	
	}
	
	
//Solution for multithreading environment
	public static Printer getInstance() {
		System.out.println("Printer.getInstance() Outside Synchronized block :"+Thread.currentThread().getName());
		if (INSTANCE == null) {//1st null check
			synchronized (Printer.class) {
				System.out.println("Printer.getInstance() Inside Synchronized block :"+Thread.currentThread().getName());
				if (INSTANCE == null) {//2nd null check

					try {
						Thread.sleep(1000);

					} catch (Exception e) {
						e.printStackTrace();
					}
					INSTANCE = new Printer();
				}
			}
		}
		
		return INSTANCE;

	}
	//This is the 1st way to save singleton class from Clone 
	/*@Override
	public Object clone()throws CloneNotSupportedException {
		return INSTANCE;
	}*/
	
	//2nd way of save singleton class from Clone 
	
	//Solution for Cloning
	@Override//Best>>>
	public Object clone()throws CloneNotSupportedException {
		throw new CloneNotSupportedException("This singleton class is restricted for clone object");
	}

	//Solution for Serializaton and Deserialization
  public Object readResolve() {
	 return INSTANCE;
      }
  }
