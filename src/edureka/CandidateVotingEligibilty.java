package edureka;

import java.util.Scanner;

public class CandidateVotingEligibilty {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Enter the age of the person: ");
		int user_age=scan.nextInt();
		
		System.out.println("The age of persone is "  + user_age);
		
		if(user_age > 18)
		{
			System.out.println("You are eligible to vote.");
		}
		
		else {
			System.out.println("You are not eligible to vote.");
		}
		
	}

}
