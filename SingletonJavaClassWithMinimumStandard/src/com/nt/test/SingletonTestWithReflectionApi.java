package com.nt.test;

import java.lang.reflect.Constructor;

import com.nt.singleton.Printer2;
import com.nt.singleton.Printer3;

public class SingletonTestWithReflectionApi {

	public static void main(String[] args) throws ClassNotFoundException {
		/*Printer p=Printer.getInstance();
		Class c=Class.forName("com.nt.singleton.Printer");
		Constructor cons[]=c.getDeclaredConstructors();
		cons[0].setAccessible(true);
		Printer p1 = null;
		Printer p2 = null;
		try {
			p1 = (Printer) cons[0].newInstance();	
			p2=(Printer) cons[0].newInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(p.hashCode()+"  "+p1.hashCode()+"  "+p2.hashCode());
		}
		*/
	
	
		/*Printer3 p=Printer3.getInstance();
		Class c=Class.forName("com.nt.singleton.Printer3");
		Constructor cons[]=c.getDeclaredConstructors();
		cons[0].setAccessible(true);
		Printer3 p1 = null;
		Printer3 p2 = null;
		try {
			p1 = (Printer3) cons[0].newInstance();	
			p2=(Printer3) cons[0].newInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(p.hashCode()+"  "+p1.hashCode()+"  "+p2.hashCode());
		}*/

	Printer2 p=Printer2.getInstance();
	Class c=Class.forName("com.nt.singleton.Printer2");
	Constructor cons[]=c.getDeclaredConstructors();
	cons[0].setAccessible(true);
	Printer2 p1 = null;
	Printer2 p2 = null;
	try {
		p1 = (Printer2) cons[0].newInstance();	
		p2=(Printer2) cons[0].newInstance();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println(p.hashCode()+"  "+p1.hashCode()+"  "+p2.hashCode());
}

}
