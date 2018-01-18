package niit.set2;

import java.util.Scanner;

public class NumberOfWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sentence;
		int stringLength, counter=0;
		System.out.println("Enter the sentence: ");
		sentence = sc.nextLine();
		stringLength = sentence.length();
		for(int i=0;i<stringLength-1;i++) {
			if(sentence.charAt(i)==' ')
				counter++;
		}
		counter+=1;
		System.out.println("The number of words in the sentence is "+counter);	
	}

}
