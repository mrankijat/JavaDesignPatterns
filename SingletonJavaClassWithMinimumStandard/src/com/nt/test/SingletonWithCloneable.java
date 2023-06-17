package com.nt.test;

import com.nt.singleton.Printer1;
import com.nt.singleton.Printer2;

public class SingletonWithCloneable {
	
	public static void main(String[] args) {
		/*Printer p1=Printer.getInstance();
		Printer p2=null;
		try {
			p2 = (Printer)p1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		System.out.println(p1.hashCode()+"=="+p2.hashCode());
		System.out.println("p1.hashCode()===p2.hashCode()"+(p1.hashCode()==p2.hashCode()));*/
		
		
		/*Printer1 p1=Printer1.getInstance();
		Printer1 p2=null;
		try {
			p2 = (Printer1)p1.clone();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(p1.hashCode()+"   "+p2.hashCode());
	*/	
		
	/*	Printer3 p1=Printer3.getInstance();
		Printer1 p2=null;
		try {
			p2 = (Printer1)p1.clone();//clone method is not visible in Printer3 class
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(p1.hashCode()+"   "+p2.hashCode());
		
	}*/
		
		Printer2 p1=Printer2.getInstance();
		Printer2 p2=null;
		try {
			p2 = (Printer2)p1.clone();//clone method is not visible in Printer3 class
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(p1.hashCode()+"   "+p2.hashCode());
	
	}
}
