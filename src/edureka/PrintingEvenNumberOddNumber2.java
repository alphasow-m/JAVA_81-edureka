package edureka;

public class PrintingEvenNumberOddNumber2 {

	public static void main(String[] args) {
		int i;
		int num1=10;
		int num2=11;
		System.out.println("Even numbers");
		for(i=0; i<=num1; i+=1)
		{
			System.out.println(num1);
			num1+=2;
		}
		
		System.out.println("Odd numbers");
		for(i=0; i<=num2; i+=1)
		{
			System.out.println(num2);
			num2+=2;
		}
	}

}
