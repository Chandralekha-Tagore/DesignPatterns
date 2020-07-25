package com.epam.DesignPattern;

public class Italian extends Decoratorf{    
	    public Italian(Foodstyle fs) {  
	        super(fs);  
	    }  
	    public String prepareFood(){  
	        return super.prepareFood() +" With Roasted Chiken and Chiken Curry  ";   
	    }  
	    public double foodPrice()   {  
	        return super.foodPrice()+150.0;  
	    }  
	}
