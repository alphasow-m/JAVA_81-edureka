package edureka;

public class PrintingEvenNumberOddNumber {

	public static void main(String[] args) {
		int i=0;
		int num1 = 10;
		int num2 = 11;
		System.out.println("Even numbers");
		while(i<=10)
		{
			System.out.println(num1);
			i+=1;
			num1+=2;
		}
		System.out.println("Odd numbers");
		
		while(i<=20)
		{
			System.out.println(num2);
			i+=1;
			num2+=2;
		}
	}

}
