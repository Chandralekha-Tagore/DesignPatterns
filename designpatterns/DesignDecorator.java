package com.epam.DesignPattern;
import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;  
public class DesignDecorator {  
	    private static int  choice;  
	    public static void main(String args[]) throws NumberFormatException, IOException    {  
	       do{        
	        System.out.print("========= Food Menu ============ \n");  
	        System.out.print("            1. Vegetarian Food.   \n");  
	        System.out.print("            2. Italian Food.         \n");  
	        System.out.print("            3. Exit                        \n");  
	        System.out.print("Enter your choice: ");  
	        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));   
	        choice=Integer.parseInt(br.readLine());  
	        switch (choice) {  
	        case 1:{   
	                 Veggie v=new Veggie();  
	              System.out.println(v.prepareFood());  
	              System.out.println( v.foodPrice());  
	            }  
	            break;  
	                 
	     case 2:{  
	             Foodstyle f2=new Italian((Foodstyle) new Veggie());  
	             System.out.println(f2.prepareFood());  
	             System.out.println( f2.foodPrice());  
	              }  
	            break; 
	              
	     default:{    
	            System.out.println("We are Sorry ,Other than these no food is available");  
	        }         
	    return;  
	     }  
	          
	}while(choice!=4);  
	    }  
	}  
