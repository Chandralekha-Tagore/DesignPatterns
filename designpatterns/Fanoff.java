package com.epam.DesignPattern;

public class Fanoff implements Order{
	
		Fan f;

		

		public Fanoff(Fan fan)

		{

			this.f = fan;

		}


	@Override
		public void execute() 

		{

			f.switchoff();

		}

		
}