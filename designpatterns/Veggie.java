package com.epam.DesignPattern;

public class Veggie implements Foodstyle{

	@Override
	public String prepareFood() {
		// TODO Auto-generated method stub
		return "Vegetarian";
	}

	@Override
	public double foodPrice() {
		// TODO Auto-generated method stub
		return 500.0;
	}

}
