package com.nt.commons;

import java.io.Serializable;

public class CloningClassForSingleton implements Cloneable,Serializable{
 
	@Override
	public Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
}
