package edureka;

import java.util.Scanner;

public class ArithmeticOperations {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

        System.out.println("Enter any two positive integer numbers:");
        
		// Reading data
        int a = in.nextInt();
        int b = in.nextInt();
        int sum, sub, mul;
        float div;

        sum = a + b;
        sub = a - b;
        mul = a * b;
        div = a / b;
        

        System.out.println("\nSUM         " + a + " + " + b + " = " + sum);
        System.out.println("DIFFERENCE  " + a + " - " + b + " = " + sub);
        System.out.println("PRODUCT     " + a + " * " + b + " = " + mul);
        System.out.println("QUOTIENT    " + a + " / " + b + " = " + div);
	}

}
