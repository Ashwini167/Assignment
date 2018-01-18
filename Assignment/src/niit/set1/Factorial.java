package niit.set1;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		long factorial = 1;
		System.out.println("Enter any number between 1 to 10: ");
		number = sc.nextInt();
		for(int i=1;i<=number;i++)
			factorial*=i;
		System.out.println("Factorial of "+number+" is "+factorial);
	}
}
