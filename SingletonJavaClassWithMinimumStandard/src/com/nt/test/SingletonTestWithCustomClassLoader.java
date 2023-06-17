package com.nt.test;

import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

import com.nt.singleton.Printer;

public class SingletonTestWithCustomClassLoader {

	public static void main(String[] args) {
		
		//Problem code with custom class loader 
		/*	
			//create object for Printer class using Application Class Loader
			Printer p=Printer.getInstance();
			//Printer1 p=Printer1.getInstance();
			Printer3 p=Printer3.getInstance();
			//create custom class loader
			try{
			URLClassLoader loader=new URLClassLoader(
					                         new URL[] {new URL("file:/d:/Proj01.jar")} , null);//null for no parent class loader specify
			//Class<?> clazz=loader.loadClass("com.nt.singleton.Printer");
			//Class<?> clazz=loader.loadClass("com.nt.singleton.Printer1");
			//Class<?> clazz=loader.loadClass("com.nt.singleton.Printer3");
			Method method=clazz.getDeclaredMethod("getInstance",new Class[] {});
			   Object obj=method.invoke(method, null);// null for no agrs method call
			   System.out.println(p.hashCode()+"  "+obj.hashCode());
			}catch(Exception e) {
				e.printStackTrace();
			}*/
		
		//create object for Printer class using Application Class Loader
				Printer p=Printer.getInstance(); 
				//Printer1 p=Printer1.getInstance();
				//Printer3 p=Printer3.getInstance();
				System.out.println("Current class loader::"+p.getClass().getClassLoader());
				//create custom class loader
				try{
				URLClassLoader loader=new URLClassLoader(
						                         new URL[] {new URL("file:/d:/Proj01.jar")} ,p.getClass().getClassLoader());//specify the parent Application class loader
				Class<?> clazz=loader.loadClass("com.nt.singleton.Printer");
				//Class<?> clazz=loader.loadClass("com.nt.singleton.Printer1");
				//Class<?> clazz=loader.loadClass("com.nt.singleton.Printer3");
				Method method=clazz.getDeclaredMethod("getInstance",new Class[] {});
				   Object obj=method.invoke(method, null);// null for no agrs method call
				   System.out.println(p.hashCode()+"  "+obj.hashCode());
				}catch(Exception e) {
					e.printStackTrace();
				}
		}
}
