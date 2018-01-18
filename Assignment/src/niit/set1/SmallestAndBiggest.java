package niit.set1;

import java.util.Scanner;

public class SmallestAndBiggest {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in); //to take user input
		int var1, var2, var3, action;
		
		System.out.println("Please select what you want to do: \n 1. Find smallest number \n 2. Find biggest number\n Enter your input: ");
		action = sc.nextInt();
		
		System.out.println("Enter the first number: ");
		var1 = sc.nextInt();
		System.out.println("Enter the second number: ");
		var2 = sc.nextInt();
		System.out.println("Enter the third number: ");
		var3 = sc.nextInt();
		
		SmallestAndBiggest obj = new SmallestAndBiggest();
		
		switch(action) {
		case 1:
			obj.findSmallest(var1, var2, var3); //calls the method to find the smallest number
			break;
		case 2:
			obj.findLargest(var1, var2, var3); //calls the method to find the largest number
			break;
		default: System.out.println("Invalid entry! You must choose either 1 or 2.");
			break;				
		}
	}
		
	void findSmallest(int var1, int var2, int var3) {
		if(var1<var2 && var1<var3)
			System.out.println(var1+" is the smallest of all three.");
		else if(var2<var3 && var2<var1)
			System.out.println(var2+" is the smallest of all three.");
		else
			System.out.println(var3+" is the smallest of all three.");				
	}
	
	void findLargest(int var1, int var2, int var3) {
		if(var1>var2 && var1>var3)
			System.out.println(var1+" is the largest of all three.");
		else if(var2>var3 && var2>var1)
			System.out.println(var2+" is the largest of all three.");
		else
			System.out.println(var3+" is the largest of all three.");
	}
}
