package edureka;

import java.util.Scanner;

public class CheckingNumberInThreeFactor {

	public static void main(String[] args) {
		int number1;
		
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Enter the number: ");
		int number11=scan.nextInt();
		
		System.out.println("The age of persone is "  + number11);
		
		if(number11>0)
		{
			System.out.println(number11 + " is a positive number.");
		}
		
		else if (number11<0)
		{
			System.out.println(number11 + " is a negative number.");
		}
		else
		{
			System.out.println("It is Zero");
		}
		
	}

}
  