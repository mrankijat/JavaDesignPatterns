package com.nt.test;

import com.nt.threads.TicketBookingOperation;

public class SingletonTest_MultiThreaded {

	public static void main(String[] args) throws InterruptedException {
	 TicketBookingOperation operation=new TicketBookingOperation();
	 Thread t1=new Thread(operation);
	 Thread t2=new Thread(operation);
	 Thread t3=new Thread(operation);
	 t1.start();
	 t2.start();
	 Thread.sleep(3000);
	 t3.start();
	}

}
