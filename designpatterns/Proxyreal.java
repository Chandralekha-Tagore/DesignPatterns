package com.epam.DesignPattern;

public class Proxyreal implements ProxyImage{
	
		   private String fileName;

		   public Proxyreal(String fileName){
		      this.fileName = fileName;
		      loadFromDisk(fileName);
		   }

		   public void displayImage() {
		      System.out.println("Displaying " + fileName);
		   }

		   private void loadFromDisk(String fileName){
		      System.out.println("Loading " + fileName);
		   }

		
		}

