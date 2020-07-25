package com.epam.DesignPattern;

public abstract class Decoratorf implements Foodstyle{ 
	    private Foodstyle newFood;  
	    public Decoratorf(Foodstyle newFood)  {  
	        this.newFood=newFood;  
	    }  
	    @Override  
	    public String prepareFood(){  
	        return newFood.prepareFood();   
	    }  
	    public double foodPrice(){  
	        return newFood.foodPrice();  
	    }  
	}  
