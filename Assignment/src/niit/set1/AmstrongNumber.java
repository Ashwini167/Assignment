package niit.set1;

import java.util.Scanner;

public class AmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number, quotient, remainder, sum =0;
		System.out.println("Enter the number to be check for Amstrong number conditions: ");
		number = sc.nextInt();
		quotient = number;
		while(quotient>0) {
			remainder = quotient%10;
			quotient = quotient/10;
			sum = (sum)+(remainder*remainder*remainder);			
		}
		if(sum==number)
			System.out.println("The number "+number+" is an Amstrong Number");
		else
			System.out.println("The number "+number+" is not an Amstrong Number");

	}

}
