package com.epam.DesignPattern;

public class Fanon implements Order{
	Fan f;

	

	public Fanon(Fan fan)

	{

		this.f = fan;

	}


@Override
	public void execute() 

	{

		f.switchon();

	}

	
}
