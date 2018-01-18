package niit.set2;

import java.util.Scanner;

public class StringReversal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String original, reversed="";
		int stringLength;
		System.out.println("Enter the string to be reversed: ");
		original = sc.nextLine();
		stringLength = original.length();
		for(int i=stringLength-1;i>=0;i--)
			reversed = reversed + original.charAt(i);
		System.out.println("The reversed string is "+reversed);
	}

}
