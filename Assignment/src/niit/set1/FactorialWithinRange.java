package niit.set1;

import java.util.Scanner;

public class FactorialWithinRange {
	public void findFactorial(int number) {
		long factorial = 1;
		for(int i=1;i<=number;i++)
			factorial*=i;
		System.out.println("Factorial of "+number+" is "+factorial);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FactorialWithinRange obj = new FactorialWithinRange();
		int lower, upper;
		System.out.println("Enter the upper (max 10) and lower (min 1) limits one by one: ");
		lower = sc.nextInt();
		upper = sc.nextInt();
		while(lower<=upper) {	
			obj.findFactorial(lower);
			lower++;
		}
	}

}
