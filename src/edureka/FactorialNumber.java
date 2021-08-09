package edureka;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) { 
		int i,fact=1,number = 0; 
		
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Enter a number: ");    
		int num=scan.nextInt();;    
		
		for(number=1;number<=num;number++)
			 {    
			    fact=fact*number;    
			  }    
		System.out.printf("Factorial of " + num +  " is: " + fact);  
			}   
	}
