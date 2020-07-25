package com.epam.DesignPattern;

public class ImageP implements ProxyImage{
		   private Proxyreal ri;
			//ri is for realImage
		   private String file_name;

		   public ImageP(String file_name){
		      this.file_name = file_name;
		   }

		   @Override
		   public void displayImage() {
		      if(ri == null){
		         ri = new Proxyreal(file_name);
		      }
		      ri.displayImage();
		   }
		}
