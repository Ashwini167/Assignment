package niit.set1;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int number, flag=0;
		Scanner sc = new Scanner(System.in); //to take user input
		System.out.println("Enter the number that you want to check: ");
		number = sc.nextInt();
		for(int i=2; i<=number/2; ++i)
	    {
	        if(number%i==0)
	        {
	            flag=1;
	            break;
	        }
	    }		
		if(flag == 0)
			System.out.println(number+" is a prime number");
		else
			System.out.println(number+" is not a prime number");
	}

}
