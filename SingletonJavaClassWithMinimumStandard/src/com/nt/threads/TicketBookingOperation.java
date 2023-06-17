package com.nt.threads;

import com.nt.singleton.Printer2;
import com.nt.singleton.Printer3;

public class TicketBookingOperation implements Runnable {

	@Override
	public void run() {
		/*Printer p=Printer.getInstance();
		System.out.println(p.hashCode());*/
		
		/*Printer1 p=Printer1.getInstance();
		System.out.println(p.hashCode());*/
		
		/*	Printer3 p=Printer3.getInstance();
		System.out.println(p.hashCode());*/
		Printer2 p=Printer2.getInstance();
		System.out.println(p.hashCode());
	}

}
