package com.nt.test;

import com.nt.singleton.Printer2;

public class SingletonTest {

	public static void main(String[] args) {
		/*Printer p1=Printer.getInstance();
		Printer p2=Printer.getInstance();	
		System.out.println("p1==p2?"+(p1==p2));
		System.out.println(p1.hashCode()+ " "+p2.hashCode());
		System.out.println("p1.hashCode()==p2.hashCode()?"+(p1.hashCode()==p2.hashCode()));*/
		
		/*	
			Printer1 p1=Printer1.getInstance();
			Printer1 p2=Printer1.getInstance();	
			System.out.println("p1==p2?"+(p1==p2));
			System.out.println(p1.hashCode()+ " "+p2.hashCode());*/
		
		
			Printer2 p1=Printer2.getInstance();
			Printer2 p2=Printer2.getInstance();	
			System.out.println("p1==p2?"+(p1==p2));
			System.out.println(p1.hashCode()+ " "+p2.hashCode());
	
		
		/*Printer3 p1=Printer3.getInstance();
		Printer3 p2=Printer3.getInstance();	
		System.out.println("p1==p2?"+(p1==p2));
		System.out.println(p1.hashCode()+ " "+p2.hashCode());*/
	}

}
