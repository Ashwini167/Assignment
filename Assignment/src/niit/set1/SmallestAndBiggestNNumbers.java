package niit.set1;

import java.util.Scanner;

public class SmallestAndBiggestNNumbers {
	Scanner sc = new Scanner(System.in); //to take user input
	
	void findSmallest(int n) {
		int temp = 0, var;
		for(int i=1;i<=n;i++) {
			System.out.println("Enter number " +i+": ");
			var = sc.nextInt();
			if(i==1)
				temp = var;
			else if(var<temp)
				temp = var;
		}
		System.out.println("The smallest value is "+temp);
	}
	
	void findLargest(int n) {
		int temp = 0, var;
		for(int i=1;i<=n;i++) {
			System.out.println("Enter number " +i+": ");
			var = sc.nextInt();
			if(i==1)
				temp = var;
			else if(var>temp)
				temp = var;
		}
		System.out.println("The largest value is "+temp);
	}
	
	public static void main(String[] args) {		
		int n, action;
		SmallestAndBiggestNNumbers obj = new SmallestAndBiggestNNumbers();
		
		System.out.println("Please select what you want to do: \n 1. Find smallest number \n 2. Find biggest number\n Enter your input: ");
		action = obj.sc.nextInt();
		
		System.out.println("How many numbers are to be compared?");
		n = obj.sc.nextInt();
		
		if(action==1)
			obj.findSmallest(n);
		else if(action==2)
			obj.findLargest(n);
	}
}
