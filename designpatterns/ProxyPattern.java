package com.epam.DesignPattern;

public class ProxyPattern {	
		   public static void main(String[] args) {
		      ProxyImage image = new ImageP("test_10mb.jpg");

		      //image will be loaded from disk
		      image.displayImage(); 
		      System.out.println("");
		      
		      //image will not be loaded from disk
		      image.displayImage(); 	
		   }
		}
