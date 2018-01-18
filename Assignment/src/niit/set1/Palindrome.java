package niit.set1;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number, temp, remainder, sum =0;
		System.out.println("Enter the number to be check for Palindrome conditions: ");
		number = sc.nextInt();
		temp = number;
		while(temp>0) {
			remainder = temp%10;
			temp = temp/10;
			sum = (sum*10)+remainder;			
		}
		if(sum==number)
			System.out.println("The number "+number+" is a Palindrome");
		else
			System.out.println("The number "+number+" is not a Palindrome");		
	}
}
