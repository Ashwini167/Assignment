package niit.set2;

import java.util.Scanner;

public class IdentifyCharRepetition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sentence;
		char search;
		int stringLength, counter=0;
		System.out.println("Enter the sentence: ");
		sentence = sc.nextLine();
		System.out.println("Enter the character to be searched: ");
		search = sc.nextLine().charAt(0);
		stringLength = sentence.length();
		sentence = sentence.toLowerCase();
		for(int i=0;i<stringLength-1;i++) {	
			if(sentence.charAt(i)==search)
				counter++;
		}
		System.out.println("The number of words in the sentence is "+counter);
	}

}
