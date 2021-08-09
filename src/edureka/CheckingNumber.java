package edureka;

import java.util.Scanner;

public class CheckingNumber {

	public static void main(String[] args) {
		int number1;
		
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Enter the number: ");
		int number11=scan.nextInt();
		
		System.out.println("The age of persone is "  + number11);
		
		if(number11 > 0)
		{
			System.out.println("This is a positive number.");
		}
		
		else {
			System.out.println("This is a negative number.");
		}
	}

}
