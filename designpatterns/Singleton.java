package com.epam.DesignPattern;

public class Singleton {
	private static Singleton singleinstance;
	public void Singleton() {}
	public static Singleton getInstance() {
		if (singleinstance==null) {
			singleinstance=new Singleton();
		}
		return singleinstance;
	}


}
