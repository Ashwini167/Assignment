package niit.set2;

import java.util.Scanner;

public class FirstLetterCaps {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sentence, revised="";
		int stringLength;
		System.out.println("Enter the sentence: ");
		sentence = sc.nextLine();
		stringLength = sentence.length();
		sentence = sentence.toLowerCase();
		for(int i=0;i<stringLength;i++) {
			if(sentence.charAt(i)==' ') {
				revised=revised+" ";
				char temp = sentence.charAt(i+1);
				revised = revised+Character.toUpperCase(temp);
				i++;
			}
			else if(i==0)
				revised = revised+Character.toUpperCase(sentence.charAt(i));
			else
				revised=revised+(sentence.charAt(i));
		}
		
		System.out.println("The revised sentence is ------");
		System.out.println(revised);
	}

}
