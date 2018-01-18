package niit.set2;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String original, reversed="";
		int stringLength;
		System.out.println("Enter the string to be checked: ");
		original = sc.nextLine();
		original = original.toLowerCase();
		stringLength = original.length();
		for(int i=stringLength-1;i>=0;i--)
			reversed = reversed + original.charAt(i);
		if(original.equals(reversed))
			System.out.println("The string is a palindrome.");
		else
			System.out.println("The string is not a palindrome.");
	}

}
