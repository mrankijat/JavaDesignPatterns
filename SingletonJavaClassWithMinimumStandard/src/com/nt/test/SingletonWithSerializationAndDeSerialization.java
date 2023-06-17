package com.nt.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.nt.singleton.Printer2;
import com.nt.singleton.Printer3;

public class SingletonWithSerializationAndDeSerialization {

	/*
	public static void doSerialization(Printer printer) {
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("data.ser"))){
			oos.writeObject(printer);
			oos.flush();
			System.out.println("Serialization is done");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}*/
	
/*	public static Printer deSerialization() {
		 Printer p2=null;
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("data.ser"))){
			p2 = (Printer)ois.readObject();
	 System.out.println("DeSerialization is done");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return p2;
	}*/
	/*public static void main(String[] args) {
		Printer p1=Printer.getInstance();
		doSerialization(p1);
		Printer p2 = deSerialization();
		Printer p3=deSerialization();
		System.out.println(p1.hashCode()+"  "+p2.hashCode()+"  "+p3.hashCode());
	}
	*/
	/*public static void main(String[] args) {
		Printer2 p1=Printer2.getInstance();
		doSerialization(p1);
		Printer2 p2 = deSerialization();
		Printer2 p3=deSerialization();
		System.out.println(p1.hashCode()+"  "+p2.hashCode()+"  "+p3.hashCode());
	}*/
	
	
	
	

	/*	public static void doSerialization(Printer3 printer) {
			try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("data.ser"))){
				oos.writeObject(printer);
				oos.flush();
				System.out.println("Serialization is done");
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		public static Printer3 deSerialization() {
			 Printer3 p2=null;
			try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("data.ser"))){
				p2 = (Printer3)ois.readObject();
	 System.out.println("DeSerialization is done");
			}catch(Exception e) {
				e.printStackTrace();
			}
			return p2;
		}*/
	/*public static void main(String[] args) {
		Printer1 p1=Printer1.getInstance();
		doSerialization(p1);
		Printer1 p2 = deSerialization();
		Printer1 p3=deSerialization();
		System.out.println(p1.hashCode()+"  "+p2.hashCode()+"  "+p3.hashCode());
	}
	*/
	
	public static void doSerialization(Printer2 printer) {
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("data.ser"))){
			oos.writeObject(printer);
			oos.flush();
			System.out.println("Serialization is done");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Printer2 deSerialization() {
		 Printer2 p2=null;
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("data.ser"))){
			p2 = (Printer2)ois.readObject();
     System.out.println("DeSerialization is done");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return p2;
	}
	public static void main(String[] args) {
		Printer2 p1=Printer2.getInstance();
		doSerialization(p1);
		Printer2 p2 = deSerialization();
		Printer2 p3=deSerialization();
		System.out.println(p1.hashCode()+"  "+p2.hashCode()+"  "+p3.hashCode());
	}

}
