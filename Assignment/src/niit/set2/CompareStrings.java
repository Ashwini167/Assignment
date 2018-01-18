package niit.set2;

import java.util.Scanner;

public class CompareStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string1, string2;
		System.out.println("Enter the two strings to be compared: ");
		string1 = sc.nextLine();
		string2 = sc.nextLine();
		if(string1.equals(string2))
			System.out.println("Both strings are equal");
		else
			System.out.println("The entered strings are not equal");		
	}

}
