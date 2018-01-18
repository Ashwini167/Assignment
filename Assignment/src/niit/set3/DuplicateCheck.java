package niit.set3;

import java.util.Scanner;

public class DuplicateCheck {

	public static void main(String[] args) {
		int numbers[] = new int[20];
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements to insert into an array: ");
		n = sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter element "+(i+1)+": ");
			numbers[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(numbers[i]==numbers[j] && (i!=j))
					System.out.println(numbers[i]+" is a duplicate element.");
			}
		}
	}
}
